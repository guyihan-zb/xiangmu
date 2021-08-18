/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-18
 * @time: 17:47
 */
public class Sort3 {
    //希尔排序(Shell Sort)
    //每一轮按照事先决定的间隔进行插入排序，间隔会依次缩小，最后一次一定要是1。
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2};
        int length = arr.length;
        //区间
        int gap = 1;
        while (gap < length) {
            gap = gap * 3 + 1;
        }
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                int tmp = arr[i];
                int j = i - gap;
                //跨区间排序
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
            gap = gap / 3;
        }
    }
}
