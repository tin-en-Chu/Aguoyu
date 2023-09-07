package xxx;
//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
////金加利息共有多少錢 (用複利計算,公式請自行google)
//本利和 = 本金 × (1 + 年利率)^期間
public class Homework5 {
	public static void main (String[]args) {
	int basic_cashs=1_500_000;//本金
	double annual_interest_rates =0.02;//利率
	int periods=10;//期數
	double s=Math.pow((1+annual_interest_rates), 10);//計算 (1 + 年利率)^期間
	double principal_and_interest=basic_cashs*s ;//本利和 = 本金 × (1 + 年利率)^期間
		System.out.println((int)principal_and_interest);
	}
}




