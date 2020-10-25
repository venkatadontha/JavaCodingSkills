package JavaArrayDataTypes_Examples;

public class TC007_EmptyArray 
{
	public static String appendMessage(String msg, String[] msg_params) 
	{
		for ( int i = 0; i <msg_params.length; i++ )    
		{
			//appends the incoming message with array parameters
			int index = msg.indexOf("{" + i + "}");
			while ( index != -1 )  
			{
				msg = (new StringBuffer(msg)).replace(index, index+3, msg_params[i]).toString();
				index = msg.indexOf("{" + i + "}");
			}
		}
		return msg;
   }
 
   public static void main(String[] args) throws Exception
   {
	   String[] msgParam_1 = {"Java"};
	   //empty array
	   String[] msgParam_2 = new String[0];          
       System.out.println(appendMessage("Learn {0}!", msgParam_1));
       //pass empty array 
       System.out.println(appendMessage("Start Programming", msgParam_2)); 
   }
}
