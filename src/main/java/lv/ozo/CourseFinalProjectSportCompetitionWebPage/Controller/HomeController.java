package lv.ozo.CourseFinalProjectSportCompetitionWebPage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    String index(){
        return "Hello big project. \n \n Try http://localhost:8080/index";
    }

    @GetMapping("/index")
    public String mainPage() {
        return "index";
    }




}
