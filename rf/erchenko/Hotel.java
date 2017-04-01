/**
 * Created by 1 on 12.09.2016.
 */
package rf.erchenko;

import java.lang.*;

public class Hotel {
    // <editor-fold defaultstate="collapsed" desc="Example">
    // </editor-fold>
    public static HotelRegService hrs;
    public static MainFrame mframe;
    private static final String version = "Меблированные комнаты  [ версия 16.11.19.0.2 ]";

    public static String getVersion() {
        return version;
    }

    public static void main(String[] args) {
        hrs = new HotelRegService();
        MainFrame.runMainFrame();
        // <editor-fold defaultstate="collapsed" desc="Garbage">
        // </editor-fold>
    }
}
