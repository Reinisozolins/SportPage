package lv.ozo.CourseFinalProjectSportCompetitionWebPage.repository;

import lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}