package teamcapstonemovie.domain;

import teamcapstonemovie.domain.MovieModified;
import teamcapstonemovie.domain.MovieRegistered;
import teamcapstonemovie.domain.MovieDeleted;
import teamcapstonemovie.MovieApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Movie_table")
@Data

public class Movie  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String movieId;
    
    
    
    
    
    private String movieName;
    
    
    
    
    
    private Date reservatedDate;
    
    
    
    
    
    private Integer seatCnt;
    
    
    
    
    
    private Long price;
    
    
    
    
    
    private Date startDate;
    
    
    
    
    
    private Date endDate;
    
    
    
    
    
    private Boolean scheduled;
    
    
    
    
    
    private Integer reservatonId;

    @PostPersist
    public void onPostPersist(){


        MovieModified movieModified = new MovieModified(this);
        movieModified.publishAfterCommit();



        MovieRegistered movieRegistered = new MovieRegistered(this);
        movieRegistered.publishAfterCommit();



        MovieDeleted movieDeleted = new MovieDeleted(this);
        movieDeleted.publishAfterCommit();

    }

    public static MovieRepository repository(){
        MovieRepository movieRepository = MovieApplication.applicationContext.getBean(MovieRepository.class);
        return movieRepository;
    }




    public static void seatDecrease(ReservationCreated reservationCreated){

        /** Example 1:  new item 
        Movie movie = new Movie();
        repository().save(movie);

        */

        /** Example 2:  finding and process
        
        repository().findById(reservationCreated.get???()).ifPresent(movie->{
            
            movie // do something
            repository().save(movie);


         });
        */

        
    }
    public static void seatIncrease(ReservationCancelled reservationCancelled){

        /** Example 1:  new item 
        Movie movie = new Movie();
        repository().save(movie);

        */

        /** Example 2:  finding and process
        
        repository().findById(reservationCancelled.get???()).ifPresent(movie->{
            
            movie // do something
            repository().save(movie);


         });
        */

        
    }


}
