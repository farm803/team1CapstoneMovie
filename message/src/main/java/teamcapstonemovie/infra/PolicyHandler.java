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
    @Autowired MessageRepository messageRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='ReservationCreated'")
    public void wheneverReservationCreated_SendConfirmMsg(@Payload ReservationCreated reservationCreated){

        ReservationCreated event = reservationCreated;
        System.out.println("\n\n##### listener SendConfirmMsg : " + reservationCreated + "\n\n");


        

        // Sample Logic //
        Message.sendConfirmMsg(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='ReservationCancelled'")
    public void wheneverReservationCancelled_SendCancelMsg(@Payload ReservationCancelled reservationCancelled){

        ReservationCancelled event = reservationCancelled;
        System.out.println("\n\n##### listener SendCancelMsg : " + reservationCancelled + "\n\n");


        

        // Sample Logic //
        Message.sendCancelMsg(event);
        

        

    }

}


