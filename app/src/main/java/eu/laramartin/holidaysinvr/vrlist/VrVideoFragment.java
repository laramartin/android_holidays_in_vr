package eu.laramartin.holidaysinvr.vrlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.vr.sdk.widgets.video.VrVideoView;

import java.io.IOException;

import butterknife.BindView;
import eu.laramartin.holidaysinvr.R;
import eu.laramartin.holidaysinvr.data.VrItem;

/**
 * Created by lara on 12.02.17.
 */

public class VrVideoFragment extends VrFragment {

    @BindView(R.id.video_view)
    VrVideoView videoView;

    public static Fragment newInstance(VrItem vrItem) {
        VrFragment f = new VrVideoFragment();
        Bundle args = new Bundle();
        args.putParcelable("item", vrItem);
        f.setArguments(args);
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        try {
            videoView.loadVideoFromAsset(vrItem.getAssetName(), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (videoView != null) {
            if (isVisibleToUser) {
                videoView.playVideo();
            } else {
                videoView.pauseVideo();
            }
        }
    }

    @Override
    protected int getLayout() {
        return R.layout.view_vr_item_video;
    }

    @Override
    public void onPause() {
        super.onPause();
        videoView.pauseRendering();
    }

    @Override
    public void onResume() {
        super.onResume();
        videoView.resumeRendering();
    }

    @Override
    public void onDestroyView() {
        videoView.shutdown();
        super.onDestroyView();
    }
}
