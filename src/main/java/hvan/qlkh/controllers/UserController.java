/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hvan.qlkh.controllers;

import com.toedter.calendar.JDateChooser;
import hvan.qlkh.services.UserServices;
import hvan.qlkh.utils.TextField;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author PC
 */
public class UserController {
    
    private static UserController instance;
    private static JPanel toolbar;
    private static JPanel navbar;
    private static Map<String, Integer> toolbarMap = new HashMap<>();
    private static Map<String, Integer> navbarMap = new HashMap<>();
    
    public static UserController getInstance(){
        if (instance == null){
            instance = new UserController();
        }
        return instance;
    }

    private UserController() {
    }
    
    private void setComponetsMap(){
        for (int i = 0; i < toolbar.getComponentCount(); i++) {
            toolbarMap.put(toolbar.getComponent(i).getName(), i);
        }
        for (int i = 0; i < navbar.getComponentCount(); i++) {
            navbarMap.put(navbar.getComponent(i).getName(), i);
        }
    }
    
    public void initMain(){
        setComponetsMap();
        if (UserServices.getInstance().getCurrentUser().getUsername().equals("admin")){
            navbar.getComponent(navbarMap.get("Navbar__ButtonAuthorization")).setVisible(true);
        }
        else{
            navbar.getComponent(navbarMap.get("Navbar__ButtonAuthorization")).setVisible(false);
        }

        if (!UserServices.getInstance().getCurrentUser().isWrite()) {
            for (int i = 0; i < toolbar.getComponentCount(); i++) {
                if (toolbar.getComponent(i).getClass().equals(TextField.class)){
                    ((TextField)toolbar.getComponent(i)).setEditable(false);
                    ((TextField)toolbar.getComponent(i)).setEnabled(false);
                }
                if (toolbar.getComponent(i).getClass().equals(JDateChooser.class)){
                    ((JDateChooser) toolbar.getComponent(i)).setEnabled(false);
                }
                if (toolbar.getComponent(i).getClass().equals(JComboBox.class)){
                    ((JComboBox) toolbar.getComponent(i)).setEnabled(false);
                }
                if (toolbar.getComponent(i).getClass().equals(JScrollPane.class)){
                    ((JScrollPane)toolbar.getComponent(i)).getViewport().getView().setEnabled(false);
                }
                if (toolbar.getComponent(i).getName() != null) {
                    if (toolbar.getComponent(i).getName().equals("Toolbar__ButtonFileChooser")) {
                        toolbar.getComponent(i).setEnabled(false);
                    }
                    if (toolbar.getComponent(i).getName().toLowerCase().contains("search") ||
                        toolbar.getComponent(i).getName().toLowerCase().contains("sort")) {
                        toolbar.getComponent(i).setEnabled(true);
                        if (toolbar.getComponent(i).getClass().equals(TextField.class)){
                            ((TextField)toolbar.getComponent(i)).setEditable(true);
                        }
                    }
                }
            }
        }
        else{
            for (int i = 0; i < toolbar.getComponentCount(); i++) {
                if (toolbar.getComponent(i).getClass().equals(TextField.class)){
                    ((TextField)toolbar.getComponent(i)).setEditable(true);
                    ((TextField)toolbar.getComponent(i)).setEnabled(true);
                }
                if (toolbar.getComponent(i).getClass().equals(JDateChooser.class)){
                    ((JDateChooser) toolbar.getComponent(i)).setEnabled(true);
                }
                if (toolbar.getComponent(i).getClass().equals(JComboBox.class)){
                    ((JComboBox) toolbar.getComponent(i)).setEnabled(true);
                    ((JComboBox) toolbar.getComponent(i)).setBackground(Color.white);
                }
                if (toolbar.getComponent(i).getClass().equals(JScrollPane.class)){
                    ((JScrollPane)toolbar.getComponent(i)).getViewport().getView().setEnabled(true);
                }
                if (toolbar.getComponent(i).getName() != null) {
                    if (toolbar.getComponent(i).getName().equals("Toolbar__ButtonFileChooser")) {
                        toolbar.getComponent(i).setEnabled(true);
                    }
                }
            }
        }
    }

    public static void setComponents(JPanel ToolBar, JPanel NavBar) {
        UserController.toolbar = ToolBar;
        UserController.navbar = NavBar;
    }
    
}
