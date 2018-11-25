package kitac3.Entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
public class SenserdataPK implements Serializable {
	@Embedded
	int measure_sequence;
	java.sql.Timestamp measure_datetime;
	String sn_cid;
	String sn_epid;
	String sn_id;
}
