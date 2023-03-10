package second;


class UserDefinedException extends Exception  
{  
    public UserDefinedException()  
    {  
        // Calling constructor of parent Exception  
        super("UserDefined");  
    }  
}  
public class CustomException {
	public static void main(String args[]) /*throws UserDefinedException  */
	 /* {
		  throw new UserDefinedException();  
	  }*/
	    {  
	        try  
	        {  
	            // throw an object of user defined exception  
	            throw new UserDefinedException();  
	        }  
	        catch (UserDefinedException ude)  
	        {  
	            System.out.println("Caught the exception");  
	            // Print the message from MyException object  
	            System.out.println(ude.getMessage());  
	        }  
	    }  
}
