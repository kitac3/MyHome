package Entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.Data;

@Embeddable
@Data
public class SenserdataPK implements Serializable {

	@Embedded
	  String sn_id;
	  String sn_epid;
	  String sn_cid;
	  int measure_sequence;
	  java.sql.Timestamp measure_datetime;
}
