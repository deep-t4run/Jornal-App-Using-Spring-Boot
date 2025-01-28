package com.parth.journalApp.repository;

import com.parth.journalApp.entity.ConfigJournalAppEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfiJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
