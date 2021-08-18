import java.util.Arrays;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-18
 * @time: 19:24
 */
public class Sort5 {
    //归并排序(Merge Sort)
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2};
        int temp [] = new int [arr.length];
        mergsort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergsort(int[] arr, int left, int right, int[] temp) {
        if(left >= right) return;
        //分解
        if(left<right){
            int mid = left+(right-left)/2;
            //向左递归进行分解
            mergsort(arr,left,mid,temp);
            //向右递归进行分解
            mergsort(arr,mid+1,right,temp);
            //每分解一次便合并一次
            merge(arr,left,right,mid,temp);
        }
    }

    /**
     *
     * arr  待排序的数组
     * left  左边有序序列的初始索引
     * right 右边有序序列的初始索引
     * mid	中间索引
     * temp	做中转的数组
     */
    private static void merge(int[] arr, int left, int right, int mid, int[] temp) {
        int i = 0;
        int j = left,k = mid+1;  //左边序列和右边序列起始索引
        while(j <= mid && k <= right){
            if(arr[j] < arr[k]){
                temp[i++] = arr[j++];
            }else{
                temp[i++] = arr[k++];
            }
        }
        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while(j <= mid){
            temp[i++] = arr[j++];
        }
        // 把右边边剩余的数移入数组
        while(k <= right){
            temp[i++] = arr[k++];
        }

        for(int t=0;t<i;t++){
            arr[left+t] = temp[t];
        }
    }
}
