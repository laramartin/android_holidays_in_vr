package eu.laramartin.holidaysinvr.vrlist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

import java.lang.ref.WeakReference;

/**
 * Created by lara on 12.02.17.
 */

public class ImageLoaderTask extends AsyncTask<Integer, Void, Bitmap> {
    private WeakReference<Context> context;

    public ImageLoaderTask(Context context) {
        this.context = new WeakReference<>(context);
    }

    @Override
    protected Bitmap doInBackground(Integer... params) {
        Resources resources = context.get().getResources();
        return BitmapFactory.decodeResource(resources, params[0]);
    }
}
