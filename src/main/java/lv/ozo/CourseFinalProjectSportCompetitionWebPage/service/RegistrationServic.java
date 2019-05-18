package lv.ozo.CourseFinalProjectSportCompetitionWebPage.service;

import lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity.Registration;
import lv.ozo.CourseFinalProjectSportCompetitionWebPage.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServic implements RegistrationService {

@Autowired
private RegistrationRepository registrationRepository;

@Override
    public void save(Registration registration){registrationRepository.save(registration);

}

}

