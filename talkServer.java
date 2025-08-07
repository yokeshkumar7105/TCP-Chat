import java.io.*;
import java.net.*;
public class talkServer
{
	public static void main(String args[])throws Exception
	{
		ServerSocket m=null;
		Socket c=null;
		BufferedReader usr_inp=null;
		BufferedReader din=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dout=null;
		try
		{
			m=new ServerSocket(1234);
			c=m.accept();
			usr_inp=new BufferedReader(new InputStreamReader(c.getInputStream()));
			dout=new
			DataOutputStream(c.getOutputStream());
		}
		catch(IOException e)
		{}
		if(c!=null||usr_inp!=null)
		{
			String unip;
			while(true)
			{
				System.out.println("\nmessage from client:");
				String m1=usr_inp.readLine();
				if (m1 == null || m1.equalsIgnoreCase("exit")) {
					System.out.println("Client disconnected.");
					break;
				}
				System.out.println(m1);
				System.out.println("enter message:");
				unip=din.readLine();
				dout.writeBytes(unip + "\n");
				if (unip.equalsIgnoreCase("exit")) {
					System.out.println("Server exiting.");
					break;
				}
			}
		}
		if (dout != null) {
			dout.close();
		}
		if (usr_inp != null) {
			usr_inp.close();
		}
		if (c != null) {
			c.close();
		}
	}
}