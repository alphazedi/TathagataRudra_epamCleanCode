package com.epam.CleanCode_interest;

//package com.EPAMPEP.maven.InterestCalculation;
import java.util.Scanner;

public class App 
{
  public static void main( String[] args )
  {

  }
  
  static
  {
  	App.interestcalculation();
  }
  
  static void interestcalculation()
  {
  	Scanner sc= new Scanner(System.in);
  	while(true)
  	{
  		System.out.append("\t\t\t\t\t\t_________________________________________________________________\n\n");
          System.out.append("\t\t\t\t\t\t|                                                                 |\n");
          System.out.append("\t\t\t\t\t\t|             1  >> Calculate Simple Interest                     |\n");
          System.out.append("\t\t\t\t\t\t|             2  >> Calculate Compound Interest                   |\n");
          System.out.append("\t\t\t\t\t\t|             3  >> Exit                                          |\n");
          System.out.append("\t\t\t\t\t\t|_________________________________________________________________|\n\n");
          //System.out.append("\nPress 1 to Calculate Simple Interest\nPress 2 to Calculate Compound Interest\nPress 3 to Exit\n");
  		System.out.append("\nEnter your choice: ");
  		int choice= sc.nextInt();
  		switch(choice)
  		{
  			case 1: System.out.append("\nEnter the principal amount: ");
  					double principal=sc.nextDouble();
  					System.out.append("\nEnter the rate of interest: ");
  					double rateofinterest=sc.nextDouble();
  					System.out.append("\nEnter the time period: ");
  					double timeperiod=sc.nextDouble();
  					double simpleInterest= (principal*rateofinterest*timeperiod)/100;
  					System.out.append("\nThe Calculated Simple Interest is: "+simpleInterest);
  					break;
  			case 2: System.out.append("\nEnter the principal amount: ");
						double cprincipal=sc.nextDouble();
						System.out.append("\nEnter the rate of interest: ");
						double crateofinterest=sc.nextDouble();
						System.out.append("\nEnter the time period: ");
						double ctimeperiod=sc.nextDouble();
						double res=1+(crateofinterest/100);
						double compoundInterest=cprincipal*(Math.pow(res, ctimeperiod));
						System.out.append("\nThe Calculated Compound Interest is: "+compoundInterest);
						break;
  			case 3: System.exit(0);
  			default: System.out.append("\nWrong Choice!");
  		}
  	}
  }
}