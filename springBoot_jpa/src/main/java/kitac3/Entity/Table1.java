package kitac3.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity // This tells Hibernate to make a table out of this class
@Data
@Table(name="table1")
public class Table1 {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;

    private String name;

    private String data;


    /*
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
*/

}

