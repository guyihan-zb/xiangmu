public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array.length==0){
            return false;
        }
        int hang = array.length;
        int lie = array[0].length;
        for(int i=0;i<hang;i++){
            for(int j=0;j<lie;j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}

//第二种
public class Solution {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        if(row==0){
            return false;
        }
        if(col==0){
            return false;
        }
        //左下
        int row1 = row -1;
        int col1 = 0;
        while(col > col1 && row1 >= 0){
            if(array[row1][col1] < target){
                col1++;
            }else if(array[row1][col1] > target){
                row1--;
            }else{
                return true;
            }
        }
        return false;
    }
}