// Problem: Sort Matrix by Diagonals
// Language: java

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int i=0;
        while(i<grid.length){
            int x = i;
            int y = 0;
            List<Integer> temp = new ArrayList<>();
            while(x<grid.length){
                temp.add(grid[x++][y++]);
            }
            Collections.sort(temp, Collections.reverseOrder());
            int m=0;
            x = i;
            y = 0;
            while(x<grid.length){
                grid[x++][y++] = temp.get(m++);
            }
            i++;
        }
        int j=1;
        while(j<grid.length){
            int x = 0;
            int y = j;
            List<Integer> temp = new ArrayList<>();
            while(y<grid.length){
                temp.add(grid[x++][y++]);
            }
            Collections.sort(temp);
            int m=0;
            x = 0;
            y = j;
            while(y<grid.length){
                grid[x++][y++] = temp.get(m++);
            }
            j++;
        }
        
        return grid;
    }
}