package teamcapstonemovie.domain;

import teamcapstonemovie.domain.*;
import teamcapstonemovie.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class MovieRegistered extends AbstractEvent {

    private Long id;

    public MovieRegistered(Movie aggregate){
        super(aggregate);
    }
    public MovieRegistered(){
        super();
    }
}
