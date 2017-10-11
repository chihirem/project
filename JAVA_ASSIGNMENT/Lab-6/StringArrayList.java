

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products");
		int N = sc.nextInt();
		ArrayList<String> products = new ArrayList<String>();
		for (int i= 0;  i < N; i++){
			System.out.println("Enter a product Name");
			products.add(sc.next());
		}
		
		products.sort(null);
		
		for (String x : products) {
			System.out.println(x);
		}
		sc.close();
	}

}
