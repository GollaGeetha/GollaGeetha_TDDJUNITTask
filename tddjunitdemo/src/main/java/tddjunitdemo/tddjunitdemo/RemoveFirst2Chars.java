package tddjunitdemo.tddjunitdemo;

public class RemoveFirst2Chars {

	public String swap(String string) {
		String new_string="";
	String res_string = null;
	
	int string_length=string.length();
	if(string_length==0)
	{
		res_string="";
	}
	else
	{
	 if(string_length==2)
	{
		if(string.charAt(0)=='A'&&string.charAt(1)!='A') {
			res_string=string.substring(1);
		}
		if(string.charAt(0)=='A'&&string.charAt(1)=='A')
		{
			res_string=new_string;
		}
		if(string.charAt(0)!='A'&&string.charAt(1)=='A') {
			res_string=string.substring(0,1);
		}
	}
	if(string_length<2)
	{
		
	if(string.charAt(0)=='A')
	{
		res_string=new_string;
	}
	
	}
	
	if(string_length>2&&string.charAt(0)=='A'&&string.charAt(1)=='A')
	{
		res_string=string.substring(2);
	}
	
	if(string_length>2)
	{
		if(string.charAt(0)=='A'&&string.charAt(1)!='A')
		{
		  res_string=string.substring(1);
		  
		}
	else if(string.charAt(0)!='A'&&string.charAt(1)=='A')
	{
	  res_string=string.substring(0,1).concat(string.substring(2));	
	}
	
	
	}
	if(string_length>2)
	{
		if(string.charAt(0)!='A'&&string.charAt(1)!='A')
		{
		  res_string=string;
		  
		}
	}
	

	}
	return res_string;
}
}

