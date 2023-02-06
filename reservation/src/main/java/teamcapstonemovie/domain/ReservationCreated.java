package teamcapstonemovie.domain;

import teamcapstonemovie.domain.*;
import teamcapstonemovie.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ReservationCreated extends AbstractEvent {

    private Long id;
    private Integer movieId;
    private Integer reservationId;
    private Integer seatCnt;
    private Date reservatedDate;

    public ReservationCreated(Reservation aggregate){
        super(aggregate);
    }
    public ReservationCreated(){
        super();
    }
}
