
依照题意进行模拟就行，初始化光标位置为1，初始列表为1 2 3 4(如果总歌曲n小于4首就初始化为1,...,n)。翻页的时候分为以下几种情况：
(1) U操作：
i) 如果光标cur大于1，就直接自减1，但cur==list[0]的时候表示光标在顶部，U操作会使得整个列表自减1，还需要更新歌曲列表。
ii) 光标等于1，则直接cur=n跳到最后一首歌，并更新列表为最后min(4, n)首歌。
(2) D操作：
i) 如果光标cur小于n，就直接自增1，但cur==list[list.length-1]的时候表示光标在底部，D操作会使得整个列表自增1，还需要更新歌曲列表。
ii) 光标等于n，则直接cur=1跳到第一首歌，并更新列表为前min(4, n)首歌。

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            int n = Integer.parseInt(line);
            String op = br.readLine().trim();
            // 初始化光标位置
            int cur = 1;
            // 初始化列表
            int[] list = new int[Math.min(n, 4)];
            for(int i = 0; i < list.length; i++)
                list[i] = i + 1;
            for(int i = 0; i < op.length(); i++){
                if(op.charAt(i) == 'U'){
                    if(cur > 1){
                        if(cur != list[0]){
                            // 光标不在本页顶部，U操作不需要更新列表
                            cur --;
                        }else{
                            // 否则列表需要更新
                            cur --;
                            for(int j = 0; j < list.length; j++)
                                list[j] --;
                        }
                    }else{
                        // 光标在1，需要跳到n
                        cur = n;
                        // 歌曲列表显示最后list.length首歌
                        int temp = cur;
                        for(int j = list.length - 1; j >= 0; j--) {
                            list[j] = temp;
                            temp --;
                        }
                    }
                }else{
                    if(cur < n){
                        if(cur != list[list.length - 1]){
                            // 光标不在本页底部，D操作不需要更新列表
                            cur ++;
                        }else{
                            // 否则列表需要更新
                            cur ++;
                            for(int j = 0; j < list.length; j++)
                                list[j] ++;
                        }
                    }else{
                        // 光标在n，需要跳到1
                        cur = 1;
                        // 歌曲列表显示最开始的list.length首歌
                        int temp = cur;
                        for(int j = 0; j < list.length; j++) {
                            list[j] = temp;
                            temp ++;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < list.length; i++)
                sb.append(list[i] + " ");
            System.out.println(sb.toString().trim());
            System.out.println(cur);
        }
    }
}