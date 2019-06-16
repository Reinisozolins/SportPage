package lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity;

import javax.persistence.OneToOne;

public class Registration {
    private Long id;
    @OneToOne
    private Participant participant;
    private Race race;
}
