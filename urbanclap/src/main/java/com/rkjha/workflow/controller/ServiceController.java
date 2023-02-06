package com.rkjha.workflow.controller;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/services")
public class ServiceController {
    private List<LocalService> localServices = new ArrayList<>();
    private List<ServiceQuestion> serviceQuestions = new ArrayList<>();

    @PostConstruct
    public void init() {
        localServices.add(new LocalService("Plumbing", "plumbing"));
        localServices.add(new LocalService("Carpentry", "carpentry"));
        localServices.add(new LocalService("Electrician", "electrician"));
        serviceQuestions.add(new ServiceQuestion(1, "Tap Repair?", "plumbing",100));
        serviceQuestions.add(new ServiceQuestion(2, "Waste pipe leakage?", "plumbing",150));
        serviceQuestions.add(new ServiceQuestion(3, "Jet spray installation?", "plumbing",200));
        serviceQuestions.add(new ServiceQuestion(4, "Door Repair?", "carpentry",300));
        serviceQuestions.add(new ServiceQuestion(5, "Cupboard Hinge Replacement?", "carpentry",400));
        serviceQuestions.add(new ServiceQuestion(6, "Curtain rod installation?", "carpentry",100));
        serviceQuestions.add(new ServiceQuestion(7, "Switch Replacement?", "electrician",50));
        serviceQuestions.add(new ServiceQuestion(8, "Socket Replacement?", "electrician",150));
        serviceQuestions.add(new ServiceQuestion(9, "Fan Repair?", "electrician",250));    }
    @GetMapping
    public List<LocalService> getAllServices() {
        return localServices;
    }
    @GetMapping("/question")
    public List<ServiceQuestion> getServiceQuestions() {
        return serviceQuestions;
    }
    @GetMapping("/question/{serviceId}")
    public List<ServiceQuestion> getLocalService(@PathVariable("serviceId") String serviceId) {
        return serviceQuestions.stream().filter(s -> s.getServiceId().equals(serviceId) ).collect(Collectors.toList());
    }
}