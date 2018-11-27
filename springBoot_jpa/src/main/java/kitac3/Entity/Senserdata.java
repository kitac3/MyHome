package kitac3.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // This tells Hibernate to make a table out of this class
@Data
@Table(name="senserdata")
public class Senserdata {
	
//    @EmbeddedId
//    SenserdataPK pk;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
	  String hes_header_id;
	  String hes_interface_id;
	  String hes_command_id;
	  String hes_endian_id;
	  String hes_reserve;
	  String hes_cr_id;
	  int hes_data_length;
	  int hes_data_count;
	  int hes_sequence_no;
	  int cr_data_length;
	  java.sql.Timestamp cr_time;
	  int cr_rssi_2;
	  String cr_reserve;
	  int sn_packet_length;
	  java.sql.Timestamp measure_datetime;
	  int measure_sequence;
	  String sn_id;
	  String sn_epid;
	  String sn_cid;
	  int sn_sequence_no;
	  String sn_option;
	  int sn_rssi_1;
	  int sn_combine_count;
	  float sn_battery_voltage;
	  float temperature;
	  float humidity;
	  int analog1;
	  int analog2;

}
