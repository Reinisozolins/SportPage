package lv.ozo.CourseFinalProjectSportCompetitionWebPage.Controller;

import lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity.Registration;
import lv.ozo.CourseFinalProjectSportCompetitionWebPage.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/registration")
    public String login(Model model) {
        model.addAttribute("registration", new Registration());
        return "registration/Registration";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping(value = "registration")
    public String submitRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result,
                                     Model model, RedirectAttributes ra) {
        if (result.hasErrors()) {
            return "registration/Registration";
        }
        this.registrationService.save(registration);
        ra.addAttribute("submitted", true);
        return "redirect:/registration";

    }
}
