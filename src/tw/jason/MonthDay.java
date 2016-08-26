package tw.jason;

import javax.swing.JOptionPane;

public class MonthDay {

	public static void main(String[] args) {
		// 輸入日期
		String strYear = 
				JOptionPane.showInputDialog("year");
		String strMonth = 
				JOptionPane.showInputDialog("month");
		int intYear = Integer.parseInt(strYear);
		int intMonth = Integer.parseInt(strMonth);
		System.out.println(intYear + "年/" + intMonth + "月");
		if (intYear>=4000||intMonth>=13){ //判斷是否輸入錯誤
			System.out.println("輸入錯誤");
			
		
		}
		System.out.println("---------------萬年曆------------------");
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		int year,month,fday,aday,days,firstday,endday;
		int ayear = 0;
		
		
			//先判斷閏年及各月天數
		
//		   if(year<=1752 && year%4==0 && month==2)
//		        days=29;
//		   else if(year>1752 && ((year%4==0 && year%100!=0)||year%400==0) && month==2)
//		        days=29;
//		   else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
//		         days = 31;
//		   else if(month==4||month==6||month==9||month==11)
//		         days = 30;
//		   else
//		         days = 28;
//		   return(days);}
		   
		//1752年8月以前
			   if(intYear<1752 || (intYear==1752 && intMonth<=8)){
				   fday=6; //00010101 星期六
				   for(int i=1;i<intYear;++i)
					   if(i%4==0)
						   aday=366;
					   else aday=365;
				   {
					   if(intYear%4==0 && intMonth==2)
					        days=29;
					   else if(intMonth==1||intMonth==3||intMonth==5||intMonth==7||intMonth==8||intMonth==10||intMonth==12)
					         days = 31;
					   else if(intMonth==4||intMonth==6||intMonth==9||intMonth==11)
					         days = 30;
					   else
					         days = 28;
					   {
						   //%7 
						   //輸出
							   
					   }
					   }
				   
				   }
			
			 //1753年後
			   else if(intYear>1752){
				   fday=1; //17530101 星期一
				   for(int i=1753;i<intYear;++i){
					   if((i%4==0&&i%100!=0)||i%400==0)
						   aday=366;
					   else
						   aday=365;
					   {
				   if(intMonth==2)
				        days=29;
				   else if(intMonth==1||intMonth==3||intMonth==5||intMonth==7||intMonth==8||intMonth==10||intMonth==12)
				         days = 31;
				   else if(intMonth==4||intMonth==6||intMonth==9||intMonth==11)
				         days = 30;
				   else
				         days = 28;
				
			        }
					 //%7 
					   //輸出
				   }
			   }
			   
			   //1752年10月～12月
			   else if(intYear==1752 && intMonth>=10){
				   fday=0; //17521001 星期日
				   //aday=354;
				   if(intMonth==10||intMonth==12)
					   days = 31;
				   else if(intMonth==11)
				         days = 30;
				 //%7 
				   //輸出
				   
			   }
			    
		//1752年9月
	            else if(intYear==1752 && intMonth==9){
	            	days = 30;
	            	firstday=2;//17520901 星期二
	            	endday=30; //星期六
	            	
	            	//1.2.14.15...30 
					   //輸出
	            	
	            	
		           }
		           
		   }
		
	}

