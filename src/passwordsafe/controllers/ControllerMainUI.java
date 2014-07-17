/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package passwordsafe.controllers;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import passwordsafe.models.ModelMainUI;
import passwordsafe.ui.JFrameMainUI;
import passwordsafe.ui.JPanelViewEntry;

/**
 *
 * @author RESEARCH2
 */
public class ControllerMainUI {

    private final ModelMainUI model;
    private final JFrameMainUI view;
    private GridBagConstraints gbc = new GridBagConstraints();
    private JPanelViewEntry entries = new JPanelViewEntry();

    public ControllerMainUI(ModelMainUI model, JFrameMainUI view) {
        this.model = model;
        this.view = view;
        gbc.weightx = 1.0;        
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        initPanelsGridbag();
    }

    private void initPanelsGridbag() {
        Color jpBgColor = entries.getBackground();
        String[] cats = {"Social", "Online", "Shopping", "Emails", "Others"};
        for (int y = 0; y < cats.length; y++) {
            entries = new JPanelViewEntry();
            entries.initButtonEvents(new ActionHandler());
            if (y > 0) {
                addGB(view.getjPanelEntriesHolder(), new JSeparator(), 0, y);                
            }
            entries.getjLabelCategory().setText(cats[y]);
            entries.getjPanelCategory().setBackground(new Color(y*10, y*33, y*44));
            addGB(view.getjPanelEntriesHolder(), entries, 0, y);
        }
        
    }

    private void addGB(Container cont, Component comp, int x, int y) {
        if (!(cont.getLayout() instanceof GridBagLayout)) {
            cont.setLayout(new GridBagLayout());
        }
        gbc.gridx = x;
        gbc.gridy = y;
        cont.add(comp, gbc);
    }    

    private class ActionHandler implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == entries.getjButtonShowPass()) {
                //entries.getjPasswordFieldPassword().setEchoChar((char) 0);
                System.out.println("am clicked");
            }
        }
        
    }    
}
