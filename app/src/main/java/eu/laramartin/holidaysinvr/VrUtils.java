package eu.laramartin.holidaysinvr;

import android.content.Context;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lara on 12.02.17.
 */

public class VrUtils {
    private static VrPanoramaView.Options viewOptions = new VrPanoramaView.Options();
    public static VrPanoramaView.Options pictureOptions() {
        viewOptions.inputType = VrPanoramaView.Options.TYPE_STEREO_OVER_UNDER;
        return viewOptions;
    }

    public static byte[] getRawImageBytes(VrItem vrItem, Context context) {
        InputStream inStream = context.getResources().openRawResource(vrItem.getResId());
        try {
            byte[] jpegImageData = new byte[inStream.available()];
            DataInputStream dataIs = new DataInputStream(inStream);
            dataIs.readFully(jpegImageData);
            return jpegImageData;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }
}