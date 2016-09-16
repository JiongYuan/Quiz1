import java.util.Scanner;
public class QBrating  {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double TD;
		double Yards;
		double INT;
		double Comp;
		double ATT;
		double Passer_rating;
		do{
			System.out.println("What is the number of Touchdowns?");
			TD = input.nextDouble();
			System.out.println("What is the number of Total Yards?");
			Yards = input.nextDouble();
			System.out.println("What is the number of Interceptions?");
			INT = input.nextDouble();
			System.out.println("What is the number of Completions?");
			Comp = input.nextDouble();
			System.out.println("What is the number of Passes Attempted?");
			ATT = input.nextDouble();
			double a = (Comp/ATT - 0.3) * 5;
			double b = (Yards/ATT - 3 ) * 0.25;
			double c = (TD/ATT)* 20;
			double d = 2.375 - (INT/ATT * 25);
			Passer_rating = ((a+b+c+d)/6)*100;
			System.out.printf("The QB ratin is %.2f:", (Passer_rating));
		} while(Passer_rating <=0 || Passer_rating > 158.3);
			input.close();}
}
