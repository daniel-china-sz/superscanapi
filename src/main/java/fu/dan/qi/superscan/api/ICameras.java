package fu.dan.qi.superscan.api;

import java.util.List;

public interface ICameras {

    List<ICamera> cameras();

    ICamera get(long key);

}
