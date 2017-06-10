import java.util.Scanner;


public class lab2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		String s1=new String(s);
		char ch[]=s1.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
			
		}

	}

}
