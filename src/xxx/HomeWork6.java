package xxx;
//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class HomeWork6 {
	public static void main (String[]args) {
		int sum1 = 5 + 5; 
			System.out.println(sum1); // 印出10，為數字相加，故=5+5
		int sum2 = 5 +'5';
			System.out.println(sum2); // 印出58，為數字和字元相加，本身int比char位階大，故兩者相加取int值，又因char為16進制，需先轉成int的10進制，對應到unicode表字元5為35，透過16轉10進制，可以得知char5轉成int為53
		String num1 = "5";
			num1+=5;
			System.out.println(num1); // 印出55，為數字和字串相加，直接做字串的串接。
	}
}


