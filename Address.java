package networkprogramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {

	public static void main(String[]args)
	{
		try{
			InetAddress i = InetAddress.getByName("www.google.com");
			
			if (i.isAnyLocalAddress())
			{
				System.out.println("wildcard address ");
			}
			else if(i.isLoopbackAddress())
			{
				System.out.println("get loop");
				
			}
		
			else if(i.isLinkLocalAddress())	
			{
				System.out.println("get link local address");
			}
			else if(i.isSiteLocalAddress())
			{
				System.out.println("get site local address");
			}
			else if(i.isMulticastAddress())
			{
				System.out.println("get multi cast address");
			}
			else
			{
				System.out.println("not found wildcard address");
			}
			
		}
	
		catch(UnknownHostException e)
		{
			System.out.println("not found");
		}
	}
}
	

