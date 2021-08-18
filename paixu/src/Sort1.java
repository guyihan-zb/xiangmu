import java.util.Arrays;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-18
 * @time: 16:39
 */
public class Sort1 {

    //选择排序:先定义一个记录最小元素的下标，然后循环一次后面的，找到最小的元素，最后将他放到前面排序好的序列。
    public static void main(String[] args) {
        int [] a = {3,44,38,5,47,15,36,26,27,2};
        for(int i=0;i<a.length-1;i++) {
            int min = i;//标记第一个为待比较的数
            for (int j = i + 1; j < a.length; j++) {//然后从后面遍历与第一个数比较
                if (a[j] < a[min]) {//如果比最小的数小，就交换
                    min = j;//保存最小元素的下标
                }
            }
            //找到最小值后，将最小的值放到第一的位置，进行下一遍循环
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
