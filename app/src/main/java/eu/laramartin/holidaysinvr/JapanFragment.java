package eu.laramartin.holidaysinvr;

/**
 * Created by lara on 12.02.17.
 */
public class JapanFragment extends VrListFragment {
    @Override
    protected ListFactory getListFactory() {
        return new JapanList();
    }
}
