package eu.laramartin.holidaysinvr.vrlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import eu.laramartin.holidaysinvr.R;
import eu.laramartin.holidaysinvr.data.VrItem;

/**
 * Created by lara on 12.02.17.
 */
public abstract class VrFragment extends Fragment {
    private Unbinder unbinder;

    @BindView(R.id.text_title)
    TextView textTitle;

    @BindView(R.id.text_description)
    TextView textDescription;


    protected VrItem vrItem;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayout(), container, false);
        unbinder = ButterKnife.bind(this, view);
        Bundle args = getArguments();
        vrItem = args.getParcelable("item");
        if (vrItem != null) {
            textTitle.setText(vrItem.getTitle());
            textDescription.setText(vrItem.getDescription());
        }
        return view;
    }

    protected abstract int getLayout();


    @Override
    public void onDestroyView() {
        unbinder.unbind();
        super.onDestroyView();
    }
}
