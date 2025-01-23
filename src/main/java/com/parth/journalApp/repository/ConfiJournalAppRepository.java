package com.parth.journalApp.repository;

import com.parth.journalApp.entity.ConfigJournalAppEntity;
import com.parth.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfiJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
