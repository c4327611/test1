package tw.jason;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lotto extends JFrame {
	
	private JButton select;
	private JLabel Output,Output1,Output2,Output3,Output4,Output5;
	
		public Lotto(){
		
		super("樂透號碼產生器");
		select = new JButton("49選6");
		Output = new JLabel("輸出");
		Output1 = new JLabel("輸出");
		Output2 = new JLabel("輸出");
		Output3 = new JLabel("輸出");
		Output4 = new JLabel("輸出");
		Output5 = new JLabel("輸出");
		
		setSize(480, 320); //設定大小
		setVisible(true); //顯示
		setDefaultCloseOperation(EXIT_ON_CLOSE); //結束視窗.定義在JFram
        
        setLayout(new BorderLayout());
        add(select,BorderLayout.NORTH);
		add(Output,BorderLayout.CENTER);
		
		select.setFont(new Font("標楷體", Font.BOLD, 28));
		Output.setFont(new Font("標楷體", Font.BOLD, 25));
		}


	
//        int[] num = new int[6];
//        int rand;
//		boolean isOK;
//        for (int i=0;i<6;i++){
//        	num[i] = (int)(Math.random()*49+1);
//        	do {
//				rand = (int)(Math.random()*49+1);
//				// 檢查機制
//				isOK = true;
//				for (int j=0;j<i;j++){
//					if (num[j]==rand){
//						isOK = false;
//						break;
//					}
//				}
//        	
//				
//			}while (!isOK);
//			
//			num[i] = rand;
//		    System.out.println(num[i]);
//        }
//	}
		public static void main(String[] args) {
			new Lotto();

		}
}

//http://yhhuang1966.blogspot.tw/2014/02/java-swing-jlabel.html