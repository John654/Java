import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
	g.setColor(Color.orange);
       	g.fillOval(20,50,100,100);
	/*
	g.fillRect(0,0,this.getWidth(), this.getHeight());
	Image image = new ImageIcon("dancing_cat.gif").getImage();
	g.drawImage(image, 3, 4, this);

	int red = (int) (Math.random() * 255);
	int green = (int) (Math.random() * 255);
	int blue = (int) (Math.random() * 255);

	Color randomColor = new Color(red, green, blue);
	g.setColor(randomColor);
	g.fillOval(110, 10, 80, 80);

	*/
    }

    public static void main(String[] args){
	MyDrawPanel my = new MyDrawPanel();
	JFrame frame = new JFrame();
	frame.add(my);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,450);
	frame.setVisible(true);
    }
}
