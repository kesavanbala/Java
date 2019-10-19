import java.util.Scanner;

public class First {

	public static void main(String[] args) {
				//Removed and Trial Fetech
				String r="";
				int c=0;
				String st="tamil nadu is beautiful city";
				for(int i=0;i<st.length();i++)
				{
					int count = 0;
					for(int j=i+1;j<st.length();j++)
					{
						if(Character.toString(st.charAt(i)).equals(Character.toString(st.charAt(j))))
								{
								count++;
								}
					}
					if(count==0)
					{
						c++;
					}
					if(c==2)
					{
						System.out.println(st.charAt(i));
						
					}
				}
	
	
	
	}
}
