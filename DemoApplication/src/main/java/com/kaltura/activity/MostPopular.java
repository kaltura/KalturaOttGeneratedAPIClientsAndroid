package com.kaltura.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.kaltura.bar.ActionBar;
import com.kaltura.boxAdapter.BoxAdapterAllEntries;
import com.kaltura.client.enums.MediaType;
import com.kaltura.client.types.APIException;
import com.kaltura.client.types.MediaEntry;
import com.kaltura.client.types.MediaEntryFilter;
import com.kaltura.client.utils.response.OnCompletion;
import com.kaltura.components.GridForLand;
import com.kaltura.components.GridForPort;
import com.kaltura.enums.States;
import com.kaltura.mediatorActivity.TemplateActivity;
import com.kaltura.services.Media;
import com.kaltura.utils.SearchTextEntry;
import com.kaltura.utils.Sort;
import com.kaltura.utils.Utils;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

public class MostPopular extends TemplateActivity implements Observer {

    private List<MediaEntry> listEntries;
    private List<MediaEntry> copyEntries;
    private BoxAdapterAllEntries gridAllEntries;
    private EditText etSearch;
    private SearchTextEntry searchText;
    private MediaEntry mostPlaysEntry;
    private RelativeLayout rl_category;
    private DownloadListCatigoriesTask downloadTask;
    private View search;
    private Bitmap mostPlaysBimap;
    private int width;
    private int height;
    private ProgressBar pb_loading;
    private LinearLayout ll_base;
    private List<GridForPort> content;
    private int sizeListentry;
    private boolean isFinish = true;
    private int orientation;
    private View itemTopRight;
    private List<GridForLand> contentLand;
    private List<GridForPort> contentPort;
    private MediaEntry rightTopEntry;
    private Bitmap rightTopBimap;
    private boolean listCategoriesIsLoaded = false;
    private Activity activity;
    private List<ImageView> view;
    private List<ProgressBar> progressBar;
    private int count = 0;
    int k = 0;

    public MostPopular() {
        listEntries = new ArrayList<MediaEntry>();
        copyEntries = new ArrayList<MediaEntry>();
        searchText = new SearchTextEntry();
        searchText.addObserver(this);
        downloadTask = new DownloadListCatigoriesTask();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(R.layout.category);
        Configuration c = getResources().getConfiguration();
        orientation = c.orientation;

        activity = this;

        Log.w(TAG, "create orien3: " + getScreenOrientation() + " " + orientation);

        setView();

        ll_base = (LinearLayout) findViewById(R.id.ll_base);
        rl_category.setVisibility(View.INVISIBLE);
        if (bar != null) {
            bar.setVisibleSearchButon(View.GONE);
            bar.setTitle(getText(R.string.most_popular));
            bar.setVisibleBackButton(View.INVISIBLE);
        }

        switch (orientation) {
            case Configuration.ORIENTATION_PORTRAIT:
            case Configuration.ORIENTATION_UNDEFINED:
            case Configuration.ORIENTATION_SQUARE:
                width = display.getWidth() / 2;
                height = display.getWidth() / 2;
                downloadTask.execute();
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                search.setVisibility(View.GONE);
                bar.setVisibleSearchButon(View.VISIBLE);
                width = display.getHeight() / 2;
                height = display.getHeight() / 2;
                downloadTask.execute();
                break;
            default:
                break;
        }

        if (determineScreenSize() == Configuration.SCREENLAYOUT_SIZE_UNDEFINED) {
            finish();
        }



    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.category);
        this.orientation = newConfig.orientation;

        ll_base = (LinearLayout) findViewById(R.id.ll_base);
        setView();
        rl_category.setVisibility(View.INVISIBLE);
        if (listCategoriesIsLoaded) {
            searchText.init(TAG, etSearch, listEntries);
            etSearch.addTextChangedListener(searchText);
            updateData(listEntries);
        }

