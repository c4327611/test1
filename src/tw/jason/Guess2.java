package tw.jason;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Guess2 extends JFrame  {
		// 
		private JButton Guess;
		private JTextField Intput;
		private JTextArea Output;
		
			
		public Guess2(){
			super("猜數字");
			
			Guess = new JButton("猜");
			Intput = new JTextField(35);
			Output = new JTextArea(); //輸出+XAXB
			
			setLayout(new BorderLayout()); 
			
			JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));

			top.add(Intput);top.add(Guess);
			
			add(top,BorderLayout.NORTH);
			add(Output, BorderLayout.CENTER); //中間
			
			
			setSize(640, 480); //設定大小
			setVisible(true); //顯示
			setDefaultCloseOperation(EXIT_ON_CLOSE); //結束視窗.定義在JFram
		}
		
			public static void main(String[] args) {
				new Guess2();
					

					
				}
				
				
			}
			
		



