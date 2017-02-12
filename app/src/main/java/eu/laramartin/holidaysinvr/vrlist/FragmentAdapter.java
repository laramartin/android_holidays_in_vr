package eu.laramartin.holidaysinvr.vrlist;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import eu.laramartin.holidaysinvr.data.JapanList;
import eu.laramartin.holidaysinvr.data.VrItem;
import eu.laramartin.holidaysinvr.vr.VrType;

/**
 * Created by lara on 12.02.17.
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;
    private List<VrItem> list = new ArrayList<>();

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        new JapanList().initList(list);
    }

    @Override
    public Fragment getItem(int position) {
        VrItem item = list.get(position);
        switch (item.getType()) {
            default:
            case VrType.PICTURE:
                return VrPicFragment.newInstance(item);
            case VrType.VIDEO:
                return VrVideoFragment.newInstance(item);
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return context.getString(list.get(position).getTitle());
    }
}