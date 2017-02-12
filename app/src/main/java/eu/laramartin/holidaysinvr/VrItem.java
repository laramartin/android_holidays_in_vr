package eu.laramartin.holidaysinvr;

import android.support.annotation.RawRes;
import android.support.annotation.StringRes;

import com.google.auto.value.AutoValue;

/**
 * Created by lara on 12.02.17.
 */

@AutoValue
public abstract class VrItem {
    @StringRes
    public abstract int getTitle();

    public abstract int getType();

    @StringRes
    public abstract int getDescription();

    @RawRes
    public abstract int getResId();

    public abstract String getAssetName();

    public static Builder builder() {
        return new AutoValue_VrItem.Builder()
                .setAssetName("");
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setTitle(int newTitle);

        public abstract Builder setType(int newType);

        public abstract Builder setDescription(int newDescription);

        public abstract Builder setResId(int newResId);

        public abstract Builder setAssetName(String newAssetName);

        public abstract VrItem build();
    }
}
