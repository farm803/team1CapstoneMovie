package teamcapstonemovie.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import teamcapstonemovie.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import teamcapstonemovie.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired MovieRepository movieRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='ReservationCreated'")
    public void wheneverReservationCreated_SeatDecrease(@Payload ReservationCreated reservationCreated){

        ReservationCreated event = reservationCreated;
        System.out.println("\n\n##### listener SeatDecrease : " + reservationCreated + "\n\n");


        

        // Sample Logic //
        Movie.seatDecrease(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='ReservationCancelled'")
    public void wheneverReservationCancelled_SeatIncrease(@Payload ReservationCancelled reservationCancelled){

        ReservationCancelled event = reservationCancelled;
        System.out.println("\n\n##### listener SeatIncrease : " + reservationCancelled + "\n\n");


        

        // Sample Logic //
        Movie.seatIncrease(event);
        

        

    }

}


