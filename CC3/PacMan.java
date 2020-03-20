import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class PacMan extends Panel implements KeyListener{
    static int y = 0, x = 0, sa = 23, mouth = 310;
   
    PacMan(){
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(new Color(255, 255, 0));
        g.fillArc(100+x, 90+y, 100, 100, sa, mouth);
    }
    public static void main(String args[]){
        JFrame frame = new JFrame();
        PacMan panel = new PacMan();
        panel.addKeyListener(panel);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        
    }

    @Override 
    public void keyPressed(KeyEvent e) {
       if(e.getKeyCode() == KeyEvent.VK_UP){
           y-=20;
           sa = 113;
           if(y % 12 == 0)
               mouth = 360;
           else
               mouth = 310;
           
           if(y == 700){
               y -=650;
           }
       }
       if(e.getKeyCode() == KeyEvent.VK_DOWN){
           y+=20;
           sa = 293;
           if(y % 12 == 0)
               mouth = 360;
           else
               mouth = 310;
       }
       if(e.getKeyCode() == KeyEvent.VK_LEFT){
           x-=20;
           sa = 203;
           if(x % 12 == 0)
               mouth = 360;
           else
               mouth = 310;
           
           
       }
       if(e.getKeyCode() == KeyEvent.VK_RIGHT){
           x+=20;
           sa = 23;
           if(x % 12 == 0)
               mouth = 360;
           else
               mouth = 310;
       }
       repaint();
       }
     
    

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}