package eu.laramartin.holidaysinvr.vrlist;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;
import com.google.vr.sdk.widgets.video.VrVideoEventListener;
import com.google.vr.sdk.widgets.video.VrVideoView;

import java.io.IOException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import eu.laramartin.holidaysinvr.R;
import eu.laramartin.holidaysinvr.data.VrItem;
import eu.laramartin.holidaysinvr.vr.VrType;

/**
 * Created by lara on 12.02.17.
 */
public class VrItemAdapter extends RecyclerView.Adapter<VrItemAdapter.VrItemVH> {
    private final Context context;
    private final List<VrItem> list;

    public VrItemAdapter(Context context, List<VrItem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public VrItemVH onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        switch (viewType) {
            case VrType.PICTURE:
                return new VrItemPic(inflater.inflate(R.layout.view_vr_item_pic, parent, false));
            case VrType.VIDEO:
                return new VrItemVideo(inflater.inflate(R.layout.view_vr_item_video, parent, false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(VrItemVH holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getType();
    }

    @Override
    public void onViewRecycled(VrItemVH holder) {
        holder.recycle();
    }

    public static abstract class VrItemVH extends RecyclerView.ViewHolder {

        @BindView(R.id.text_title)
        TextView textTitle;


        @BindView(R.id.text_description)
        TextView textDescription;

        public VrItemVH(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bind(VrItem vrItem) {
            textTitle.setText(vrItem.getTitle());
            textDescription.setText(vrItem.getDescription());
            loadPano(vrItem);
        }

        protected abstract void loadPano(VrItem vrItem);

        public abstract void recycle();
    }

    public static class VrItemPic extends VrItemVH {

        @BindView(R.id.pano_view)
        VrPanoramaView panoView;

        Bitmap bitmap = null;

        public VrItemPic(View itemView) {
            super(itemView);
        }

        @Override
        protected void loadPano(VrItem vrItem) {
            new ImageLoaderTask(panoView.getContext()) {

                @Override
                protected void onPostExecute(Bitmap bitmap) {
                    panoView.loadImageFromBitmap(bitmap, null);
                    VrItemPic.this.bitmap = bitmap;
                }
            }.execute(vrItem.getResId());
            //byte[] jpegImageData = VrUtils.getRawImageBytes(vrItem, itemView.getContext());
            //panoView.loadImageFromByteArray(jpegImageData, null);
        }

        @Override
        public void recycle() {
            panoView.loadImageFromBitmap(null, null);
            if (bitmap != null) {
                bitmap.recycle();
                bitmap = null;
            }
        }
    }

    public static class VrItemVideo extends VrItemVH {

        @BindView(R.id.video_view)
        VrVideoView videoView;
        private boolean isPaused = false;

        public VrItemVideo(View itemView) {
            super(itemView);
        }

        @Override
        protected void loadPano(VrItem vrItem) {
            try {
                videoView.loadVideoFromAsset(vrItem.getAssetName(), null);
                videoView.pauseVideo();
                isPaused = false;
                videoView.setEventListener(new VrVideoEventListener() {
                    @Override
                    public void onClick() {
                        if (isPaused) {
                            videoView.playVideo();
                        } else {
                            videoView.pauseVideo();
                        }
                        isPaused = !isPaused;
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void recycle() {
            videoView.pauseRendering();
        }
    }
}
