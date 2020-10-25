package JavaArrayDataTypes_Examples;

public class TC003_ByteArray
{
    public static void main(String[] args) 
    {
          byte[] bytes = "Hello World!!".getBytes();     
          
          System.out.println(bytes);
          
          //initialize the bytes array
          
          //Convert byte[] to String
          
          String s = new String(bytes);
          
          System.out.println(s);
    }
}
