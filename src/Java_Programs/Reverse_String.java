package Java_Programs;

public class Reverse_String {

	public static void main(String[] args) {
		String name="Jagadeesh";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		
		}
		System.out.println("Reverse String"+"  "+ reverse);

	}

}
