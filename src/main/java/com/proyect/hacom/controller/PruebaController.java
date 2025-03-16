package com.proyect.hacom.controller;

import com.proyect.hacom.dto.DateRangeRequest;
import com.proyect.hacom.dto.TraceMsgDto;
import com.proyect.hacom.entity.TraceMsg;
import com.proyect.hacom.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/prueba/")
public class PruebaController {

    @Autowired
    private PruebaService pruebaService;

    @GetMapping("consulta")
    public Flux<TraceMsgDto> getDateBetweenRange(@RequestBody DateRangeRequest dateRangeRequest){
        return pruebaService.findRangoFechas(dateRangeRequest);
    }

    @PostMapping("insert")
    public Mono<TraceMsg> insert(@RequestBody TraceMsg trace){
        return pruebaService.insert( trace );
    }
}
