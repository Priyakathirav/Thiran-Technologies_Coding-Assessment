import java.util.*;
public class IslandsCount{
    public int islandsCount(char[][]grid){
        if(grid==null||grid.length== 0){
            return 0;
        }
        int rows=grid.length;
        int columns=grid[0].length;
        int count=0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                if(grid[r][c]=='1'){
                    count++;  
                    dfsVisited(grid,r,c,rows,columns);
                }
            }
        }
        return count;
    }
    private void dfsVisited(char[][]grid,int r,int c,int rows,int columns){
        if(r<0||r>=rows||c<0||c>=columns){
            return;
        }
        if(grid[r][c]!='1'){
            return;
        }
        grid[r][c]='0';
        dfsVisited(grid,r-1,c,rows,columns);
        dfsVisited(grid,r+1,c,rows,columns);
        dfsVisited(grid,r,c-1,rows,columns);
        dfsVisited(grid,r,c+1,rows,columns);
    }
    public static void main(String[]args){
        IslandsCount solve=new IslandsCount();
        char[][]grid={{'1','1','1','1','0'},
                      {'1','1','0','1','0'},
                      {'1','1','0','0','0'},
                      {'0','0','0','0','0'}};
        int result=solve.islandsCount(grid);
        System.out.println(result);
    }
}