package hello;

import org.springframework.data.repository.CrudRepository;

import hello.Table1;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface Table1Repository extends CrudRepository<Table1, Long> {

}
