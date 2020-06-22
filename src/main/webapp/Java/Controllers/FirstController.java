package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/FirstPage")
    public String firstPage() {
        return "First/FirstPage";
    }

    @GetMapping("/SecondPage")
    public String secondPage() {
        return "First/SecondPage";
    }
}
