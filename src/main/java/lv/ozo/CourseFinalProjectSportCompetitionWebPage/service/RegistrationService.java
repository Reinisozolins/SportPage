package lv.ozo.CourseFinalProjectSportCompetitionWebPage.service;

import lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity.ParticipantsDataEntity;

import java.util.List;

public interface RegistrationService {
    List<ParticipantsDataEntity> getAllParticipants();
    void save(ParticipantsDataEntity participantsDataEntity);
    void delete(ParticipantsDataEntity participantsDataEntity);
}