        switch (orientation) {
            case Configuration.ORIENTATION_PORTRAIT:
            case Configuration.ORIENTATION_UNDEFINED:
            case Configuration.ORIENTATION_SQUARE:
                search.setVisibility(View.VISIBLE);
                if (bar != null) {
                    bar.setVisibleSearchButon(View.GONE);
                    bar.setVisibleBackButton(View.INVISIBLE);
                    bar.setTitle(getText(R.string.most_popular));
                }
                width = display.getWidth() / 2;
                height = display.getWidth() / 2;
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                search.setVisibility(View.GONE);
                if (bar != null) {
                    bar.setVisibleSearchButon(View.VISIBLE);
                    bar.setVisibleBackButton(View.INVISIBLE);
                    bar.setTitle(getText(R.string.most_popular));
                }
                width = display.getHeight() / 2;
                height = display.getHeight() / 2;
                break;
            default:
                break;
        }

        Log.w(TAG, "create orien3: " + getScreenOrientation() + " " + orientation);
    }

    private void setView() {
        rl_category = (RelativeLayout) findViewById(R.id.rl_category);
        etSearch = (EditText) findViewById(R.id.et_search);
        bar = new ActionBar(this, TAG);
        search = findViewById(R.id.search);
        pb_loading = (ProgressBar) findViewById(R.id.pb_loading);
        ll_base = (LinearLayout) findViewById(R.id.ll_base);
        itemTopRight = (View) findViewById(R.id.right_top_item);
    }

    /**
     * Called to process touch screen events.
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_MOVE:
                if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                    //Hide the keyboard on the screen of a finger        	
                    // imm.hideSoftInputFromWindow(getWindow().getCurrentFocus().getWindowToken(), 0);
                }
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_MENU:
                getActivityMediator().showMain();
                finish();
                break;
            case KeyEvent.KEYCODE_BACK:
                Log.w(TAG, "Click on Back button");
                try {
                    finalize();
                } catch (Throwable ex) {
                    Logger.getLogger(MostPopular.class.getName()).log(Level.SEVERE, null, ex);
                }
                finish();
                break;
            default:
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_bar_menu:
                ll_base.removeAllViewsInLayout();
                getActivityMediator().showMain();
                try {
                    finalize();
                } catch (Throwable ex) {
                    Logger.getLogger(MostPopular.class.getName()).log(Level.SEVERE, null, ex);
                }
                finish();
                break;
            case R.id.iv_thumbnail:
                getActivityMediator().showInfo(mostPlaysEntry.getId(), getString(R.string.most_popular));
                break;
            case R.id.iv_bar_search:
                if (search.getVisibility() == View.GONE) {
                    search.setVisibility(View.VISIBLE);
                } else {
                    search.setVisibility(View.GONE);
                }
                break;
            default:
                break;
        }
    }

    private class DownloadListCatigoriesTask extends AsyncTask<Void, States, List<MediaEntry>> {

        private String message;

        @Override
        protected List<MediaEntry> doInBackground(Void... params) {
            final CountDownLatch doneSignal = new CountDownLatch(1);
            // Test for connection
            try {
                if (Utils.checkInternetConnection(getApplicationContext())) {
                    /**
                     * Getting list of all entries category
                     */
                    publishProgress(States.LOADING_DATA);
                    /**
                     * Getting list of all entries category
                     */
                    MediaEntryFilter filter = new MediaEntryFilter();
                    filter.setMediaTypeEqual(MediaType.VIDEO);
                    Media.listAllEntriesByIdCategories(TAG, filter, 1, 500, new OnCompletion<List<MediaEntry>>() {
                        @Override
                        public void onComplete(List<MediaEntry> response, APIException error) {
                            listEntries = response;
                            listCategoriesIsLoaded = true;
                            doneSignal.countDown();
                        }
                    });
                }
                Log.w(TAG, "thread is end");
            } catch (Exception e) {
                e.printStackTrace();
                message = e.getMessage();
                Log.w(TAG, message);
                publishProgress(States.NO_CONNECTION);
            }

            try {
                doneSignal.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return listEntries;
        }

        @Override
        protected void onPostExecute(List<MediaEntry> listCategory) {
            progressDialog.hide();
            if (listEntries.size() != 0) {
                searchText.init(TAG, etSearch, listEntries);
                etSearch.addTextChangedListener(searchText);
                updateData(listEntries);
            }
        }

        @Override
        protected void onProgressUpdate(States... progress) {
            for (States state : progress) {
                if (state == States.LOADING_DATA) {
                    progressDialog.hide();
                    showProgressDialog("Loading data...");
                }
                if (state == States.NO_CONNECTION) {
                    progressDialog.hide();
                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private void ImageLoader() {
        Log.w(TAG, "Start image loader");
        float scale = (float) display.getWidth() / (float) display.getHeight();
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .cacheInMemory().cacheOnDisc().build();

        // This configuration tuning is custom. You can tune every option, you may tune some of them, 
        // or you can create default configuration by
        //  ImageLoaderConfiguration.createDefault(this);
        // method.
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(activity)
                .threadPoolSize(3).threadPriority(Thread.NORM_PRIORITY - 2).memoryCacheSize(150000000) // 150 Mb
                .discCacheSize(50000000) // 50 Mb
                .denyCacheImageMultipleSizesInMemory().defaultDisplayImageOptions(options).build();
        // Initialize ImageLoader with configuration.
        ImageLoader.getInstance().init(config);
        imageLoader.init(config);

        final List<String> url = new ArrayList<String>();
        view = new ArrayList<ImageView>();
        progressBar = new ArrayList<ProgressBar>();
        url.add(mostPlaysEntry.getThumbnailUrl() + "/width/" + new Integer(display.getWidth()).toString() + "/height/" + new Integer(250).toString());
        ImageView thumb = ((ImageView) findViewById(R.id.iv_thumbnail));
        thumb.getLayoutParams().width = display.getWidth();
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            thumb.getLayoutParams().height = (int) (display.getWidth() * scale);
        } else {
            thumb.getLayoutParams().height = display.getHeight() - 200;
        }
        thumb.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.add(thumb);
        progressBar.add(pb_loading);

        if (orientation == Configuration.ORIENTATION_LANDSCAPE && rightTopEntry != null) {
            url.add(rightTopEntry.getThumbnailUrl() + "/width/" + new Integer(250/*
                     * display.getWidth()
                     */).toString() + "/height/" + new Integer(250/*
                     * display.getHeight()/2
                     */).toString());
            Log.w(TAG, "set last bitmap");
            thumb = ((ImageView) itemTopRight.findViewById(R.id.iv_thumbnail));
            thumb.getLayoutParams().width = display.getWidth();
            if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                thumb.getLayoutParams().height = (int) (display.getWidth() * scale);
            } else {
                thumb.getLayoutParams().height = display.getHeight() - 200;
            }
            thumb.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.add(thumb);
            progressBar.add(pb_loading);

            thumb.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Log.w(TAG, "click on thumb");
                    getActivityMediator().showInfo(rightTopEntry.getId(), "Most Popular");
                }
            });
        }

        for (MediaEntry entry : copyEntries) {
            url.add(entry.getThumbnailUrl() + "/width/" + new Integer(250/*
                     * display.getWidth()/2
                     */).toString() + "/height/" + new Integer(250/*
                     * display.getWidth()/2
                     */).toString());
        }
        count = 0;
        for (String string : url) {
            Log.w(TAG, "url: " + count++ + " " + string);
        }

        int state = 0;
        count = 0;
        for (int j = 0; j < copyEntries.size(); j++) {

            switch (orientation) {
                case Configuration.ORIENTATION_PORTRAIT:
                    switch (state) {
                        case 0:
                            //left
                            Log.w(TAG, "xl: " + count);
                            view.add(contentPort.get(count).getLeftItemGrid().getThumb());
                            progressBar.add(contentPort.get(count).getLeftItemGrid().getProgressBar());//.setVisibility(View.GONE);
                            state = 2;
                            break;
                        case 2:
                            //right
                            Log.w(TAG, "xr: " + count);
                            view.add(contentPort.get(count).getRightItemGrid().getThumb());
                            progressBar.add(contentPort.get(count).getRightItemGrid().getProgressBar());
                            count++;
                            state = 0;
                            break;
                    }
                    break;
                case Configuration.ORIENTATION_LANDSCAPE:
                    switch (state) {
                        case 0:
                            //left
                            Log.w(TAG, "xl: " + count);
                            view.add(contentLand.get(count).getLeftItemGrid().getThumb());
                            progressBar.add(contentLand.get(count).getLeftItemGrid().getProgressBar());
                            state = 1;
                            break;
                        case 1:
                            //center
                            Log.w(TAG, "xc: " + count);
                            view.add(contentLand.get(count).getCenterItemGrid().getThumb());
                            progressBar.add(contentLand.get(count).getCenterItemGrid().getProgressBar());
                            state = 2;
                            break;
                        case 2:
                            //right
                            Log.w(TAG, "xr: " + count);
                            view.add(contentLand.get(count).getRightItemGrid().getThumb());
                            progressBar.add(contentLand.get(count).getRightItemGrid().getProgressBar());
                            count++;
                            state = 0;
                            break;
                    }
                    break;
                default:
                    break;
            }
        }

        count = 0;
        Log.w(TAG, "size: " + progressBar.size());
        k = 0;
        for (String string : url) {
            imageLoader.displayImage(string, view.get(count), new ImageLoadingListener() {

                @Override
                public void onLoadingStarted(String imageUri, View view) {
                    // do nothing
                    Log.w(TAG, "onLoadingStarted");
                }

                @Override
                public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                    Log.w(TAG, "onLoadingFailed");
                    imageLoader.clearMemoryCache();
                    imageLoader.clearDiscCache();
                }

                @Override
                public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                    // do nothing
                    if (k < progressBar.size()) {
                        progressBar.get(k++).setVisibility(View.GONE);
                    }
                    Log.w(TAG, "onLoadingComplete: " + k);

                    Log.w(TAG, "k<>size: " + k + "--" + url.size());
                    if (k >= url.size()) {
                        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
                    }
                }

                @Override
                public void onLoadingCancelled(String imageUri, View view) {
                    Log.w(TAG, "onLoadingCancelled");
                }
            });
            count++;
        }

    }

    private void updateData(List<MediaEntry> listEntries) {
        copyEntries = new ArrayList<MediaEntry>();
        copyEntries.addAll(listEntries);

        if (copyEntries.size() > 0) {
            sizeListentry = copyEntries.size();
            for (MediaEntry MediaEntry : copyEntries) {
                Log.w(TAG, "before sort: " + MediaEntry.getPlays());
            }
            Collections.sort(copyEntries, new Sort<MediaEntry>("plays", "reverse"));
            for (MediaEntry MediaEntry : copyEntries) {
                Log.w(TAG, "after sort: " + MediaEntry.getPlays());
            }
            mostPlaysEntry = copyEntries.get(0);
            copyEntries.remove(mostPlaysEntry);
            addContentLastEntry();
        } else {
            rl_category.setVisibility(View.GONE);
        }

        switch (orientation) {
            case Configuration.ORIENTATION_PORTRAIT:
                Log.w(TAG, "start in port");
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                createGridForPort();
                if (listEntries.size() > 0) {
                    ImageLoader();
                }
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                if (listEntries.size() > 1) {
                    itemTopRight.setVisibility(View.VISIBLE);
                    rightTopEntry = copyEntries.get(0);
                    ((TextView) itemTopRight.findViewById(R.id.tv_name)).setText(rightTopEntry.getName());
                    ((TextView) itemTopRight.findViewById(R.id.tv_episode)).setText(Utils.durationInSecondsToString(rightTopEntry.getDuration()));
                    copyEntries.remove(0);
                } else {
                    itemTopRight.setVisibility(View.GONE);
                }
                createGridForLand();
                Log.w(TAG, "start in land");
                if (listEntries.size() > 0) {
                    ImageLoader();
                }
                break;
            default:
                break;
        }
    }

    private void createGridForPort() {
        Log.w(TAG, "grid for port");
        ll_base.removeAllViewsInLayout();
        if (copyEntries.size() > 0) {
            contentPort = new ArrayList<GridForPort>();
            Log.w(TAG, "size: " + copyEntries.size());
            int countConent = copyEntries.size() / 2;
            Log.w(TAG, "countConent: " + countConent);
            int rest = copyEntries.size() % 2;
            Log.w(TAG, "rest: " + rest);

            if (rest != 0) {
                countConent = countConent + 1;
                Log.w(TAG, "countConent: " + countConent);
            }

            //Create countContent contents
            int offset = 0;
            int size = copyEntries.size();

            if (size > 2) {
                Log.w(TAG, "1 offset: " + offset);
                contentPort.add(new GridForPort(TAG, this, offset));
                size = size - 2;
                for (int i = 0; i < countConent - 1; i++) {
                    offset = offset + 2;
                    size = size - 2;
                    Log.w(TAG, "3 offset: " + offset);
                    contentPort.add(new GridForPort(TAG, this, offset));
                }
            } else {
                Log.w(TAG, "2 offset: " + 0);
                contentPort.add(new GridForPort(TAG, this, 0));
            }

            float scale = (float) display.getWidth() / (float) display.getHeight();
            //set params
            for (final GridForPort templateContent : contentPort) {
                ll_base.addView(templateContent.getRowGrid());

                if (templateContent.getOffset() + 0 < copyEntries.size()) {
                    templateContent.getLeftItemGrid().getName().setText(copyEntries.get(templateContent.getOffset() + 0).getName());
                    templateContent.getLeftItemGrid().getEpisode().setText(Utils.durationInSecondsToString(copyEntries.get(templateContent.getOffset() + 0).getDuration()));
                    templateContent.getLeftItemGrid().getThumb().getLayoutParams().width = display.getWidth() / 2;
                    templateContent.getLeftItemGrid().getThumb().getLayoutParams().height = (int) (display.getWidth() / 2 * scale);
                    templateContent.getLeftItemGrid().getThumb().setScaleType(ImageView.ScaleType.CENTER_CROP);
                    templateContent.getLeftItemGrid().setKey(copyEntries.get(templateContent.getOffset() + 0));
                } else {
                    Log.w(TAG, "no right element");
                }
                if (templateContent.getOffset() + 1 < copyEntries.size()) {
                    templateContent.getRightItemGrid().getName().setText(copyEntries.get(templateContent.getOffset() + 1).getName());
                    templateContent.getRightItemGrid().getEpisode().setText(Utils.durationInSecondsToString(copyEntries.get(templateContent.getOffset() + 1).getDuration()));
                    templateContent.getRightItemGrid().getThumb().getLayoutParams().width = this.width;
                    templateContent.getRightItemGrid().getThumb().getLayoutParams().height = (int) (display.getWidth() / 2 * scale);
                    templateContent.getRightItemGrid().getThumb().setScaleType(ImageView.ScaleType.CENTER_CROP);
                    templateContent.getRightItemGrid().setKey(copyEntries.get(templateContent.getOffset() + 1));
                } else {
                    Log.w(TAG, "no right element");
                    templateContent.getRightItemGrid().getThumb().setVisibility(View.INVISIBLE);
                    templateContent.getRightItemGrid().getProgressBar().setVisibility(View.INVISIBLE);
                    templateContent.getRightItemGrid().getName().setVisibility(View.INVISIBLE);
                    templateContent.getRightItemGrid().getEpisode().setVisibility(View.INVISIBLE);
                }

                templateContent.getLeftItemGrid().getThumb().setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {

                        if (templateContent.getOffset() + 0 < copyEntries.size()) {
                            getActivityMediator().showInfo(copyEntries.get(templateContent.getOffset() + 0).getId(), "Most Popular");
                            Log.w(TAG, "click first" + templateContent.getOffset());
                        }
                    }
                });
                templateContent.getRightItemGrid().getThumb().setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        Log.w(TAG, "click second");
                        if (templateContent.getOffset() + 1 < copyEntries.size()) {
                            getActivityMediator().showInfo(copyEntries.get(templateContent.getOffset() + 1).getId(), "Most Popular");
                            Log.w(TAG, "click first" + templateContent.getOffset() + 1);
                        }
                    }
                });
            }
        } else {
            Log.w(TAG, "list size is 0");
        }
    }

    private void createGridForLand() {
        Log.w(TAG, "grid for land");
        ll_base.removeAllViewsInLayout();
        if (copyEntries.size() > 0) {
            contentLand = new ArrayList<GridForLand>();
            Log.w(TAG, "size: " + copyEntries.size());
            int countConent = copyEntries.size() / 3;
            Log.w(TAG, "countConent: " + countConent);
            int rest = copyEntries.size() % 3;
            Log.w(TAG, "rest: " + rest);

            if (rest != 0) {
                countConent = countConent + 1;
                Log.w(TAG, "countConent: " + countConent);
            }

            //Create countContent contents
            int offset = 0;
            int size = copyEntries.size();

            if (size > 3) {
                Log.w(TAG, "1 offset: " + offset);
                contentLand.add(new GridForLand(TAG, this, offset));
                size = size - 3;
                for (int i = 0; i < countConent - 1; i++) {
                    offset = offset + 3;
                    size = size - 3;
                    Log.w(TAG, "3 offset: " + offset);
                    contentLand.add(new GridForLand(TAG, this, offset));
                }
            } else {
                Log.w(TAG, "2 offset: " + 0);
                contentLand.add(new GridForLand(TAG, this, 0));
            }

            float scale = (float) display.getHeight() / (float) display.getWidth();
            //set params
            for (final GridForLand templateContent : contentLand) {
                ll_base.addView(templateContent.getRowGrid());

                if (templateContent.getOffset() + 0 < copyEntries.size()) {
                    templateContent.getLeftItemGrid().getName().setText(copyEntries.get(templateContent.getOffset() + 0).getName());
                    templateContent.getLeftItemGrid().getEpisode().setText(Utils.durationInSecondsToString(copyEntries.get(templateContent.getOffset() + 0).getDuration()));
                    templateContent.getLeftItemGrid().getThumb().getLayoutParams().width = display.getWidth() / 3;
                    templateContent.getLeftItemGrid().getThumb().getLayoutParams().height = (int) (display.getWidth() / 3 * scale);
                    templateContent.getLeftItemGrid().getThumb().setScaleType(ImageView.ScaleType.CENTER_CROP);
                    templateContent.getLeftItemGrid().setKey(copyEntries.get(templateContent.getOffset() + 0));
                } else {
                    Log.w(TAG, "no left element");
                }

                if (templateContent.getOffset() + 1 < copyEntries.size()) {
                    templateContent.getCenterItemGrid().getName().setText(copyEntries.get(templateContent.getOffset() + 1).getName());
                    templateContent.getCenterItemGrid().getEpisode().setText(Utils.durationInSecondsToString(copyEntries.get(templateContent.getOffset() + 1).getDuration()));
                    templateContent.getCenterItemGrid().getThumb().getLayoutParams().width = display.getWidth() / 3;
                    templateContent.getCenterItemGrid().getThumb().getLayoutParams().height = (int) (display.getWidth() / 3 * scale);
                    templateContent.getCenterItemGrid().getThumb().setScaleType(ImageView.ScaleType.CENTER_CROP);
                    templateContent.getCenterItemGrid().setKey(copyEntries.get(templateContent.getOffset() + 1));
                } else {
                    Log.w(TAG, "no center element");
                    templateContent.getCenterItemGrid().getThumb().setVisibility(View.INVISIBLE);
                    templateContent.getCenterItemGrid().getProgressBar().setVisibility(View.INVISIBLE);
                    templateContent.getCenterItemGrid().getName().setVisibility(View.INVISIBLE);
                    templateContent.getCenterItemGrid().getEpisode().setVisibility(View.INVISIBLE);
                }

                if (templateContent.getOffset() + 2 < copyEntries.size()) {
                    templateContent.getRightItemGrid().getName().setText(copyEntries.get(templateContent.getOffset() + 2).getName());
                    templateContent.getRightItemGrid().getEpisode().setText(Utils.durationInSecondsToString(copyEntries.get(templateContent.getOffset() + 2).getDuration()));
                    templateContent.getRightItemGrid().getThumb().getLayoutParams().width = display.getWidth() / 3;
                    templateContent.getRightItemGrid().getThumb().getLayoutParams().height = (int) (display.getWidth() / 3 * scale);
                    templateContent.getRightItemGrid().getThumb().setScaleType(ImageView.ScaleType.CENTER_CROP);
                    templateContent.getRightItemGrid().setKey(copyEntries.get(templateContent.getOffset() + 2));
                } else {
                    Log.w(TAG, "no right element");
                    templateContent.getRightItemGrid().getThumb().setVisibility(View.INVISIBLE);
                    templateContent.getRightItemGrid().getProgressBar().setVisibility(View.INVISIBLE);
                    templateContent.getRightItemGrid().getName().setVisibility(View.INVISIBLE);
                    templateContent.getRightItemGrid().getEpisode().setVisibility(View.INVISIBLE);
                }


                templateContent.getLeftItemGrid().getThumb().setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {

                        if (templateContent.getOffset() + 0 < copyEntries.size()) {
                            getActivityMediator().showInfo(copyEntries.get(templateContent.getOffset() + 0).getId(), "Most Popular");
                            Log.w(TAG, "click first" + templateContent.getOffset());
                        }
                    }
                });
                templateContent.getCenterItemGrid().getThumb().setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {

                        if (templateContent.getOffset() + 0 < copyEntries.size()) {
                            getActivityMediator().showInfo(copyEntries.get(templateContent.getOffset() + 0).getId(), "Most Popular");
                            Log.w(TAG, "click first" + templateContent.getOffset());
                        }
                    }
                });
                templateContent.getRightItemGrid().getThumb().setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        Log.w(TAG, "click second");
                        if (templateContent.getOffset() + 1 < copyEntries.size()) {
                            getActivityMediator().showInfo(copyEntries.get(templateContent.getOffset() + 1).getId(), "Most Popular");
                            Log.w(TAG, "click first" + templateContent.getOffset() + 1);
                        }
                    }
                });
            }
        } else {
            Log.w(TAG, "list size is 0");
        }
    }

    private void addContentLastEntry() {

        Log.w(TAG, "sizeListentry: " + sizeListentry);
        if (sizeListentry != 0) {
            rl_category.setVisibility(View.VISIBLE);
            try {
                ((TextView) findViewById(R.id.tv_name)).setText(mostPlaysEntry.getName());
                ((TextView) findViewById(R.id.tv_episode)).setText("");
                ((TextView) findViewById(R.id.tv_duration)).setText(Utils.durationInSecondsToString(mostPlaysEntry.getDuration()));
            } catch (Exception e) {
                e.printStackTrace();
                Log.w(TAG, "err: " + e.getMessage());
            }
        }
    }

    @Override
    public void update(Observable paramObservable, Object paramObject) {
        updateData((List<MediaEntry>) paramObject);
    }
}
