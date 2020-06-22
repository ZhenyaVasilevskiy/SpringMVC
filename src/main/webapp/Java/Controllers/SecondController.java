package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/second")
public class SecondController {

    @GetMapping("/end")
    public String exit() {
        return "Second/End";
    }
}
