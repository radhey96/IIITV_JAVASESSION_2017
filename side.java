package triangle;

import java.text.DecimalFormat;
import java.util.Scanner;


public class side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1=0,x2=0,x3=0;
		double y1=0,y2=0,y3=0;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.##"); 
		System.out.println("Enter the co ordinates of point of trangle:");
		System.out.println("Co ordinate of point A: ");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		System.out.println("Co ordinate of point B:");
		y2 = scan.nextInt();
		x2 = scan.nextInt();
		System.out.println("Co ordinate of point C:");
		x3 = scan.nextInt();
		y3 = scan.nextInt();
		
		scan.close();
		
		double AB =0,BC = 0,AC =0;
		AB = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		BC = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
		AC = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
		
		System.out.println("The sides of triangle are:");
		System.out.println("AB = "+dec.format(AB));
		System.out.println("BC = "+dec.format(BC));
		System.out.println("AC = "+dec.format(AC));
		
		
		
	}

}
