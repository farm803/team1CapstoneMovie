package teamcapstonemovie.domain;

import teamcapstonemovie.domain.*;
import teamcapstonemovie.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private String payId;
    private Integer reservationId;
    private Integer reservedAmt;
    private Integer reservedSeatCnt;
    private String payStatus;
    private String payMethod;
    private Date paidDate;

    public PaymentApproved(Payment aggregate){
        super(aggregate);
    }
    public PaymentApproved(){
        super();
    }
}
