package com.intheworldofdeep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.util.Random;



public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;

    //HOW BIG WE WANT OBJECT IN OUR SPACE
    static final int UNIT_SIZE = 25;

    //HOW MANY OBJECTS WE CAN FIT IN THE GAME
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;

    //HOLDING THE CO-ORDINATES OF ALL THE BODY PARTS OF OUR SNAKE
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];

    //HOW MANY BODY PARTS DO WE NEED IN A SNAKE
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.PINK);
        this.setFocusable(true);
        this.addKeyListener(new myKeyAdapter());
        startGame();

    }

    public void startGame() {

    }

    public void paintComponenet (Graphics g) {

    }

    public  void draw(Graphics g){

    }

    public void newApple(){

    }
    public void move(){

    }

    public void checkApple(){

    }

    public void checkCollision(){

    }

    public void gameOver (Graphics g){
    }

    public void myKeyAdapter(){
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private class myKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){

        }
    }

//    public void MyKeyAdapter extends KeyAdapter{
//        @Override
//        public void keyPressed(KeyEvent e){
//
//        }
//    }
}
