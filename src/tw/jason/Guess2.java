package tw.jason;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Guess2 extends JFrame  {
		// 
		private JButton Guess;
		private JTextField Intput;
		private JTextArea Output;
		String answer = createAnswer(4);
			
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
		
			boolean isWINNER = false;
			for (int i=0; i<10; i++){
				// 開始猜
				
				
				// 比對
				if (Intput.equals(answer)){
					// 對了 => 恭喜老爺,...
					isWINNER = true;
					JOptionPane.showMessageDialog(null, "恭喜老爺,...");
					break;
				}else{
					// 錯了 => 提示 1A2b
					String result = checkAB(answer, Intput);
					JOptionPane.showMessageDialog(null, Intput + ":" + result);
				}
			}
			if (!isWINNER){
				JOptionPane.showMessageDialog(null, "嗐, 魯蛇, \n答案是:" + 
							answer);
			}
				
			
			
		}
			
		private String checkAB(String answer, JTextField intput) {
			// TODO Auto-generated method stub
			return null;
		}

		static String checkAB(String a, String g){
			int A, B; A = B = 0;
			for (int i=0; i<g.length();i++){
				if (g.charAt(i) == a.charAt(i)){
					A++;
				}else if (a.indexOf(g.charAt(i)) != -1){
					B++;
				}
			}
			return A + "A" + B + "B";
		}
		
		static String createAnswer(int n){
			// 洗牌
			int[] poker = new int[n];	// 0,0,...0
			int rand;
			boolean isOK;
			for (int i=0; i<poker.length; i++){
				
				do {
					rand = (int)(Math.random()*10);
					// 檢查機制
					isOK = true;
					for (int j=0;j<i;j++){
						if (poker[j]==rand){
							isOK = false;
							break;
						}
					}
					
				}while (!isOK);
				
				poker[i] = rand;
				//System.out.println(poker[i]);
			}
			String ret = "";
			for (int v : poker) ret += v;
			
			return ret;
		}
		
	

		
		
		
			public static void main(String[] args) {
				new Guess2();
					

					
				}
			
				
				
			}
			
		



//http://pydoing.blogspot.tw/2011/05/java-basic-concept-of-gui.html