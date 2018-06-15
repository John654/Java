import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextArea implements ActionListener{

    JTextArea text;
    
    public static void main(String[] args){
	TextArea gui = new TextArea();
	gui.go();
    }

    public void go(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Click me");

	button.addActionListener(this);
	text = new JTextArea(10,20);
	text.setLineWrap(true);

	JScrollPane scroller = new JScrollPane(text);
	scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

	panel.add(scroller);

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(BorderLayout.CENTER, panel);
	frame.getContentPane().add(BorderLayout.SOUTH, button);

	frame.setSize(350, 350);
	frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ev){
	text.append("button clicked !!! \n");
    }
}