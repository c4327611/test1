package tw.jason;
import java.io.*;
public class test3 {

	public static void main(String[] args) throws IOException {
		// 3.7-4
		
		System.out.println("請輸入身高和體重:");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String h1 = br.readLine();
		String w1 = br.readLine();
		
		double h2 = Integer.parseInt(h1);
		double w2 = Integer.parseInt(w1);
		System.out.println("您的身高是" + h2 + "公分 。");
		System.out.println("您的體重是" + w2 + "公斤。");
		double h3 = h2/100;
		
		double bmi = (w2/(h3*h3));
		System.out.println("您的BMI值為:" + bmi);
		
	}

}
