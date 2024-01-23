package stringss;
import java.util.Arrays;
import java.util.Scanner;
public class StringEx1 
{
	Scanner sc=new Scanner(System.in);
     void m1()
     {
    	 System.out.println("String Direct Initialization");
    	 String s1="Java";
    	 System.out.println(s1);
    	 
    	 //System.out.println("Reading String input from user");
    	 //String s2=sc.next(); //sc.nextLine();
    	 //System.out.println(s2);
    	 
    	 System.out.println("length of the string");
    	 System.out.println(s1.length());
    	 
    	 System.out.println("accessing char from string using index");
    	 System.out.println(s1.charAt(3));
    	 
    	 System.out.println("Concatenate strings");
    	 String s3="Core";
    	 System.out.println(s3+" "+s1);
    	 System.out.println(s3.concat(s1));
    	 System.out.println(s3);
    	 System.out.println(s1);
    	 
    	 System.out.println("Index of a particular character");
    	 System.out.println(s1.indexOf('a'));
    	 System.out.println(s1.lastIndexOf('a'));
    	 
    	 System.out.println("Repeat the given string");
    	 System.out.println(s1.repeat(10));
    	 
    	 System.out.println("convert string to uppercase");
    	 System.out.println(s1.toUpperCase());
    	 
    	 System.out.println("convert string to lowercase");
    	 System.out.println(s1.toLowerCase());
    	 
    	 String str1="Java"; //scp 1010
    	 String str2="Java"; //scp 1010
    	 String str3="JAVA";  //scp 1020
    	 String str4=new String("Java"); // heap 2010
    	 String str5=new String("JAVA");
    	 
    	 System.out.println(str1==str2);
    	 System.out.println(str1==str3);
    	 System.out.println(str1==str4);
    	 System.out.println(str1.equals(str4)); 
    	 System.out.println(str1.equals(str5));
    	 System.out.println(str1.equalsIgnoreCase(str5));
    	 
    	 System.out.println(str1.compareTo(str2)); //equal -0
    	 System.out.println(str1.compareTo(str3)); //1>2  - positive
    	 System.out.println(str5.compareTo(str1)); //1<2 - negative
    	 System.out.println(str1.compareToIgnoreCase(str3));
    	 
    	 String res=s1.replace('J', 'Z');
    	 System.out.println(res);
    	 System.out.println(s1);
    	 
    	 String str8="Java-Programming-Language";
    	 System.out.println(str8.substring(5));
    	 System.out.println(str8.substring(5,9));
    	 
    	 String str9="    python   ";
    	 System.out.println(str9);
    	 System.out.println(str9.trim());
    	 
    	 String[] arr=str8.split("-");
    	 System.out.println(Arrays.toString(arr));
    	 
    	 String joinedString=String.join(" ",arr);
    	 System.out.println(joinedString); 
    	 
     }
	
     void m2()
     {
    	 String s1="java programming language";
    	 System.out.println(s1);
    	 
     }
     public static void main(String[] args) 
	{
		StringEx1 obj=new StringEx1();
		obj.m1();
		obj.m2();
	}
}
