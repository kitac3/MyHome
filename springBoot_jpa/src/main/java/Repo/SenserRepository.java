package Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import Entity.Senserdata;
import Entity.SenserdataPK;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SenserRepository extends CrudRepository<Senserdata, SenserdataPK> {
	
//	@Query("select MEASURE_DATETIME,ANALOG1,ANALOG2 from senserdata s where  %:cond% order by SN_ID,MEASURE_DATETIME")
	@Query("select s from senserdata s where  %:cond% order by SN_ID,MEASURE_DATETIME")
	public List<Senserdata> findByDate(@Param("cond") String cond);

}
