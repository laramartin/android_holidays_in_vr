package eu.laramartin.holidaysinvr.vrlist;

import eu.laramartin.holidaysinvr.data.JapanList;
import eu.laramartin.holidaysinvr.data.ListFactory;

/**
 * Created by lara on 12.02.17.
 */
public class JapanFragment extends VrListFragment {
    @Override
    protected ListFactory getListFactory() {
        return new JapanList();
    }
}
