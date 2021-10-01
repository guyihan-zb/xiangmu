/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-09-30
 * @time: 21:22
 */
public class test3 {
    static int arr[] = new int[10];

    public static void main1(String[] args) {
        System.out.println(arr[1]); //0
    }

    public static void main2(String[] args) {
        double value = 11.5;
        System.out.println(Math.round(value));
        System.out.println(Math.floor(value));
        System.out.println(Math.ceil(value));
    }

    public static void main(String[] args) {
        int i =0;
        int j = 0;
        if((++i>0) || (++j>0)){
            System.out.println(i);
            System.out.println(j);
        }
    }
}
