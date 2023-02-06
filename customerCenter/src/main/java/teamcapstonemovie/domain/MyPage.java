package teamcapstonemovie.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="MyPage_table")
@Data
public class MyPage {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long customerId;
        private Integer reservationId;
        private String movieId;
        private String reservationStatus;


}
