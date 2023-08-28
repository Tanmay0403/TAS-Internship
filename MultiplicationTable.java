import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int i = 1;
		while(i<=10)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
			i++;
		}
		sc.close();

	}

}
