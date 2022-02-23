package com.aubrun.eric.projet12.model;

public class Service {

    Integer serviceId;
    EService serviceName;

    public Service(Integer serviceId, EService serviceName) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public EService getServiceName() {
        return serviceName;
    }

    public void setServiceName(EService serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", serviceName=" + serviceName +
                '}';
    }
}
