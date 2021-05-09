package repositories;

import org.springframework.data.repository.CrudRepository;

import entity.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
	
}
