package teamcapstonemovie.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="SearchReservation_table")
@Data
public class SearchReservation {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
