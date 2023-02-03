import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel {

    public Menu() {
        setBackground(Color.black);
        setFocusable(true);

        CustomButton button1 = new CustomButton("",128,48,98,16);
        CustomButton button2 = new CustomButton("",48,72,98-48,16+48);
        CustomButton button3 = new CustomButton("",128,48,98,16+72+48);
        CustomButton button4 = new CustomButton("",48,72,98+128,16+72+48+48);
        CustomButton button5 = new CustomButton("",128,48,98,16+72+48+48+72);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                setBackground(Color.white);
                Main mainGame = new Main(new GameField());
                Main.mainGame.setVisible(false);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                setBackground(Color.white);
                Main mainGame = new Main(new GameField());
                Main.mainGame.setVisible(false);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                setBackground(Color.white);
                Main mainGame = new Main(new GameField());
                Main.mainGame.setVisible(false);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                setBackground(Color.white);
                Main mainGame = new Main(new GameField());
                Main.mainGame.setVisible(false);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                setBackground(Color.white);
                Main mainGame = new Main(new GameField());
                Main.mainGame.setVisible(false);
            }
        });
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
    }

    class CustomButton extends JButton {
        private int x;
        private int y;

        public CustomButton(String label,int width,int height, int x, int y) {
            super(label);
            setPreferredSize(new Dimension(width, height));
            this.x = x;
            this.y = y;

        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            setLocation(x,y);
            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    }

}
