package teamcapstonemovie.domain;

import teamcapstonemovie.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class ReservationCreated extends AbstractEvent {

    private Long id;
    private Integer movieId;
    private Integer reservationId;
    private Integer seatCnt;
    private Date reservatedDate;
}
