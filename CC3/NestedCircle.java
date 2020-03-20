import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class NestedCircle extends JFrame {

    public NestedCircle(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void paint(Graphics cr){
	int r = 30;
	int x = 450;
	int y = 450;
	Graphics2D  cir= (Graphics2D)cr;
	for (int i=1; i < 16; i++){
            Ellipse2D.Float circ = new Ellipse2D.Float(r, r, x, y);
            cir.draw(circ);
            r += 15;
            x -= 30;
            y -= 30;
        }
    }
    public static void main(String[] args){
        NestedCircle frame= new NestedCircle();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}


