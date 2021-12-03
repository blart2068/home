import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;    
import javax.swing.JFrame;  
import javax.swing.Timer;  
import javax.swing.JPanel;

public class as extends JFrame {

public static void main(String[] args) {
// TODO Auto-generated method stub
as frame = new as();	
   jump jump = new jump();
   frame.add(jump);
   frame.setTitle("Ìø´Ì");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(800, 250);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);  
   frame.setResizable(false);
   jump. setBackground(Color.black);

}

}
class jump extends JPanel {
int a     = 794 ;

public void refresh(){

int delay =1000;	 
ActionListener listener = new ActionListener(){
           public void actionPerformed(ActionEvent arg0){
           
           	repaint();
           	
           }
       };       
       Timer timer = new Timer(delay,listener);
        timer.start();
}

protected void paintComponent(Graphics g) {
     super.paintComponent(g);
     System.out.println(a+"   ");	      
     refresh();
     }
 
}