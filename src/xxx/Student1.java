package xxx;

public class Student1 {
	int score = 90;
	
	public void play(int hours) {
		// 每休息一個小時，score就會減1
		score -= hours;
	}
	
	public void study(int hours) {
		// 每讀書一個小時，score就會加1
		score += hours;
	}
	
	public static void main(String[] args) {
		// 創建兩個student物件，並藉由呼叫play()與study()模擬學生行為
		// 最後顯示分數是否正確
		Student1 david = new Student1();
		Student1 james = new Student1();
		
		System.out.println(david.score);
		System.out.println(james.score);
		
		david.play(2);
		david.study(6);
		
		james.play(5);
		james.study(2);
		
		System.out.println("================");
		
		System.out.println(david.score);
		System.out.println(james.score);
		
		
		
	}
}