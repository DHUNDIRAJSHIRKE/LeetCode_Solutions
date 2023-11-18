package q_733_FloodFill;

import static q_733_FloodFill.Solution.floodFill;
import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[][] image = { { 0, 0, 0 }, { 0, 0, 0 } };
		int sr = 0, sc = 0, color = 0;
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				System.out.print(image[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		image = floodFill(image, sr, sc, color);
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				System.out.print(image[i][j]);
			}
			System.out.println();
		}
	}
}
