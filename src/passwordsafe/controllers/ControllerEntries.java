/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordsafe.controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JPanel;
import passwordsafe.models.ModelEntries;
import passwordsafe.ui.JPanelViewEntry;

/**
 *
 * @author RESEARCH2
 */
public class ControllerEntries {

    private final ModelEntries model;
    private final JPanelViewEntry view;
    private ArrayList<String> categories;
    private HashMap catColorMap;

    public ControllerEntries(ModelEntries model, JPanelViewEntry view) {
        this.model = model;
        this.view = view;
        this.categories = new ArrayList<>();
        this.catColorMap = new HashMap();
        addCategories();
        matchCategoryByColor();
        view.initButtonEvents(new ActionHandler());
    }

    private void addCategories() {
        categories.add("Social");
        categories.add("Emails");
        categories.add("Online");
        categories.add("Shopping");
        categories.add("Others");
    }

    private void matchCategoryByColor() {
        catColorMap.put("Social", new Color(233, 12, 11));
        catColorMap.put("Emails", new Color(209, 128, 118));
        catColorMap.put("Online", new Color(233, 12, 91));
        catColorMap.put("Shopping", new Color(43, 162, 71));
        catColorMap.put("Others", new Color(93, 192, 110));

    }

    public JPanel initViewPanel() {
//        // Get a set of the entries
//        Set set = catColorMap.entrySet();
//        // Get an iterator
//        Iterator i = set.iterator();
//        // Display elements
//        while (i.hasNext()) {
//            Map.Entry me = (Map.Entry) i.next();
//            System.out.print(me.getKey() + ": ");
//            System.out.println(me.getValue());
//            view.getjLabelCategory().setText(me.getKey().toString());
//            view.getjPanelCategory().setBackground((Color) me.getValue());
//            
//        }
        return view.getjPanelCategory();
    }
    private class ActionHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource() == view.getjButtonShowPass())
           {
               view.getjPasswordFieldPassword().setEchoChar((char) 0);
               System.out.println("am clicked");
           }
        }
        
    }

}
