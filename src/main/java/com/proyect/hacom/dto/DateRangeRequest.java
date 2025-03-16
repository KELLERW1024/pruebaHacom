package com.proyect.hacom.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class DateRangeRequest {

    private Instant from;
    private Instant to;

    public Instant getFrom() {
        return from;
    }

    public void setFrom(Instant from) {
        this.from = from;
    }

    public Instant getTo() {
        return to;
    }

    public void setTo(Instant to) {
        this.to = to;
    }
}
