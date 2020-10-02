package game;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        Pipes p = new Pipes();
        Bird b = new Bird(p);
        g.addRenderable(p);
        g.addUpdatable(p);
        g.addRenderable(b);
        g.addUpdatable(b);
        g.start();
    }
}
