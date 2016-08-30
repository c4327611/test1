package tw.jason;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Guess2 extends JFrame {
		// 
		private JButton Guess;
		private JTextField Intput;
		private JTextArea Output;
			
		
		
		public Guess2(){
			super("猜數字");
			Guess = new JButton("猜");
			Intput = new JTextField(); //輸入數字
			Output = new JTextArea(); //輸出+XAXB
			
		}

	}


