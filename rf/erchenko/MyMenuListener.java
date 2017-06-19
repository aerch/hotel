package rf.erchenko;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * Created by 1 on 19.11.2016.
 */
class MyMenuListener implements MenuListener {

    @Override
    public void menuSelected(MenuEvent e) {
        //System.out.println("menuSelected");
        Hotel.mframe.getJMenuBar().getMenu(2).setSelected(false);
        SettingsDialog.main();
    }

    @Override
    public void menuDeselected(MenuEvent e) {
        //System.out.println("menuDeselected");
    }

    @Override
    public void menuCanceled(MenuEvent e) {
        //System.out.println("menuCanceled");
    }
}