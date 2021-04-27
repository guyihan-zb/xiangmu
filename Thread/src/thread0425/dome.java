package thread0425;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-27
 * @time: 16:03
 */
public class dome {
    public static void main(String[] args) throws InterruptedException {
        String content = "留声机在光影里飘来悠悠的乐声，夏日的午后，" +
                "靠在藤椅上，让摇椅随乐声晃动，绿色的虎皮蕉在脚边肆意蔓延微醺着，半梦半醒。";
        for(char item:content.toCharArray()){
            System.out.print(item);
            // 执行到此行休眠 300s
            Thread.sleep(300);
        }
    }
}
