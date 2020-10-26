package StringBufferAndStringBuilder;

public class StringBuilderDemo 
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Venkata");
		System.out.println("Inserted text is	: " + sb);
		
		sb.append(" Raja Kishore Dontha");
		System.out.println("Appended text is	: " + sb);
		
		sb.insert(27, " Goud");
		System.out.println("Inserted text is 	: " + sb);
		
		sb.replace(0, 20, "Vivaan");
		System.out.println("Replaced text is 	: " + sb);
		
		sb.delete(14, 18);
		System.out.println("Deleted text is     	: " + sb);
		
		sb.reverse();
		System.out.println("Reversed String is   	:" + sb);
	}
}


