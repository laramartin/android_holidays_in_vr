package eu.laramartin.holidaysinvr;

/**
 * Created by lara on 12.02.17.
 */
public class KoreaFragment extends VrListFragment {
    @Override
    protected ListFactory getListFactory() {
        return new KoreaList();
    }
}
