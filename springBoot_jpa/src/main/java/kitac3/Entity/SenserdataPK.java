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
//	private static final long serialVersionUID = 7359837140087885419L;
//	//	@Embedded
//	int measure_sequence;
//	public int getMeasure_sequence() {
//		return measure_sequence;
//	}
//	public void setMeasure_sequence(int measure_sequence) {
//		this.measure_sequence = measure_sequence;
//	}
//	public java.sql.Timestamp getMeasure_datetime() {
//		return measure_datetime;
//	}
//	public void setMeasure_datetime(java.sql.Timestamp measure_datetime) {
//		this.measure_datetime = measure_datetime;
//	}
//	public String getSn_cid() {
//		return sn_cid;
//	}
//	public void setSn_cid(String sn_cid) {
//		this.sn_cid = sn_cid;
//	}
//	public String getSn_epid() {
//		return sn_epid;
//	}
//	public void setSn_epid(String sn_epid) {
//		this.sn_epid = sn_epid;
//	}
//	public String getSn_id() {
//		return sn_id;
//	}
//	public void setSn_id(String sn_id) {
//		this.sn_id = sn_id;
//	}
//	
//	public SenserdataPK() {
//		
//	}
//	
//	public SenserdataPK(int measure_sequence, Timestamp measure_datetime, String sn_cid, String sn_epid, String sn_id) {
//		super();
//		this.measure_sequence = measure_sequence;
//		this.measure_datetime = measure_datetime;
//		this.sn_cid = sn_cid;
//		this.sn_epid = sn_epid;
//		this.sn_id = sn_id;
//	}
	
	int measure_sequence;
	java.sql.Timestamp measure_datetime;
	String sn_cid;
	String sn_epid;
	String sn_id;
}
