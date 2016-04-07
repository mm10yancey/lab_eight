import java.util.Scanner;
public class BattingAverage {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculter");
		System.out.println("0=out, 1=single, 2=double, 3= triple, 4= home run");
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter number of times at bat");
	
	
	int user = sc.nextInt();
	int [] atBat = new int[user];
	//String differentBatter =sc.nextLine();
	
	
	//while (!differentBatter.equalsIgnoreCase("N")) {
		   for (int i =0; i <atBat.length; i++){
			  System.out.println("Result for at bat" + " " + (i+1)); 
		atBat[i] = sc.nextInt();
	}
	double hit =0;
	double sum =0;
	for (int j =0; j <atBat.length; j++) {
		if (atBat[j] > 0){		
		hit++;	
		}
	sum += atBat[j]; 
	
	}      
	  	
	double batting = hit/atBat.length;
	System.out.println(batting);
	double slugging = sum/atBat.length;
	System.out.println(slugging);
	sc.close();
	        
	}
	}
 
	


	
	
	
	
	
		
		

	


