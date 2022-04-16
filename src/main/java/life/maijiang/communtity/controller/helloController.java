package life.maijiang.communtity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloController {
    //@RequestParam,不清楚请求参数是什么时，快捷键ctrl+p
    //其中，@RequestParam(name="he")，他的参数名叫什么，在这里他的参数名命名为：he(看访问链接)
    //启动后进入，使用http://localhost:8080/hello?he=jijie
    //k相当于属性，将he的值在赋予k
    @GetMapping("/hello")
    public String hello(@RequestParam(name="he") String k, Model model){
            model.addAttribute("name1",k);
        return "holle";
    }
}
