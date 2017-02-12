package eu.laramartin.holidaysinvr;

import android.content.Context;

import java.util.List;

/**
 * Created by lara on 12.02.17.
 */
public class JapanList {
    public static void initList(List<VrItem> list, Context context) {
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa)
                .setResId(R.raw.pic_360)
                .setType(VrType.PICTURE)
                .build());
    }
}
