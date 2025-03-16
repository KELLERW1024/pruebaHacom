package com.proyect.hacom.service;

import com.proyect.hacom.HacomApplication;
import com.proyect.hacom.config.AppConfig;
import com.proyect.hacom.dto.DateRangeRequest;
import com.proyect.hacom.dto.TraceMsgDto;
import com.proyect.hacom.entity.TraceMsg;
import com.proyect.hacom.repository.PruebaRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Range;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PruebaService {

    private final AppConfig appConfig;
    // Uso de log4j2 utilizando el archivo log4j2.yml
    private static final   Logger logger = LogManager.getLogger(HacomApplication.class);

    @Autowired
    PruebaRepository pruebaRepository;

    public PruebaService(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public Flux<TraceMsgDto>  findRangoFechas(DateRangeRequest dateRangeRequest){
        logger.info("[PruebaService] [findRangoFechas]");
        // Verificacion de los datos del YAML mediante @ConfigurationProperties
        logger.info("URI:{}" , appConfig.getDatabase().getUrl());
        logger.info("DataBase:{}" , appConfig.getDatabase().getDatabase());
        logger.info("HOST:{}" , appConfig.getDatabase().getHost());
        return pruebaRepository.findByTsBetween(Range.closed(dateRangeRequest.getFrom(), dateRangeRequest.getTo()));
    }

    public Mono<TraceMsg> insert(TraceMsg traceMsg){
        logger.info("[PruebaService] [insert]");
        return pruebaRepository.save(traceMsg).
                doOnSuccess(saved -> logger.info("registro exitoso: {} " , saved))
                .doOnError(error -> logger.error("Error al guardar: {} " , error.getMessage()));
    }




}
