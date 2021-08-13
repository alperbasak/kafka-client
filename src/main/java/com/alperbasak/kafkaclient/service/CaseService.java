package com.alperbasak.kafkaclient.service;

import com.alperbasak.CaseEvent;
import com.alperbasak.kafkaclient.repository.CaseEventRepository;
import org.springframework.stereotype.Service;

@Service
public class CaseService {

    final
    CaseEventRepository caseEventRepository;

    public CaseService(CaseEventRepository caseEventRepository) {
        this.caseEventRepository = caseEventRepository;
    }

    public void addCaseEvent(CaseEvent caseEvent) {
        caseEventRepository.save(caseEvent);
    }
}
