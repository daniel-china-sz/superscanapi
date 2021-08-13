package fu.dan.qi.superscan.api;

import java.io.Closeable;
import java.util.function.Consumer;

public interface ICamera extends Closeable {

    String id();

    String displayName();

    int maxSpeed();


    void open();

    boolean isOpen();

    void shoot();

    void recording(Consumer<byte[]> consumer);


    byte[] imageBuffer();
    /**
     * 黑白传感器
     */
    boolean isMonochromatic();


    Resolution currentResolution();
}
