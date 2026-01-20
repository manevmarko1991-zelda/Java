package marko_manev;
import java.util.Scanner;
public class Aufgaben {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("give me u lower numberbut bigger then 0  and i will tell u the odd Numbers bettwen the 2 numbers : ");
		
		int number= input.nextInt();
		System.out.println("give me the secound also grosser als 0   number2 higher  then the first one:");
		int number2 = input.nextInt();
		
	
		if (number <= 0 || number2 <= 0) {
		    System.out.println("numbers must be bigger than 0");
		} else {
		    for (int i = number; i <= number2; i++) {
		        if (i % 2 == 0) {
		            System.out.println(i);
		}}}}}
		*/
	
		Scanner input = new Scanner(System.in);
        System.out.print("Side length: ");
        int n = input.nextInt();
		
		 for (int i = 1; i <= n; i=i+1) {
	            for (int j = 1; j <= n; j=j+1) {

	                if (i == 1 || i == n || j == 1 || j == n) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }

	            }
	            System.out.println();
		 }}}
	/*
	System.out.println("marko\nmanev");	
	String output = "marko e budala";
	System.out.println(output);
	output = "stvarno li ";
	System.out.println(output);
	int m =2;
	m--;	
	System.out.println(m);
	for (int i = 0; i < 3; i++) {
	    System.out.printf("Hello\n");
	*/
	
	
	
		
	
	


