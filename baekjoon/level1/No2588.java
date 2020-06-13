package level1;
/*import java.util.Scanner;
public class No2588 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		sc.close();
		System.out.println(A*(B%10));
		System.out.println(A*((B/10)%10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
	}

}
*/





/*import java.util.Scanner;
public class No2588 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		String B=sc.next();
		sc.close();
		System.out.println(A*(B.charAt(2)-'0'));
		System.out.println(A*(B.charAt(1)-'0'));
		System.out.println(A*(B.charAt(0)-'0'));
		System.out.println(A*Integer.parseInt(B));
		
		
	}
}
*/





/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class No2588 {
	public static void main(String[]args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int A=Integer.parseInt(br.readLine());
		String B=br.readLine();
		
		char[] b=B.toCharArray();
		
		System.out.println(A*(b[2]-'0'));
		System.out.println(A*(b[1]-'0'));
		System.out.println(A*(b[1]-'0'));
		System.out.println(A*Integer.parseInt(B));
		
	}
}
*/




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No2588 {
	public static void main(String[]args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int A=Integer.parseInt(br.readLine());
		int B=Integer.parseInt(br.readLine());
		
		br.close();
		
		StringBuilder sb=new StringBuilder();
		sb.append(A*(B%10));
		sb.append('\n');
		
		sb.append(A*((B/10)%10));
		sb.append('\n');
		
		sb.append(A*(B/100));
		sb.append('\n');
		
		sb.append(A*B);
		System.out.print(sb);
		
	}
	
}






