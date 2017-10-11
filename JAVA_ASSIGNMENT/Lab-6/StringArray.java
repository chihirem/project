

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products");
		int N = sc.nextInt();
		String[] products = new String[N];
		
		//read in products into the array
		for (int i= 0;  i < N; i++){
			System.out.println("Enter a product Name");
			products[i] = sc.next();
		}
		
		//calling the static method sort on products array
		sort(products);
		
		//using for each loop print the sorted elements in ascending order
		for (String x : products) {
			System.out.println(x);
		}
		sc.close();
	}
	
	// sort the products in ascending order using the selection sort	
	public static void sort(String[] s){
		for(int i = 0; i < s.length; i++){
			for(int j = i; j < s.length; j++){
				if(s[i].compareTo(s[j]) > 0)
					exchange(s,i,j);
				
			}
		}
		
	}
	
	//exchange the strings at positions i and j
	public static void exchange(String[] s, int i, int j){
		String temp;
		temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}

}
