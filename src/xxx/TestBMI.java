package xxx;

public class TestBMI {
	public static void main (String[]args) {
		double height = 1.7;
		int weight =62;
		double bmi=weight/(Math.pow(height, 2));
		System.out.printf("bmi = %.2f",bmi);// printf= format(格式)
		System.out.println();
		if (bmi<18.5) {
			System.out.println("過瘦");
		}
		else if(bmi>=24) {
			System.out.println("過重");
		}
		else {
			System.out.println("正常");
		}
			
	}
}






