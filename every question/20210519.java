
思路：
特殊判断：
    如果arr为空，或者长度<2,
            return;
    定义变量：even：表示目前arr最左边的偶数下标，初始值 even=0;
    定义变量：odd：表示目前arr最左边的奇数下标，初始值 odd=1;
    变量 end 表示数组最后一个元素的下标，end=arr.length-1;下标从0开始
  
  不断检查arr的最后一个元素arr[end]
    如果arr[end]是偶数
            则把最后一个数和前面定义的偶数下标位置的数交换。即交换 arr[end]和arr[even]
            同时 even += 2；
    如果arr[end]是奇数
            则把最后一个数和前面定义的奇数下标位置的数交换。即交换 arr[end]和arr[odd]
            同时 odd += 2；

public class Solution {
    /**
     * 奇数位上都是奇数或者偶数位上都是偶数
     * 输入：数组arr，长度大于2
     * 将arr调整成奇数位上都是奇数或者偶数位上都是偶数
     */
    public void oddInOddEvenInEven(int[] arr) {
        if(arr==null || arr.length<2){
            return;
        }
        int even=0;
        int odd=1;
        int end=arr.length-1;
        while(even <=end && odd<=end){
            if(arr[end]%2==0){
                swap(arr,end,even);
                even += 2;
            }else{
                swap(arr,end,odd);
                odd += 2;
            }
        }
    }
    public void swap(int[]array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}