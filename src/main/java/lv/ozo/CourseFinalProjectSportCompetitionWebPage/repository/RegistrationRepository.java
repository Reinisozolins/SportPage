package lv.ozo.CourseFinalProjectSportCompetitionWebPage.repository;

import lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity.ParticipantsDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<ParticipantsDataEntity, Long> {
    @Query(value = "SELECT i FROM ParticipantsDataEntity i ")
    List<ParticipantsDataEntity> findAll();

}
