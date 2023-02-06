package teamcapstonemovie.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="SerarchMovie_table")
@Data
public class SerarchMovie {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
