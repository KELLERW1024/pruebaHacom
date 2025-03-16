package com.proyect.hacom.entity;

//import org.bson.types.ObjectId;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.OffsetDateTime;

@Getter
@Setter
@Document(collection = "data")
public class TraceMsg {

    @Id
    private ObjectId _id;
    private String sessionId;
    private String payload;
    private Instant ts;

}
