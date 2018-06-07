package cn.lastlysly.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-03 11:02
 **/
public class MyTest {

    Map<String,String> map = new HashMap<String, String>(16);

    @Test
    public void hashMapDemo(){
        for (int i = 0;i<20;i++){
            map.put("测试"+i,i+"");
        }
        System.out.println(map.size());
        System.out.println(map.get("测试17"));
        System.out.println(map.get("测试15"));

    }
}
