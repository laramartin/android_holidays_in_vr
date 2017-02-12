package eu.laramartin.holidaysinvr.vrlist;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

import butterknife.BindView;
import eu.laramartin.holidaysinvr.R;
import eu.laramartin.holidaysinvr.data.VrItem;

/**
 * Created by lara on 12.02.17.
 */

public class VrPicFragment extends VrFragment {

    @BindView(R.id.pano_view)
    VrPanoramaView panoView;

    private Bitmap bitmap;
    private ImageLoaderTask imageLoaderTask;

    public static Fragment newInstance(VrItem vrItem) {
        VrFragment f = new VrPicFragment();
        Bundle args = new Bundle();
        args.putParcelable("item", vrItem);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onResume() {
        super.onResume();
        imageLoaderTask = new ImageLoaderTask(panoView.getContext()) {

            @Override
            protected void onPostExecute(Bitmap bitmap) {
                panoView.loadImageFromBitmap(bitmap, null);
                VrPicFragment.this.bitmap = bitmap;
            }
        };
        imageLoaderTask.execute(vrItem.getResId());
    }

    @Override
    public void onPause() {
        super.onPause();
        if (imageLoaderTask != null) {
            imageLoaderTask.cancel(true);
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override
    protected int getLayout() {
        return R.layout.view_vr_item_pic;
    }
}
