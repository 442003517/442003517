import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Number");
	int sum1= scan.nextInt();
	
	switch (sum1 %2){
	    case 0:
	System.out.println("even");
	break;
	default:System.out.println("odd");
	}}
}
