package AccessSpecfiers;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String val1="Testing$Masters$Hyderabd";
		
		String val2="Testing masters";
		
		//equals methods are used to to compare the 2 string
		//System.out.println(val1.equals(val2));
		
		//System.out.println(val1.equalsIgnoreCase(val2));
		
		//System.out.println(val1.contains("Masters"));
		
		//find the lendth of the string
		//System.out.println(val1.length());
		
		System.out.println(val1.charAt(3));
		
		//to convert entair string in to lowercase
		System.out.println(val1.toLowerCase());
		
		//to convert entair string in to uppercase
		System.out.println(val1.toUpperCase());
		//String index of character
		System.out.println(val1.indexOf('s'));
		
		//it will return last index of character
		System.out.println(val1.lastIndexOf('s'));
		
		
		//useing concat to merge the to string values
		System.out.println(val1.concat(val2));
		
		//to return string is empty or not
		System.out.println(val1.isEmpty());
		
		//to split the 2 parts by using special chracter
		String[] s=val1.split("$");
		System.out.println(s[0]);
		//System.out.println(s[1]);
		//System.out.println(s[2]);
		
		//trim method are used to remove the space starting and ending of string
		String name="  Testing ";
		
		System.out.println(name.length());
		System.out.println(name);
		
		System.out.println(name.trim());
		System.out.println(name.trim().length());
		
		
		
		//Substring
		
		System.out.println(val1.substring(2, 5));
		
		
		
		
		
		
		
		
		
		

	}

}
