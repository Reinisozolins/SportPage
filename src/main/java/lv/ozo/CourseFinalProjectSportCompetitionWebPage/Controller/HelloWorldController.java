package lv.ozo.CourseFinalProjectSportCompetitionWebPage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    String index(){
        return "Hello big project";
    }
}
