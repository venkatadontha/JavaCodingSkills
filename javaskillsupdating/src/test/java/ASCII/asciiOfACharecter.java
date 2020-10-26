package ASCII;

public class asciiOfACharecter 
{
    public static void main(String[] args) 
    {
        char ch = 'p';
        
        int asciiCode = ch;
               // type casting char as int
        int asciiValue = (int)ch;

        System.out.println("ASCII code of "+ch+" is : " + asciiCode);
        System.out.println("ASCII value of "+ch+" is: " + asciiValue);
    }
}
