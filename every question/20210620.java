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