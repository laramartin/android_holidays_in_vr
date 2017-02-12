package eu.laramartin.holidaysinvr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lara on 12.02.17.
 */
public class JapanFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<VrItem> list = new ArrayList<>();
        JapanList.initList(list, getContext());

        VrItemAdapter adapter = new VrItemAdapter(getActivity(), list);
        View view = inflater.inflate(R.layout.fragment_vr_list, container, false);
//        ListView listView = (ListView) view.findViewById(R.id.listView);
//        listView.setAdapter(adapter);

        return view;
    }
}
