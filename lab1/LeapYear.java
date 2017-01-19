public class LeapYear{
	public static void main(String []args	) {
		int year = 2000;	
		boolean Onehundred=!(year%100==0);
		if(year%400==0||(year%4==0&&Onehundred)){
			System.out.println("Is a leap year");
		}else{
			System.out.println("Is not a leap year");
		}
	}
}