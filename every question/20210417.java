import java.util.Scanner;
 
public class StringUtil {
     
    //不要2
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
         
        int[][] grid = new int[row][col];
        //横向判断蛋糕位置
        for(int i=0; i<row; i++){
            if(i%4 == 0 || i%4 == 1){
                for(int j=0; j<col; j++){
                    if(j%4 == 0 || j%4 == 1){
                        grid[i][j] = 1;
                    }
                }
            }
            //纵向判断蛋糕位置
            else{
                for(int j=0; j<col; j++){
                    if(j%4 ==2 || j%4 == 3){
                        grid[i][j] = 1;
                    }
                }
            }
        }
        int sum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}