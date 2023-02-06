package teamcapstonemovie.domain;

import teamcapstonemovie.domain.*;
import teamcapstonemovie.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class MovieDeleted extends AbstractEvent {

    private Long id;

    public MovieDeleted(Movie aggregate){
        super(aggregate);
    }
    public MovieDeleted(){
        super();
    }
}
