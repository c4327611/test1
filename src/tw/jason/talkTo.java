package tw.jason;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.im.InputContext;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import sun.awt.im.InputMethodContext;

public class talkTo extends JFrame{
	 JTextArea output = new JTextArea();
	 JTextField input = new JTextField();
	 JButton enter = new JButton("送出訊息");

		public talkTo(){
			super("通訊程式");
			input.setColumns(25);
			
			JPanel down = new JPanel(new FlowLayout(FlowLayout.CENTER));
			JPanel output = new JPanel(new FlowLayout(FlowLayout.CENTER));
			
			JScrollPane jsp =new JScrollPane(output);
			
			setLayout(new BorderLayout());
			down.add(input);down.add(enter);			
			add(jsp,BorderLayout.CENTER);
			add(down,BorderLayout.SOUTH);
			
			setSize(500, 640); 
			setVisible(true); 
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			enter.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					doEnter();
					
				}
			});
			
		}
		protected void doEnter() {
			// 送出訊息
		
			
		}
		public static void main(String[] args) {
			new talkTo();
			
		
	}

}
