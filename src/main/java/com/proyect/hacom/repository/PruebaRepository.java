package com.proyect.hacom.repository;

import com.proyect.hacom.dto.TraceMsgDto;
import com.proyect.hacom.entity.TraceMsg;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.time.Instant;

@Repository
public interface PruebaRepository extends ReactiveMongoRepository<TraceMsg, ObjectId> {

    Flux<TraceMsgDto> findByTsBetween(Range<Instant> ts);
}
