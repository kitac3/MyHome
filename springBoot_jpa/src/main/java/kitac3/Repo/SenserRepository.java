
package kitac3.Repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import kitac3.Entity.Senserdata;
import kitac3.Entity.SenserdataPK;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SenserRepository extends CrudRepository<Senserdata, Long> {
	
//	@Query("select MEASURE_DATETIME,ANALOG1,ANALOG2 from senserdata s where  %:cond% order by SN_ID,MEASURE_DATETIME")
//	@Query("select s from senserdata s where  measure_datetime > :cond order by SN_ID,MEASURE_DATETIME")
//  Table名はClass名と同じである必要がある。
	@Query("select s from Senserdata s where  measure_datetime > :cond")
	public List<Senserdata> findByDate(@Param("cond") Date cond);
}
