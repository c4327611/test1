package tw.jason; // 樂透號碼產生

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lotto extends JFrame{
	private JButton select;
	private JLabel Output;
	
		public Lotto(){
		
		JFrame demo = new JFrame("樂透號碼產生器");
		select = new JButton("49選6");
		Output = new JLabel("怎麼輸出?");
		
		setSize(640, 480); //設定大小
		setVisible(true); //顯示
		setDefaultCloseOperation(EXIT_ON_CLOSE); //結束視窗.定義在JFram
        
        setLayout(new BorderLayout());
        add(select,BorderLayout.NORTH);
		add(Output, BorderLayout.CENTER);
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
//        }
//	}
        public static void main(String[] args){
        new Lotto();
}
}
//http://yhhuang1966.blogspot.tw/2014/02/java-swing-jlabel.html