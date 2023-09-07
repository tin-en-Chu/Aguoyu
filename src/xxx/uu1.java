package xxx;

public class uu1 {
	public static void main (String[]args) {
		uuuuuu John=new uuuuuu();
		uuuuuu Amy=new uuuuuu();
		
		John.score=100; //透過new出來的新物件(copy整套uuuuuu的模板)去操作原先score值
		Amy.score=95;	//透過new出來的新物件(copy整套uuuuuu的模板)去操作原先score值
		
		John=Amy;   //將Amy全部賦予給John，使john跟amy一樣為95分
		John.score=102;
		
		John.test1();
		
	}
}
