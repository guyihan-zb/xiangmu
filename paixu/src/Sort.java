import java.util.Arrays;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-18
 * @time: 16:17
 */
public class Sort {
    //冒泡排序
    public static void main1(String[] args) {
        int [] a = {3,44,38,5,47,15,36,26,27,2};
        //记录比较次数
        int count = 0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(count);
    }

    //冒泡排序的优化
    public static void main(String[] args) {
        int [] a = {3,44,38,5,47,15,36,26,27,2};
        //记录比较次数
        int count = 0;
        for(int i=0;i<a.length-1;i++){
            boolean flag = true;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = false;
                }
                count++;
            }
            if(flag){
                break;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(count);
    }
}
