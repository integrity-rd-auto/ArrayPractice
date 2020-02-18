import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {

		int[] a = new int[5];

		// int []a= {1,2,3,4,5};

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		System.out.println(a.length);

		for (int m : a) {

			System.out.println(m);

		}
		System.out.println("Enter any Number");
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		for (int i = 0; i < a.length; i++) {

			if (a[i] == k) {
				
				System.out.println("true");
				break;
			}
			else {
				System.out.println("false");
				break;
			}

		}

	}

}
