
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Insert frame_width");
		int frame_width = sc.nextInt();
		System.out.println("Insert frame_height");
		int frame_height = sc.nextInt();

		System.out.println("Insert pic_x");
		int pic_x = sc.nextInt();
		System.out.println("Insert pic_y");
		int pic_y = sc.nextInt();

		System.out.println("Insert pic_width");
		int pic_widt = sc.nextInt();
		System.out.println("Insert pic_height");
		int pic_height = sc.nextInt();
		System.out.println();

		int[][] Source = new int[frame_height][frame_width];

		for (int i = 0; i < Source.length; i++) {
			for (int j = 0; j < Source[0].length; j++) {

				Source[i][j] = (int) (Math.random() * 100);
				System.out.print(Source[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println();

		copyData(Source, pic_widt, pic_height, pic_x, pic_y);

		for (int i = 0; i < Source.length; i++) {
			for (int j = 0; j < Source[0].length; j++) {
				System.out.print(Source[i][j] + " ");

			}
			System.out.println();

		}
		sc.close();

	}

//function for copy Data 
	public static int[][] copyData(int[][] a, int pw, int ph, int x, int y) {
		int i;
		int j = 0;
		for (i = 0; i < ph; i++) {
			for (j = 0; j < pw; j++) {

				a[i][j] = a[i + y][j + x];

			}
		}
		return new int[i][j];
	}

}
