/*Jeff Sheeler
 * 15 February 2016
 * Lab 2
 */

import java.io.*;

public class driverDFA{
	public static void main(String args[])
		throws IOException{
		ManWolf j = new ManWolf();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s = in.readLine();
		while(s!=null){
			j.reset();
			j.process(s);
			if(j.accepted())
				System.out.println("That is a solution!");
			else
				System.out.println("That is not a solution.");
			
			s=in.readLine();
		}
		
		}
}