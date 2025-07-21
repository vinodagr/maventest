package mca;

public class Hello {
	
	

	 public String palindrome(String s)
	    {
	    StringBuffer s1=new StringBuffer(s);
	    String str=s1.reverse().toString();
	    return str;
	    }
       public String isprime(int no)
	{int flag=0;
	       for(int i=2;i<no;i++)
		       {
                          if(no%i==0)
			   return "false";
		       }
         return "true";
	}
}
