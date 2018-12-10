package cn.itcast.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {
    @RequestMapping("/info")
    public Map info(){
        Map hashMap = new HashMap();
        hashMap.put("name","zhangsan233333");
        return hashMap;
    }
    @RequestMapping("/info2")
    public String info2(){
        return "hello world  324333";
    }
    @RequestMapping("/info3")
    public String info3(){
        return "hello world  324333";
    }
    @RequestMapping("/info4")
    public String info4(){
        return "hello world  324333";
    }
}