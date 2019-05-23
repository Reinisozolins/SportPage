package lv.ozo.CourseFinalProjectSportCompetitionWebPage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParticipantController {

    @GetMapping("/participants")
    public String participantPage(){
        return "participants/Participants";
    }
}
