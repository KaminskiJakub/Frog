import java.util.Scanner;

public class Frog {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Start point: ");
		int X = scanner.nextInt();
		System.out.println("End point: ");
		int Y = scanner.nextInt();
		System.out.println("Distance of 1 jump: ");
		int D = scanner.nextInt();
		scanner.close();

		Solution frogjump = new Solution();
		System.out.println(frogjump.solution(X, Y, D));

	}
}

class Solution {

	public int solution(int X, int Y, int D) {

		int count = 0;

		if (X <= Y) {
			for (int i = X; i <= Y; i += D) {
				count++;
			}
			System.out.println("Jumps needed to cover the distance: ");
		} else {
			System.out.println("Read instructions again and type right numbers.");
		}
		return count;
	}
}
