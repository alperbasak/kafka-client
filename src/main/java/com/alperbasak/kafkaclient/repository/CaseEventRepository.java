package com.alperbasak.kafkaclient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.alperbasak.CaseEvent;

import java.util.UUID;

@Repository
public interface CaseEventRepository extends MongoRepository<CaseEvent, UUID> {
}
