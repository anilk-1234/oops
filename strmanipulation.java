public class strmanipulation
{
	public static void main(string[]args)
	{
		string str="Hello,world";
		int length=str. length();
		system.out.println("Length:"+length);
		
		string uppercase=str.touppercase();
		system.out.println("Uppercase:"+uppercase);
		
		string lowercase=str.toLowercase();
		system.out.println("Lowercase:" +lowercase);
		
		string replaced=str.replace('o','x');
		system.out.println("Replaced:"+replaced);
		
		string substring=str.substring(7,12);
		system.out.println("Substring:"+substring);
		

		boolean endsWith=str.endsWith("world!");
		system.out.println("Ends with 'world!':"+endsWith);
		
		string trimmed="Hello,world!".trim();
		system.out.println("Trimmed:"+trimmed);
	
	}
}
