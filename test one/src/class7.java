
public class class7 {

	public static void main(String[] args) {
//
//		int num = 100;
//
//		while (num <= 100) {
//
//			if (num % 2 >= 1) {
//				System.out.print(num + " ");
//
//			}
//			num--;
//		}
//		
//		boolean workDay = true;
//		int day = 1;
//		
//		while (workDay) {
//			
//			if (day >)) {
//				System.out.println("i need a day off");
//			} 
//			
//			day++;
//		}
		
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i <= 50; i++ ) {
			if (i%2==0) {
				
				  sumEven = i +sumEven;
					
			} if(i%2==1) {
				
				 sumOdd = i + sumOdd;
				 
			}
			
			
		}
	
		System.out.println(sumEven); 
		System.out.println(sumOdd);

	}

}
