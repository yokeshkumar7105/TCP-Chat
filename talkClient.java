import java.io.*;
import java.net.*;
public class talkClient
{
	public static void main(String args[])throws Exception
	{
		Socket c=null;
		BufferedReader usr_inp = null;
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dout=null;
		try
		{
			c=new Socket("127.0.0.1",1234);
			usr_inp = new BufferedReader(new InputStreamReader(c.getInputStream()));
			dout=new
			DataOutputStream(c.getOutputStream());
		}
		catch(IOException e)
		{}
		if(c!=null || usr_inp!=null || dout!=null)
		{
			String unip;
			System.out.println("\nEnter the message for server:");
			while((unip=din.readLine())!=null)
			{
				dout.writeBytes(unip);
				dout.writeBytes("\n");
				System.out.println("reply");
				System.out.println(usr_inp.readLine());
				System.out.println("\n enter your message:");
			}
			System.exit(0);
		}
		din.close();
		usr_inp.close();
		c.close();
	}
}