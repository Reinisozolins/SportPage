package lv.ozo.CourseFinalProjectSportCompetitionWebPage.Entity;

import java.time.LocalDateTime;

public class Results {
    private Long id;
    private Race race;
    private Participant participant;
    private Integer place;
    private LocalDateTime started;
    private LocalDateTime finished;
    private Integer points;
}
