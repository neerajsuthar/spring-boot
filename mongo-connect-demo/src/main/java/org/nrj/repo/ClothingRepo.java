package org.nrj.repo;

import org.nrj.entities.Clothing;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClothingRepo extends MongoRepository<Clothing, Integer> {

}
