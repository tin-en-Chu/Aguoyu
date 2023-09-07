package xxx;
//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class HomeWork3 {
	public static void main (String[]args) {
		int sec=256559;
		int days=256559/60/60/24;
		int hrs= (256559-(days*60*60*24))/60/60;
		int mins=((256559-(days*60*60*24)-(hrs*60*60))/60);
		int secs=(256559-(days*60*60*24)-(hrs*60*60)-(mins*60));
				System.out.println("256559秒為"+days+"天，"+hrs+"小時，"+mins+"分鐘，"+secs+"秒");
	}
}


