package game;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Game {

    public final static int WIDTH = 800, HEIGHT = 600;

    private String gameName = "Flappy Bird Clone";
    private Canvas game = new Canvas();
    private ArrayList<Updatable> updatables = new ArrayList<>();
    private ArrayList<Renderable> renderables = new ArrayList<>();

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



    public  void render(float interpolation) {
        BufferStrategy b = game.getBufferStrategy();
        if(b==null) {
            game.createBufferStrategy(2);
            return;
        }
        Graphics2D g = (Graphics2D) b.getDrawGraphics();
        g.clearRect(0,0, game.getWidth(), game.getHeight());
        for (Renderable r :renderables) {
            r.render(null, interpolation);
        }
        g.dispose();
        b.show();
    }
}

