package com.company;

import java.awt.*;
import java.awt.event.*;
public class Main extends Frame{
    Main(String title){
        super(title);
        setSize(400,500);
        setLayout(null);
        Button button = new Button("start");
        button.setSize(100,25);
        button.setLocation(100, 100);
        Label label = new Label("label");
        label.setSize(100, 25);
        label.setLocation(100, 150);
        add(button);
        add(label);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Main("App");
    }
}