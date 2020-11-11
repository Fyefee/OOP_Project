package Controllers;

import View.MainJFrame;
import View.MenuJPanel;

import javax.swing.*;
import java.awt.event.*;

public class MenuController implements ActionListener {

    private MenuJPanel menuJPanel;
    private JButton menu_button_play;

    public MenuController() {
        this.menuJPanel = new MenuJPanel(this);
        setComponents();
    }

    public JPanel getMenuJPanel(){
        return menuJPanel;
    }

    private void setComponents(){
        this.menu_button_play = menuJPanel.getMenu_button_play();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(menu_button_play)){
            MainJFrameController.getMainJFrame().getC_frame().show(MainJFrameController.getMainJFrame().getAll_card_panel(), "GAME");
        }
    }
}
