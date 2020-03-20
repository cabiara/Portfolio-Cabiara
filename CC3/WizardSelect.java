import java.awt.*;
import javax.swing.*;

public class WizardSelect extends Panel{
    
    static JFrame frame = new JFrame("RPG (Wizard)");
    static boolean confirm = false;
    static Color color1, color2, color3, color4;
    static String name;
    
    public void paint(java.awt.Graphics g){
        
    g.setColor(new Color(136, 218, 179));
    g.fillRect(1, 1, 550, 550);
    g.setColor(new Color(123,200,177));
    g.fillRect(1, 1, 550, 200);
    g.setColor(new Color(109, 184, 178));
    g.fillRect(1, 1, 550, 150);
    g.setColor(new Color(101, 155, 171));
    g.fillRect(1, 1, 550, 100);
    
    //dirt
    g.setColor(new Color(160, 94, 62));
    g.fillRect(1, 460, 550, 180);   
    //grass
    g.setColor(new Color(95, 156, 55));
    g.fillRect(1, 460, 550, 50);
    g.fillRect(10,500,20,20);
    g.fillRect(30,500,20,30);
    g.fillRect(50,500,10,20);
    g.fillRect(80,500,20,20);
    g.fillRect(100,500,20,30);
    g.fillRect(120,500,10,20);
    g.fillRect(150,500,20,20);
    g.fillRect(170,500,20,30);
    g.fillRect(190,500,10,20);
    g.fillRect(220,500,20,20);
    g.fillRect(240,500,20,30);
    g.fillRect(260,500,10,20);
    g.fillRect(290,500,20,20);
    g.fillRect(310,500,20,30);
    g.fillRect(330,500,10,20);
    g.fillRect(360,500,20,20);
    g.fillRect(380,500,20,30);
    g.fillRect(400,500,10,20);
    g.fillRect(430,500,20,20);
    g.fillRect(450,500,20,30);
    g.fillRect(470,500,10,20);
    g.fillRect(500,500,20,20);
    g.fillRect(520,500,20,30);
    //clouds
    g.setColor(new Color(223, 232, 255));
    g.fillRect(50, 200, 150, 15);
    g.fillRect(60, 190, 100, 20);
    g.fillRect(90, 180, 80, 20);
    g.fillRect(120, 160, 30, 20);
    
    g.setColor(new Color(233, 232, 255));
    g.fillRect(250, 200, 150, 15);
    g.fillRect(260, 190, 100, 20);
    g.fillRect(290, 180, 80, 20);
    g.fillRect(320, 160, 30, 20);
        
        //Name
        g.setColor(new Color(136, 218, 179));
        g.setFont(new Font("Sans-serif", Font.LAYOUT_LEFT_TO_RIGHT,35));
        g.drawString(name, 200, 50);
       
        
        //face
        g.setColor(new Color(247, 200, 150));
        g.fillRect(200, 200, 150, 110);
        
        //hat 
        g.setColor(color1);
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
        g.fillRect(230, 240, 20, 10);
        g.fillRect(300, 240, 20, 10);    
        g.fillRect(290, 250, 15, 20);
        g.fillRect(245, 250, 15, 20);

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
        g.setColor(new Color(246, 221, 224));
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
        g.fillRect(170, 330, 10, 10);
        g.fillRect(260, 270, 30, 10);
        g.fillRect(250, 280, 10, 10);
        g.fillRect(230, 290, 20, 10);
        g.setColor(new Color(247, 178, 150));
        g.fillRect(230, 220, 90, 10);
        
       
        
        
       
        
    }
    
    public static void main(String[] args){
        
        name = getNames();
        getChoice();
        if (confirm){
            
            WizardSelect a = new WizardSelect();
            JFrame frame = new JFrame("Wizard");
            JTable table = new JTable();
            table.setShowGrid(true);
            frame.add(a);
            frame.setSize(550, 650);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    
    public static String getNames(){
         String n = JOptionPane.showInputDialog(frame, "Enter name.");
         int c = JOptionPane.showConfirmDialog(frame, "Hello, "  + n + "!");

        if (c != 0) {
            getNames();
        }

        return n;
    }
    
    public static String getChoice(){
        
        String[] color = {"Dumbledore", "Gandalf", "Saruman", "Radagast"};
        String choice = (String) JOptionPane.showInputDialog(frame, "Choose your wizard.", null
                , JOptionPane.QUESTION_MESSAGE, null, color, color[0]);

        int c = JOptionPane.showConfirmDialog(frame, choice + " it is!");

        if (c != 0) {
            getChoice();
        }

        color1 = convertColor(choice);
        confirm = true;
     
        return choice;
    }
    
     public static Color convertColor(String c) {
        switch (c) {
            case "Gandalf":
                return new Color(119, 115, 129);
                
            case "Radagast":
                return new Color (165,107,74);
            
            case "Dumbledore":
                return new Color(200, 139, 207);
            
            case "Saruman":
                return new Color(239, 242, 245);    
            
            default :
                return new Color(119,115,129);
        }         
        }
    }
