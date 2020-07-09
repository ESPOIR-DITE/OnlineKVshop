package com.etoiledespoir.onlinekvshop.service.order.status;

import com.etoiledespoir.onlinekvshop.domain.order.Status;
import com.etoiledespoir.onlinekvshop.repository.order.StatusRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService implements Iservice<Status,String> {
    @Autowired
    StatusRepository statusRepository;
    static StatusService statusService=null;

    public StatusService() {
    }
    public static StatusService getStatusService(){
        if(statusService==null){
            statusService=new StatusService();
        }return statusService;
    }

    @Override
    public Status creat(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public Status delete(String id) {
        Optional<Status>result=statusRepository.findById(id);
        statusRepository.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Status Update(Status status) {
        Optional<Status>result=statusRepository.findById(status.getId());
        statusRepository.deleteById(status.getId());
        return statusRepository.save(status);
    }

    @Override
    public Status read(String id) {
        Optional<Status>result=statusRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Status> readAll() {
        return statusRepository.findAll();
    }
}
