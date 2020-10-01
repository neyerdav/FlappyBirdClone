package game;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        Pipes p = new Pipes();
        g.addRenderable(p);
        g.addUpdatable(p);
        g.start();
    }
}
