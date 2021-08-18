import java.util.Arrays;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-18
 * @time: 18:07
 */
public class Sort4 {
    //快速排序
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low>high) return;
        int i =low;
        int j = high;
        int temp = arr[low];
        //基准位,low=length时，会报异常，java.lang.ArrayIndexOutOfBoundsException:
        // 所以必须在if判断后面,就跳出方法。
        while(i<j){
            //先从右边开始往左递减，找到比temp小的值才停止
            while(temp<=arr[j] && i<j){
                j--;
            }
            //再看左边开始往右递增，找到比temp大的值才停止
            while(temp>=arr[i] && i<j){
                i++;
            }
            //满足 i<j 就交换,继续循环while(i<j)
            if(i<j){
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        //最后将基准位跟  a[i]与a[j]相等的位置，进行交换,此时i=j
        arr[low] = arr[i];
        arr[i] = temp;
        //左递归
        quickSort(arr, low, j-1);
        //右递归
        quickSort(arr, j+1, high);
    }

}
