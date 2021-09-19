package com.unifg.girah.service;

import com.unifg.girah.model.ReportEntity;
import com.unifg.girah.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    ReportRepository repository;

    public List<ReportEntity> getReports(){
        return repository.getReports();
    }

}
