package eu.laramartin.holidaysinvr;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

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
        View view = inflater.inflate(R.layout.view_vr_item, parent, false);
        return new VrItemVH(view);
    }

    @Override
    public void onBindViewHolder(VrItemVH holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class VrItemVH extends RecyclerView.ViewHolder {

        @BindView(R.id.text_title)
        TextView textTitle;

        @BindView(R.id.pano_view)
        VrPanoramaView panoView;

        @BindView(R.id.text_description)
        TextView textDescription;

        public VrItemVH(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bind(VrItem vrItem) {
            textTitle.setText(vrItem.getTitle());
            textDescription.setText(vrItem.getDescription());
            byte[] jpegImageData = VrUtils.getRawImageBytes(vrItem, itemView.getContext());
            panoView.loadImageFromByteArray(jpegImageData, VrUtils.pictureOptions());
        }
    }
}
