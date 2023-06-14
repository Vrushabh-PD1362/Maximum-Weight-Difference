import java.util.Scanner;
import java.util.Arrays;

public class MaximumWeightDifference {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of N (total items) : ");
		int N = sc.nextInt();

		int[] arr = new int[N];

		System.out.println("Enter weights of respective "+N+" items : ");

		for(int i = 0; i < N; i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter value of K : ");
		int K = sc.nextInt();

		Arrays.sort(arr);

		int son_items_sum = 0;
		int chef_items_sum = 0;

		for(int j = 0; j < K; j++) {

			son_items_sum = son_items_sum + arr[j];
		}

		for(int j = K; j < N; j++) {

			chef_items_sum = chef_items_sum + arr[j];
		}

		int result = chef_items_sum - son_items_sum;

		System.out.println("The maximum possible difference between weights : "+result+" grams");

		sc.close();
	}
}

		

	