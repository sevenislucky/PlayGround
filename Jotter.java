import java.util.ArrayList;
public class Jotter{
  public static void main(String[] args) {

    final String alphabet = "abcdefg"; // sets a string abcdefg for the grid

    int gridLength = 7; // length of the grid

    int gridSize = 49; // how many cells it will contain 7 x 7 = 49 ;)

    int [][] grid = {gridLength,gridSize};

    for (int i=0; i < grid[0].length; ++i) {
    System.out.println(grid[i]);
    }
  }
}
