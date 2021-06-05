package thread_0530;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-05-30
 * @time: 10:52
 */
public class demo101 {
    public static void main(String[] args) {
        // 非线程安全的
        HashMap hashMap = new HashMap();

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        Hashtable<String, String> stringStringHashtable = new
                Hashtable<>();


    }
}
