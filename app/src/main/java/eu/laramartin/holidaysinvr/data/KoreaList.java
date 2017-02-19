package eu.laramartin.holidaysinvr.data;

import java.util.List;

import eu.laramartin.holidaysinvr.R;
import eu.laramartin.holidaysinvr.vr.VrType;

/**
 * Created by lara on 12.02.17.
 */
public class KoreaList implements ListFactory {
    @Override
    public void initList(List<VrItem> list) {
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.bukchon_hanok_village)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.gwanghwamun_gate)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.gwanghwamun_square)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.hondae_day)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.hongdae_noche)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.namdemun_gate_sungnyemun_gate)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.restaurante)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.royal_palace1)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.royal_palace2)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.royal_palace3)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.royal_palace4)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.royal_palace5)
                .setType(VrType.PICTURE)
                .build());
    }
}
