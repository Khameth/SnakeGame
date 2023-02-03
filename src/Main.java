import javax.swing.*;

public class Main extends JFrame {

    static Menu menuGame;
    static Main mainGame;

    public Main(JPanel panel){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(334,357);
        setLocation(400,400);
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        menuGame = new Menu();
        mainGame = new Main(menuGame);

    }

}