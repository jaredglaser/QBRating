import java.util.Scanner;

public class QBRating {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Completion Percentage");
		double comp = scanner.nextDouble();
		System.out.println("Enter Yards Per attempt");
		double yds = scanner.nextDouble();
		System.out.println("Enter Touchdowns per attempt");
		double td = scanner.nextDouble();
		System.out.println("Enter Interceptions per attempt");
		double interceptions = scanner.nextDouble();
		System.out.println("Enter number of attempts");
		double att = scanner.nextDouble();
		
		double a = checkCalc(((comp/att)-.3) * 5);
		double b = checkCalc(((yds/att)-.3)*.25);
		double c = checkCalc((td/att)*20);
		double d = checkCalc(2.375-(interceptions/att*25));	
		
		double rating = ((a+b+c+d)/6)*100;
		
		System.out.println(rating);
	}
	
	private static double checkCalc(double calc){
		if(calc > 2.375){
			return 2.375;
		}
		else if(calc < 0){
			return 0;
		}
		else{
			return calc;
		}
	}
}
