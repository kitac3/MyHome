package kitac3.Repo;

import org.springframework.data.repository.CrudRepository;

import kitac3.Entity.Tuser;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<Tuser, Long> {

}
