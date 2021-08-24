/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-08-23
 * @time: 16:06
 */
public class test10823 {
    public static void main(String[] args) {
        float a = (float) 0.1415926535898;
        int[] arr = new int[2];
        for (int i = 1; i <= 200 - 1; i++) {
            for (int j = i + 1; j <= 200; j++) {
                float s = (float) i / j;
                if (s == a) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        System.out.println(arr);
    }
}
