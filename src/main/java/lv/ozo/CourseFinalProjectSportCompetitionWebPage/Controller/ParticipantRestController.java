package lv.ozo.CourseFinalProjectSportCompetitionWebPage.Controller;

import lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity.ParticipantsDataEntity;
import lv.ozo.CourseFinalProjectSportCompetitionWebPage.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/participants")
public class ParticipantRestController {

    @Autowired
    private RegistrationRepository registrationRepository;

    public ParticipantRestController(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @GetMapping
    public List<ParticipantsDataEntity> getAllParticipants() {
        return this.registrationRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParticipantsDataEntity> getIssue(@PathVariable("id") Optional<ParticipantsDataEntity> participantsDataEntity) {
        if (!participantsDataEntity.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(participantsDataEntity.get(), HttpStatus.OK);
    }

}

















