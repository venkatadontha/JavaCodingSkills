package InterviewProgramsInGeneral;

import java.util.Scanner;
class FloydsTriangle
{
    public static void main(String args[])
    {
    	int rows, number = 1, counter, j;
    	
    	//To get the user's input
    	System.out.println("Enter the number of rows for floyd's triangle:");
       
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
    	rows = input.nextInt();
    	
    	//Copying user input into an integer variable named rows
       
    	System.out.println("Floyd's triangle");
    	System.out.println("****************");
    	for ( counter = 1 ; counter <= rows ; counter++ )
    	{
           for ( j = 1 ; j <= counter ; j++ )
           {
                System.out.print(number+" ");
                //Incrementing the number value
                number++;
           }
           //For new line
           System.out.println();
       }
   }
}
