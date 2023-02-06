package teamcapstonemovie.domain;

import teamcapstonemovie.domain.*;
import teamcapstonemovie.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ReservationCancelled extends AbstractEvent {

    private Long id;
    private Integer movieId;
    private Integer reservationId;
    private Integer seatCnt;
    private Date cancelledDate;
}


