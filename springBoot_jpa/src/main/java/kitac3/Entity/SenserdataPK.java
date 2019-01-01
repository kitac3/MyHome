package kitac3.Entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
//@NoArgsConstructor
public class SenserdataPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7359837140087885419L;
	@Embedded
	  String sn_id;
	  String sn_epid;
	  String sn_cid;
	  int measure_sequence;
	  java.sql.Timestamp measure_datetime;
}
