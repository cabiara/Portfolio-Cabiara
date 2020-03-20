import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class NestedBoxes extends JFrame {

    public NestedBoxes(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void paint(Graphics bx){
	int z =55;
	int x = 400;
	int y = 400;
	super.paint(bx);
	Graphics2D  gr2D = (Graphics2D)bx;
	for (int i=1; i < 9; i++){
            Rectangle2D.Float rect = new Rectangle2D.Float(z, z, x, y);
            gr2D.draw(rect);
            z += 25;
            x -= 50;
            y -= 50;
	}
    }	
    public static void main(String[] args){
	NestedBoxes frame= new NestedBoxes();
        frame.setSize(500,500);
	frame.setVisible(true);
    }
}


