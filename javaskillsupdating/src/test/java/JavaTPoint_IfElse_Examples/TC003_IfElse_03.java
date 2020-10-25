package JavaTPoint_IfElse_Examples;

public class TC003_IfElse_03 
{    
	public static void main(String[] args) 
	{    
		int year=2020;    
		if(((year % 4 ==0) && (year % 400==0)) || (year % 100 !=0))
		{  
			System.out.println("LEAP YEAR");  
		}  
		else
		{  
			System.out.println("COMMON YEAR");  
		}  
	}    
}    