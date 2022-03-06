package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("text-basic")
    public String textBasic(Model model){
        model.addAttribute("data","Hello <b>Spring!</b>");
        return "basic/text-basic";
    }

    //타임리프는 기본적으로 escape처리를 한다. 사용자들이 개발시 태그를 마구 생성할 수 있기 때문에, 문자로만 그대로 출력해주는 escape 처리를 해준다.
    @GetMapping("text-unescaped")
    public String textUnescaped(Model model){
        model.addAttribute("data","Hello <b>Spring!</b>");
        return "basic/text-unescaped";
    }
}
