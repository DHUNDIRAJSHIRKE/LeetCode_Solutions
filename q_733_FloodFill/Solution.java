package q_733_FloodFill;

/*
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. 
You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, 
plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
 plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. 
Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.
*/

class Solution {
	public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		if (sr < image.length && sr >= 0 && sc < image[sr].length && sc >= 0) {
			int prev_color = image[sr][sc];
			if (image[sr][sc] != color && image[sr][sc] == prev_color) {
				image[sr][sc] = color;
				if (sr - 1 >= 0) {
					floodFiller(image, sr - 1, sc, color, prev_color);
				}
				if (sc - 1 >= 0) {
					floodFiller(image, sr, sc - 1, color, prev_color);
				}
				if (sr + 1 <= image.length) {
					floodFiller(image, sr + 1, sc, color, prev_color);
				}
				if (sc + 1 <= image[sr].length) {
					floodFiller(image, sr, sc + 1, color, prev_color);
				}
			}
		}
		return image;
	}

	private static void floodFiller(int[][] image, int sr, int sc, int color, int prev_color) {
		if (sr < image.length && sr >= 0 && sc < image[sr].length && sc >= 0) {
			if (image[sr][sc] != color && image[sr][sc] == prev_color) {
				image[sr][sc] = color;
				if (sr - 1 >= 0) {
					floodFiller(image, sr - 1, sc, color, prev_color);
				}
				if (sc - 1 >= 0) {
					floodFiller(image, sr, sc - 1, color, prev_color);
				}
				if (sr + 1 <= image.length) {
					floodFiller(image, sr + 1, sc, color, prev_color);
				}
				if (sc + 1 <= image[sr].length) {
					floodFiller(image, sr, sc + 1, color, prev_color);
				}
			}
		}
	}
}