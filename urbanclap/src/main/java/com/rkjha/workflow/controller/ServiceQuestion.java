package com.rkjha.workflow.controller;

public class ServiceQuestion {
    private int id;
    private String question;
    private String serviceId;
    private int cost;

    public ServiceQuestion(int id, String question, String serviceId,int cost) {
        this.id = id;
        this.question = question;
        this.serviceId = serviceId;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
