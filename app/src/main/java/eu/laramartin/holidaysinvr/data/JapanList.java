package eu.laramartin.holidaysinvr.data;

import java.util.List;

import eu.laramartin.holidaysinvr.R;
import eu.laramartin.holidaysinvr.vr.VrType;

/**
 * Created by lara on 12.02.17.
 */
public class JapanList implements ListFactory {
    public void initList(List<VrItem> list) {
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa)
                .setResId(R.raw.pic_360)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa)
                .setAssetName("20170119_190114.mp4")
                .setType(VrType.VIDEO)
                .build());
    }
}
