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
                .setTitle(R.string.title_jp_airbnb)
                .setDescription(R.string.description_jp_airbnb)
                .setResId(R.drawable.airbnb)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_akihabara)
                .setDescription(R.string.description_jp_akihabara)
                .setResId(R.drawable.aki1)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_akihabara)
                .setDescription(R.string.description_jp_akihabara)
                .setResId(R.drawable.aki2)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_akihabara)
                .setDescription(R.string.description_jp_akihabara_plaza)
                .setResId(R.drawable.aki3)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_akihabara)
                .setDescription(R.string.description_jp_akihabara_plaza)
                .setResId(R.drawable.aki4)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_akihabara)
                .setDescription(R.string.description_jp_akihabara)
                .setAssetName("akihabara.mp4")
                .setType(VrType.VIDEO)
                .build());
//        list.add(VrItem.builder()
//                .setTitle(R.string.title_jp_asakusa)
//                .setDescription(R.string.description_jp_asakusa)
//                .setResId(R.drawable.asakusa1)
//                .setType(VrType.PICTURE)
//                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_entrada_templo)
                .setResId(R.drawable.asakusa2)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_incienso)
                .setResId(R.drawable.asakusa3)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_escaleras_templo)
                .setResId(R.drawable.asakusa4)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_ritual)
                .setResId(R.drawable.asakusa5)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_escaleras_templo)
                .setResId(R.drawable.asakusa6)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_asakusa)
                .setDescription(R.string.description_jp_asakusa_entrada_templo)
                .setResId(R.drawable.asakusa7)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_akihabara)
                .setDescription(R.string.description_jp_akihabara)
                .setAssetName("asakusa.mp4")
                .setType(VrType.VIDEO)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_cafe)
                .setDescription(R.string.description_jp_cafe)
                .setResId(R.drawable.cafe)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_museo)
                .setDescription(R.string.description_jp_museo_casa)
                .setResId(R.drawable.casa_japo)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_potato)
                .setDescription(R.string.description_jp_potato)
                .setResId(R.drawable.chuches)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_potato)
                .setDescription(R.string.description_jp_potato)
                .setResId(R.drawable.potato3)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_potato)
                .setDescription(R.string.description_jp_potato)
                .setResId(R.drawable.potato1)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_potato)
                .setDescription(R.string.description_jp_potato)
                .setResId(R.drawable.potato2)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_akihabara)
                .setDescription(R.string.description_jp_akihabara)
                .setAssetName("arcade.mp4")
                .setType(VrType.VIDEO)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_curry)
                .setDescription(R.string.description_jp_curry)
                .setResId(R.drawable.curry)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_curry)
                .setDescription(R.string.description_jp_curry)
                .setResId(R.drawable.curry2)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_akihabara)
                .setDescription(R.string.description_jp_akihabara)
                .setAssetName("sushi.mp4")
                .setType(VrType.VIDEO)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_airbnb)
                .setDescription(R.string.description_jp_futon)
                .setResId(R.drawable.futon)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_gundams)
                .setDescription(R.string.description_jp_gundams)
                .setResId(R.drawable.gundams)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_harajuku)
                .setDescription(R.string.description_jp_harajuku)
                .setResId(R.drawable.harajuku1)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_harajuku)
                .setDescription(R.string.description_jp_harajuku)
                .setResId(R.drawable.harajuku2)
                .setType(VrType.PICTURE)
                .build());
//        list.add(VrItem.builder()
//                .setTitle(R.string.title_jp_asakusa)
//                .setDescription(R.string.description_jp_asakusa_incienso)
//                .setResId(R.drawable.juguetes)
//                .setType(VrType.PICTURE)
//                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_mandarake)
                .setDescription(R.string.description_jp_mandarake)
                .setResId(R.drawable.mandarake1)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_mandarake)
                .setDescription(R.string.description_jp_mandarake)
                .setResId(R.drawable.mandarake2)
                .setType(VrType.PICTURE)
                .build());
//        list.add(VrItem.builder()
//                .setTitle(R.string.title_jp_museo)
//                .setDescription(R.string.description_jp_museo)
//                .setResId(R.drawable.museo1)
//                .setType(VrType.PICTURE)
//                .build());
//        list.add(VrItem.builder()
//                .setTitle(R.string.title_jp_museo)
//                .setDescription(R.string.description_jp_museo)
//                .setResId(R.drawable.museo2)
//                .setType(VrType.PICTURE)
//                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_museo)
                .setDescription(R.string.description_jp_museo)
                .setResId(R.drawable.museo3)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_nakano)
                .setDescription(R.string.description_jp_nakano)
                .setResId(R.drawable.nakano1)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_nakano)
                .setDescription(R.string.description_jp_nakano)
                .setResId(R.drawable.nakano2)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_okonomiyaki)
                .setDescription(R.string.description_jp_okonomiyaki)
                .setResId(R.drawable.oko)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_pokemon)
                .setDescription(R.string.description_jp_pokemon)
                .setResId(R.drawable.pokemon)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_stickers)
                .setDescription(R.string.description_jp_stickers)
                .setResId(R.drawable.stickers)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_tren)
                .setDescription(R.string.description_jp_tren)
                .setResId(R.drawable.tren)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_videojuegos)
                .setDescription(R.string.description_jp_videojuegos)
                .setResId(R.drawable.yodobashi)
                .setType(VrType.PICTURE)
                .build());
        list.add(VrItem.builder()
                .setTitle(R.string.title_jp_akihabara)
                .setDescription(R.string.description_jp_akihabara)
                .setAssetName("taiko.mp4")
                .setType(VrType.VIDEO)
                .build());
    }
}
