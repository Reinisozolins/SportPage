package lv.ozo.CourseFinalProjectSportCompetitionWebPage.repository;

import lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity.ParticipantsDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<ParticipantsDataEntity, Long> {

}
