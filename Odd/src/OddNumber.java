import java.util.Scanner;
public class OddNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		for(int i = 1;i<=n;i++)
		{
			if(i%2==1) {
				System.out.println(i);
			}
			else {
				i=i+1;
			}
		}

	}

}
