package com.intheworldofdeep;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame(){
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();

    }
}
