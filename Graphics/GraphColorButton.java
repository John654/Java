import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphColorButton implements ActionListener{

    JFrame frame;

    public static void main(String[] args){

	GraphColorButton gui = new GraphColorButton();
	gui.go();
    }

    public void go(){
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JButton button = new JButton("Change Color");
	button.addActionListener(this);
	
	MyDrawPanel drawPanel = new MyDrawPanel();

	frame.getContentPane().add(BorderLayout.SOUTH, button);
	frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
	frame.setSize(300,300);
	frame.setVisible(true);
       
    }

    public void actionPerformed(ActionEvent event){
	frame.repaint();
    }
}

class MyDrawPanel extends JPanel{
    public void paintComponent(Graphics g){

	int red = (int) (Math.random() * 255);
	int green = (int) (Math.random() * 255);
	int blue = (int) (Math.random() * 255);

	Color rColor = new Color(red, green, blue);
	g.setColor(rColor);
        g.fillOval(50,50 ,100,100);
	
    }
}
