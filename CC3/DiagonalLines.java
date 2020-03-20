import javax.swing.*;
import java.awt.*;

public class DiagonalLines extends JFrame {

    public DiagonalLines(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
@Override
    public void paint(Graphics g){
	int x = 0;
	int y = 0;
	super.paint(g);
	Graphics2D  lin= (Graphics2D)g;
            for (int i = 0; i <100; i++){
            g.drawLine(x, y + 20 * i, x + 20 * i, y);
            g.drawLine(x + 20 * i, 200 + y, 200 + x, y + 20 * i);
        }
    }
    public static void main(String[] args) {
        DiagonalLines frame= new DiagonalLines();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}

