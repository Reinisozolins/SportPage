package lv.ozo.CourseFinalProjectSportCompetitionWebPage.Controller;

import lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity.ParticipantsDataEntity;
import lv.ozo.CourseFinalProjectSportCompetitionWebPage.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/registration")
    public String login(Model model) {
        model.addAttribute("registration", new ParticipantsDataEntity());
        return "registration/Registration";
    }



    @PostMapping(value = "/registration")
    public String submitRegistration(@Valid @ModelAttribute("participantsDataEntity") ParticipantsDataEntity participantsDataEntity, BindingResult result,
                                     Model model, RedirectAttributes ra) {
        if (result.hasErrors()) {
            return "participants/Participants";
        }
        this.registrationService.save(participantsDataEntity);
        ra.addAttribute("submitted", true);
        return "redirect:/registration";

    }
    @GetMapping("/participants")
    public String getParticipants(Model model) {
        model.addAttribute("participants", this.registrationService.getAllParticipants());
        return "participants/Participants";
    }
    @GetMapping("/registration/delete/{id}")
    public String deleteParticipants (Model model, @PathVariable("id") Optional<ParticipantsDataEntity> participantsDataEntity){
        participantsDataEntity.ifPresent(participants -> this.registrationService.delete(participants));
        return  "redirect:/participants";
    }
}