package game;

import java.awt.*;

import javax.swing.JFrame;

public class Game {

    public final static int WIDTH = 800, HEIGHT = 600;

    private String gameName = "Flappy Bird Clone";
    private Canvas game = new Canvas();

    public void start() {
        Dimension gameSize = new Dimension(Game.WIDTH, Game.HEIGHT);
        JFrame gameWindow = new JFrame(gameName);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setSize(gameSize);
        gameWindow.setVisible(true);
        gameWindow.setResizable(false);
        gameWindow.add(gameWindow);
        gameWindow.setLocationRelativeTo(null);

    }
}

