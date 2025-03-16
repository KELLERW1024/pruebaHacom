package com.proyect.hacom.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TraceMsgDto {
    private ObjectId _id;
    private String sessionId;
    private String payload;
    private Instant ts;
}
