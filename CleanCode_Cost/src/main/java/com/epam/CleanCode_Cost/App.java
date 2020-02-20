package com.epam.CleanCode_Cost;


import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
    }
    
    static
    {
    	App.costCalculation();
    }
    
    static void costCalculation()
    {
    	Scanner sc = new Scanner(System.in);
    	while(true)
    	{
    		double totalCost=0, squareFeet;
    		System.out.append("\t\t\t\t\t\t_________________________________________________________________\n\n");
            System.out.append("\t\t\t\t\t\t|                                                                 |\n");
            System.out.append("\t\t\t\t\t\t|             1  >> Use Standard Materials                     |\n");
            System.out.append("\t\t\t\t\t\t|             2  >> Use Above standard materials                 |\n");
            System.out.append("\t\t\t\t\t\t|             3  >>Use High Standard Materials                   |\n");
            System.out.append("\t\t\t\t\t\t|    4 >>Use High Standard Material and Need fully automated home|\n");
            System.out.append("\t\t\t\t\t\t|             5  >>Exit                                           |\n");
            System.out.append("\t\t\t\t\t\t|_________________________________________________________________|\n\n");
           
    		System.out.append("\nEnter your choice: ");
    		int choice = sc.nextInt();
    		switch(choice)
    		{
    			case 1: System.out.append("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
    					System.out.append("\nPer Square Feet cost: 1200INR");
    					totalCost=squareFeet*1200;
    					System.out.append("\nThe Total Cost is: "+totalCost);
    					break;
    			case 2: System.out.append("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
    					System.out.append("\nPer Square Feet cost: 1500INR");
						totalCost=squareFeet*1500;
						System.out.append("\nThe Total Cost is: "+totalCost);
						break;
    			case 3: System.out.append("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
    					System.out.append("\nPer Square Feet cost: 1800INR");
						totalCost=squareFeet*1800;
						System.out.append("\nThe Total Cost is: "+totalCost);
						break;
    			case 4: System.out.append("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
    					System.out.append("\nPer Square Feet cost: 2500INR");
						totalCost=squareFeet*2500;
						System.out.append("\nThe Total Cost is: "+totalCost);
						break;
    			case 5: System.exit(0);
    			default: System.out.append("\nWrong Choice!\n");
    		}
    	}
    }
}