import java.util.Arrays;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-18
 * @time: 16:50
 */
public class Sort2 {
    public static void main(String[] args) {
        //插入排序:定义一个待插入的数，再定义一个待插入数的前一个数的下标，然后拿待插入数与前面的数组一一比较，最后交换。
        int [] a = {3,44,38,5,47,15,36,26,27,2};
        for(int i=0;i<a.length;i++){
            //定义待插入的数
            int temp = a[i];
            //找到待插入数的前一个数的下标
            int index = i-1;
            //拿a[i]与a[i-1]的前面数组比较
            while(index >= 0 && a[index]>temp){
                a[index+1] = a[index];
                index --;
            }
            a[index+1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
