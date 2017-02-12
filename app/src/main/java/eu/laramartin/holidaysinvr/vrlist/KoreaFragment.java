package eu.laramartin.holidaysinvr.vrlist;

import eu.laramartin.holidaysinvr.data.KoreaList;
import eu.laramartin.holidaysinvr.data.ListFactory;

/**
 * Created by lara on 12.02.17.
 */
public class KoreaFragment extends VrListFragment {
    @Override
    protected ListFactory getListFactory() {
        return new KoreaList();
    }
}
