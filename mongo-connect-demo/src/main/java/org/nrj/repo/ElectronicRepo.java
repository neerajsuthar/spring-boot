package org.nrj.repo;

import org.nrj.entities.Electronics;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ElectronicRepo extends MongoRepository<Electronics, Integer> {

}
