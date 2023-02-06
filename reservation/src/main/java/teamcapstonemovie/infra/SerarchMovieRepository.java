package teamcapstonemovie.infra;

import teamcapstonemovie.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="serarchMovies", path="serarchMovies")
public interface SerarchMovieRepository extends PagingAndSortingRepository<SerarchMovie, Long> {

    

    
}
