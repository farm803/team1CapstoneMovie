package teamcapstonemovie.domain;

import teamcapstonemovie.domain.*;
import teamcapstonemovie.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ReservationCancelled extends AbstractEvent {

    private Long id;
    private Integer movieId;
    private Integer reservationId;
    private Integer seatCnt;
    private Date cancelledDate;

    public ReservationCancelled(Reservation aggregate){
        super(aggregate);
    }
    public ReservationCancelled(){
        super();
    }
}
