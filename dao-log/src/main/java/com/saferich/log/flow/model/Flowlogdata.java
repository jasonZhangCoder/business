package com.saferich.log.flow.model;

import java.io.Serializable;

public class Flowlogdata implements Serializable {
    private Integer id;

    private String serialid;

    private String client;

    private String operationip;

    private String datetime;

    private String businesstype;

    private String requestor;

    private String requestorid;

    private String systemtype;

    private String flowbusinessid;

    private String flowbusinesstype;

    private String flowchangereason;

    private String newflownode;

    private String oldflownode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerialid() {
        return serialid;
    }

    public void setSerialid(String serialid) {
        this.serialid = serialid == null ? null : serialid.trim();
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client == null ? null : client.trim();
    }

    public String getOperationip() {
        return operationip;
    }

    public void setOperationip(String operationip) {
        this.operationip = operationip == null ? null : operationip.trim();
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public String getRequestor() {
        return requestor;
    }

    public void setRequestor(String requestor) {
        this.requestor = requestor == null ? null : requestor.trim();
    }

    public String getRequestorid() {
        return requestorid;
    }

    public void setRequestorid(String requestorid) {
        this.requestorid = requestorid == null ? null : requestorid.trim();
    }

    public String getSystemtype() {
        return systemtype;
    }

    public void setSystemtype(String systemtype) {
        this.systemtype = systemtype == null ? null : systemtype.trim();
    }

    public String getFlowbusinessid() {
        return flowbusinessid;
    }

    public void setFlowbusinessid(String flowbusinessid) {
        this.flowbusinessid = flowbusinessid == null ? null : flowbusinessid.trim();
    }

    public String getFlowbusinesstype() {
        return flowbusinesstype;
    }

    public void setFlowbusinesstype(String flowbusinesstype) {
        this.flowbusinesstype = flowbusinesstype == null ? null : flowbusinesstype.trim();
    }

    public String getFlowchangereason() {
        return flowchangereason;
    }

    public void setFlowchangereason(String flowchangereason) {
        this.flowchangereason = flowchangereason == null ? null : flowchangereason.trim();
    }

    public String getNewflownode() {
        return newflownode;
    }

    public void setNewflownode(String newflownode) {
        this.newflownode = newflownode == null ? null : newflownode.trim();
    }

    public String getOldflownode() {
        return oldflownode;
    }

    public void setOldflownode(String oldflownode) {
        this.oldflownode = oldflownode == null ? null : oldflownode.trim();
    }
}