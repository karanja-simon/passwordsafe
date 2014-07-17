/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package passwordsafe;

import passwordsafe.controllers.ControllerMainUI;
import passwordsafe.models.ModelMainUI;
import passwordsafe.ui.JFrameMainUI;

/**
 *
 * @author RESEARCH2
 */
public class PasswordSafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrameMainUI mainUi = new JFrameMainUI();
        ModelMainUI modelUi = new ModelMainUI();
        ControllerMainUI controller = new ControllerMainUI(modelUi, mainUi);
        mainUi.setVisible(true);
    }
    
}
