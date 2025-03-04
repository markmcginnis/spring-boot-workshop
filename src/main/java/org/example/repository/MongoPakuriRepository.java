package org.example.repository;

import org.example.models.Pakuri;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Profile("pakuri-repository-mongo")
@Repository("pakuri-repository-mongo")
public interface MongoPakuriRepository extends PakuriRepository, MongoRepository<Pakuri, String> {

}
