package com.alperbasak.kafkaclient;

import com.alperbasak.CaseEvent;
import com.alperbasak.kafkaclient.service.CaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaClientApplication {

    private final Logger logger = LoggerFactory.getLogger(KafkaClientApplication.class);

    public KafkaClientApplication(CaseService caseService) {
        this.caseService = caseService;
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaClientApplication.class, args);
    }

    final String topic = "cases";

    final
    CaseService caseService;

    @KafkaListener(id = "caseGroup", topics = topic)
    public void consume(CaseEvent caseEvent) {
        logger.info("Received: {}", caseEvent);
        caseService.addCaseEvent(caseEvent);
    }

}
