/**
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1.
 * The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 */
public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int islandPerimeter=0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[i].length ; j++) {
                if(grid[i][j]==1){
                    int add=4;
                    //上边
                    try{if(grid[i-1][j]==1)
                        add--;
                    }catch (Exception e){

                    }
                    //下
                    try{if(grid[i+1][j]==1)
                        add--;
                    }catch (Exception e){

                    }
                    //左
                    try{if(grid[i][j-1]==1)
                        add--;
                    }catch (Exception e){

                    }
                    //右
                    try{if(grid[i][j+1]==1)
                        add--;
                    }catch (Exception e){

                    }
                    islandPerimeter=islandPerimeter+add;

                }
            }
        }

        return islandPerimeter;
    }


    public static void main(String[] args){
        int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }
}
