
	import java.util.Scanner;

	public class UsersGivenRange {
		public static void main(String args[]) {
		int oddsum=0,evensum=0;
	 Scanner sc = new Scanner (System.in);
	  System.out.println("Enter the first number :");
	  int x = sc.nextInt();
	  System.out.println("Enter the Second number :");
	  int y = sc.nextInt();
	  System.out.println("Even Numbers In The Given Range");
	  for(int i=x ; i <= y ; i++ ) {
		  if(i%2==0) {
			   System.out.println(i);
			   evensum=evensum+i;
		  }
		 }
	  System.out.println("sum of the even numbers are"+" "+evensum);
	  System.out.println();
	  System.out.println("Odd Numbers In The Given Range");
	  for(int i=x ; i <= y ; i++ ) {
		  if(i%2!=0) {
			   System.out.println(i);
			   oddsum=oddsum+i;
		  }
		 }
	  System.out.println("sum of the odd numbers are"+" "+oddsum);
	  System.out.println("Difference Between Even And Odd Numbers"+" "+(evensum-oddsum));
	}
	}


