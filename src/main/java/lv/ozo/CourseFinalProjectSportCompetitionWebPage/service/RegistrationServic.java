package lv.ozo.CourseFinalProjectSportCompetitionWebPage.service;

import lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity.ParticipantsDataEntity;
import lv.ozo.CourseFinalProjectSportCompetitionWebPage.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServic implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public void save(ParticipantsDataEntity participantsDataEntity) {
        registrationRepository.save(participantsDataEntity);

    }
    @Override
    public void delete(ParticipantsDataEntity participantsDataEntity) {
        registrationRepository.save(participantsDataEntity);

    }

    @Override
    public List<ParticipantsDataEntity> getAllParticipants() {
        return registrationRepository.findAll();

    }
}

