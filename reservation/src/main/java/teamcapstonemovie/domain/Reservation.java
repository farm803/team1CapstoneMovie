package teamcapstonemovie.domain;

import teamcapstonemovie.domain.ReservationCreated;
import teamcapstonemovie.domain.ReservationCancelled;
import teamcapstonemovie.ReservationApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Reservation_table")
@Data

public class Reservation  {


    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String movieName;
    
    
    
    
    
    private String movieId;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Integer reservationId;
    
    
    
    
    
    private Integer reservatedDate;
    
    
    
    
    
    private Date reservatedSeatCnt;
    
    
    
    
    
    private Integer reservedAmt;
    
    
    
    
    
    private Integer reservedPoint;
    
    
    
    
    
    private ReservedPoint cancelledSeatCnt;
    
    
    
    
    
    private Integer cancelledDate;
    
    
    
    
    
    private Date cancelledPoint;
    
    
    
    
    
    private Integer cancelledAmt;

    @PostPersist
    public void onPostPersist(){


        ReservationCreated reservationCreated = new ReservationCreated(this);
        reservationCreated.publishAfterCommit();



        ReservationCancelled reservationCancelled = new ReservationCancelled(this);
        reservationCancelled.publishAfterCommit();

    }

    public static ReservationRepository repository(){
        ReservationRepository reservationRepository = ReservationApplication.applicationContext.getBean(ReservationRepository.class);
        return reservationRepository;
    }




    public static void updateStatus(PaymentCancelled paymentCancelled){

        /** Example 1:  new item 
        Reservation reservation = new Reservation();
        repository().save(reservation);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCancelled.get???()).ifPresent(reservation->{
            
            reservation // do something
            repository().save(reservation);


         });
        */

        
    }
    public static void updateStatus(PaymentApproved paymentApproved){

        /** Example 1:  new item 
        Reservation reservation = new Reservation();
        repository().save(reservation);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentApproved.get???()).ifPresent(reservation->{
            
            reservation // do something
            repository().save(reservation);


         });
        */

        
    }


}
