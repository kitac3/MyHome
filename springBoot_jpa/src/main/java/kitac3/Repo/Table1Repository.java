package kitac3.Repo;

import org.springframework.data.repository.CrudRepository;

import kitac3.Entity.Table1;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface Table1Repository extends CrudRepository<Table1, Long> {

}
