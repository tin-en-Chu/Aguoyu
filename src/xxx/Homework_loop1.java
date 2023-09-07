package xxx;

//使用for+while寫99
public class Homework_loop1 {
	
	int score=90;  //實體變數(屬性)   
	   
	public void play(int hours) {   //方法    void==不回傳值    必須透過實體變數才能print，適用在後續不做功能情況下
		score+=hours;  //90+111>>>>>score=>201
	}    
	public void study(int hours) {	 //方法   
		score+=hours;
	}
	
	
	public int play1(int hours) {				//int==回傳值	   可以透過方法取得值，不一定要靠實體變數，適用在後續還需要使用的情況下
		 return score+=hours;  //201+111
	}
	
	
	public static void main(String[] args) {
		
		Homework_loop1 apple = new Homework_loop1();  //apple 我跟Homework_loop1借了模組
		Homework_loop1 banana = new Homework_loop1(); //banana 我跟Homework_loop1借了模組
		
		
		apple.play(111);  //void   90+111=201
		
		int xx=apple.play1(111);  //int  201+111=312
		
	
		
		System.out.println(xx);// 312+111=423
		
		
		
		
	}
}
