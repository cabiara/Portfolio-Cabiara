
package wizardgraphics;
import java.awt.*;
import javax.swing.JFrame;

public class WizardGraphics extends Panel {
    
    public WizardGraphics(){
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paint (Graphics g){
	//face
        g.setColor(new Color(247, 200, 150));
        g.fillRect(200, 200, 150, 110);
        //hat 
        g.setColor(new Color(96, 95, 159));
        g.fillRect(300, 80, 20, 20);
        g.fillRect(260, 100, 50, 50);
        g.fillRect(220, 130, 100, 50);
        g.fillRect(200, 160, 150, 40);
        g.fillRect(180, 180, 190, 40);
        g.fillRect(170, 200, 210, 20);
        //robe
        g.fillRect(200, 310, 150, 150);
        g.fillRect(190, 420, 170, 30);
        g.fillRect(180, 430, 190, 10);    
        //hair
        g.setColor(new Color(216, 212, 208));
        g.fillRect(210, 210, 30, 10);
        g.fillRect(310, 210, 30, 10);
        g.fillRect(200, 220, 30, 10);
        g.fillRect(320, 220, 30, 10);
        g.fillRect(200, 230, 20, 10);
        g.fillRect(330, 230, 20, 10);
        g.fillRect(180, 220, 30, 160);
        g.fillRect(340, 220, 30, 160);
        g.fillRect(170, 330, 50, 40);
        g.fillRect(330, 330, 50, 40);
        g.fillRect(190, 380, 10, 10);
        g.fillRect(350, 380, 10, 10);
        //beard
        g.fillRect(260, 270, 30, 10);
        g.fillRect(250, 280, 50, 10);
        g.fillRect(230, 290, 90, 10);
        g.fillRect(240, 300, 70, 10);
        g.fillRect(250, 310, 50, 20);
        g.fillRect(260, 320, 25, 30);
        g.fillRect(270, 330, 8, 30);        
        //glasses
        g.setColor(new Color(54, 17, 29));
        g.fillRect(210, 250, 10, 30);
        g.fillRect(220, 240, 30, 10);
        g.fillRect(240, 250, 20, 30);
        g.fillRect(220, 280, 30, 10);
        g.fillRect(330, 250, 10, 30);
        g.fillRect(300, 240, 30, 10);
        g.fillRect(290, 250, 20, 30);
        g.fillRect(300, 280, 30, 10);
        g.fillRect(260, 260, 30, 10);
        //wand
        g.setColor(new Color(247, 200, 150));
        g.fillRect(180, 350, 20, 20);
        g.setColor(new Color(140, 102, 45));        
        g.fillRect(180, 350, 10, 10);
        g.fillRect(170, 340, 10, 10);
        g.fillRect(160, 330, 10, 10);
        g.fillRect(150, 320, 10, 10);
        g.fillRect(140, 310, 10, 10);
        g.fillRect(130, 300, 10, 10);
        //shading
        g.setColor(new Color(108, 80, 136));
        g.fillRect(170, 200, 10, 20);
        g.fillRect(180, 180, 10, 20);
        g.fillRect(200, 160, 10, 20);
        g.fillRect(220, 130, 10, 30);
        g.fillRect(250, 100, 10, 30);
        g.fillRect(210, 310, 10, 20);
        g.fillRect(220, 320, 10, 50);
        g.fillRect(210, 370, 10, 10);
        g.fillRect(200, 380, 10, 40);
        g.fillRect(190, 420, 10, 10);
        g.fillRect(180, 430, 10, 10);
        g.fillRect(190, 440, 10, 10);
        g.fillRect(200, 450, 10, 10);
        g.fillRect(300, 310, 10, 20);
        g.fillRect(285, 330, 8, 20);
        g.setColor(new Color(206, 188, 208));
        g.fillRect(180, 220, 10, 110);
	g.fillRect(340, 220, 10, 110);
        g.fillRect(170, 330, 10, 10);
        g.fillRect(260, 270, 30, 10);
        g.fillRect(250, 280, 10, 10);
        g.fillRect(230, 290, 20, 10);
        g.setColor(new Color(247, 178, 150));
        g.fillRect(230, 220, 90, 10);
}

    public static void main(String[] args) {
    WizardGraphics panel = new WizardGraphics();
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Wizard");
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
