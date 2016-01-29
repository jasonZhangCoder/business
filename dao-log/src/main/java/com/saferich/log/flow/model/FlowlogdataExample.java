package com.saferich.log.flow.model;

import com.saferich.core.dao.Limit;
import java.util.ArrayList;
import java.util.List;

public class FlowlogdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Limit limit;

    public FlowlogdataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    public Limit getLimit() {
        return this.limit;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSerialidIsNull() {
            addCriterion("serialId is null");
            return (Criteria) this;
        }

        public Criteria andSerialidIsNotNull() {
            addCriterion("serialId is not null");
            return (Criteria) this;
        }

        public Criteria andSerialidEqualTo(String value) {
            addCriterion("serialId =", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotEqualTo(String value) {
            addCriterion("serialId <>", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThan(String value) {
            addCriterion("serialId >", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThanOrEqualTo(String value) {
            addCriterion("serialId >=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThan(String value) {
            addCriterion("serialId <", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThanOrEqualTo(String value) {
            addCriterion("serialId <=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLike(String value) {
            addCriterion("serialId like", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotLike(String value) {
            addCriterion("serialId not like", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidIn(List<String> values) {
            addCriterion("serialId in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotIn(List<String> values) {
            addCriterion("serialId not in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidBetween(String value1, String value2) {
            addCriterion("serialId between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotBetween(String value1, String value2) {
            addCriterion("serialId not between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("client not between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andOperationipIsNull() {
            addCriterion("operationIP is null");
            return (Criteria) this;
        }

        public Criteria andOperationipIsNotNull() {
            addCriterion("operationIP is not null");
            return (Criteria) this;
        }

        public Criteria andOperationipEqualTo(String value) {
            addCriterion("operationIP =", value, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipNotEqualTo(String value) {
            addCriterion("operationIP <>", value, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipGreaterThan(String value) {
            addCriterion("operationIP >", value, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipGreaterThanOrEqualTo(String value) {
            addCriterion("operationIP >=", value, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipLessThan(String value) {
            addCriterion("operationIP <", value, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipLessThanOrEqualTo(String value) {
            addCriterion("operationIP <=", value, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipLike(String value) {
            addCriterion("operationIP like", value, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipNotLike(String value) {
            addCriterion("operationIP not like", value, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipIn(List<String> values) {
            addCriterion("operationIP in", values, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipNotIn(List<String> values) {
            addCriterion("operationIP not in", values, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipBetween(String value1, String value2) {
            addCriterion("operationIP between", value1, value2, "operationip");
            return (Criteria) this;
        }

        public Criteria andOperationipNotBetween(String value1, String value2) {
            addCriterion("operationIP not between", value1, value2, "operationip");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("dateTime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("dateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(String value) {
            addCriterion("dateTime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(String value) {
            addCriterion("dateTime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(String value) {
            addCriterion("dateTime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("dateTime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(String value) {
            addCriterion("dateTime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(String value) {
            addCriterion("dateTime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLike(String value) {
            addCriterion("dateTime like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotLike(String value) {
            addCriterion("dateTime not like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<String> values) {
            addCriterion("dateTime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<String> values) {
            addCriterion("dateTime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(String value1, String value2) {
            addCriterion("dateTime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(String value1, String value2) {
            addCriterion("dateTime not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("businessType is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("businessType is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("businessType =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("businessType <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("businessType >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("businessType >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("businessType <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("businessType <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("businessType like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("businessType not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("businessType in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("businessType not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("businessType between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("businessType not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andRequestorIsNull() {
            addCriterion("requestor is null");
            return (Criteria) this;
        }

        public Criteria andRequestorIsNotNull() {
            addCriterion("requestor is not null");
            return (Criteria) this;
        }

        public Criteria andRequestorEqualTo(String value) {
            addCriterion("requestor =", value, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorNotEqualTo(String value) {
            addCriterion("requestor <>", value, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorGreaterThan(String value) {
            addCriterion("requestor >", value, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorGreaterThanOrEqualTo(String value) {
            addCriterion("requestor >=", value, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorLessThan(String value) {
            addCriterion("requestor <", value, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorLessThanOrEqualTo(String value) {
            addCriterion("requestor <=", value, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorLike(String value) {
            addCriterion("requestor like", value, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorNotLike(String value) {
            addCriterion("requestor not like", value, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorIn(List<String> values) {
            addCriterion("requestor in", values, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorNotIn(List<String> values) {
            addCriterion("requestor not in", values, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorBetween(String value1, String value2) {
            addCriterion("requestor between", value1, value2, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestorNotBetween(String value1, String value2) {
            addCriterion("requestor not between", value1, value2, "requestor");
            return (Criteria) this;
        }

        public Criteria andRequestoridIsNull() {
            addCriterion("requestorId is null");
            return (Criteria) this;
        }

        public Criteria andRequestoridIsNotNull() {
            addCriterion("requestorId is not null");
            return (Criteria) this;
        }

        public Criteria andRequestoridEqualTo(String value) {
            addCriterion("requestorId =", value, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridNotEqualTo(String value) {
            addCriterion("requestorId <>", value, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridGreaterThan(String value) {
            addCriterion("requestorId >", value, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridGreaterThanOrEqualTo(String value) {
            addCriterion("requestorId >=", value, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridLessThan(String value) {
            addCriterion("requestorId <", value, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridLessThanOrEqualTo(String value) {
            addCriterion("requestorId <=", value, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridLike(String value) {
            addCriterion("requestorId like", value, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridNotLike(String value) {
            addCriterion("requestorId not like", value, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridIn(List<String> values) {
            addCriterion("requestorId in", values, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridNotIn(List<String> values) {
            addCriterion("requestorId not in", values, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridBetween(String value1, String value2) {
            addCriterion("requestorId between", value1, value2, "requestorid");
            return (Criteria) this;
        }

        public Criteria andRequestoridNotBetween(String value1, String value2) {
            addCriterion("requestorId not between", value1, value2, "requestorid");
            return (Criteria) this;
        }

        public Criteria andSystemtypeIsNull() {
            addCriterion("systemType is null");
            return (Criteria) this;
        }

        public Criteria andSystemtypeIsNotNull() {
            addCriterion("systemType is not null");
            return (Criteria) this;
        }

        public Criteria andSystemtypeEqualTo(String value) {
            addCriterion("systemType =", value, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeNotEqualTo(String value) {
            addCriterion("systemType <>", value, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeGreaterThan(String value) {
            addCriterion("systemType >", value, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeGreaterThanOrEqualTo(String value) {
            addCriterion("systemType >=", value, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeLessThan(String value) {
            addCriterion("systemType <", value, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeLessThanOrEqualTo(String value) {
            addCriterion("systemType <=", value, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeLike(String value) {
            addCriterion("systemType like", value, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeNotLike(String value) {
            addCriterion("systemType not like", value, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeIn(List<String> values) {
            addCriterion("systemType in", values, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeNotIn(List<String> values) {
            addCriterion("systemType not in", values, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeBetween(String value1, String value2) {
            addCriterion("systemType between", value1, value2, "systemtype");
            return (Criteria) this;
        }

        public Criteria andSystemtypeNotBetween(String value1, String value2) {
            addCriterion("systemType not between", value1, value2, "systemtype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidIsNull() {
            addCriterion("flowBusinessId is null");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidIsNotNull() {
            addCriterion("flowBusinessId is not null");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidEqualTo(String value) {
            addCriterion("flowBusinessId =", value, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidNotEqualTo(String value) {
            addCriterion("flowBusinessId <>", value, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidGreaterThan(String value) {
            addCriterion("flowBusinessId >", value, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidGreaterThanOrEqualTo(String value) {
            addCriterion("flowBusinessId >=", value, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidLessThan(String value) {
            addCriterion("flowBusinessId <", value, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidLessThanOrEqualTo(String value) {
            addCriterion("flowBusinessId <=", value, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidLike(String value) {
            addCriterion("flowBusinessId like", value, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidNotLike(String value) {
            addCriterion("flowBusinessId not like", value, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidIn(List<String> values) {
            addCriterion("flowBusinessId in", values, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidNotIn(List<String> values) {
            addCriterion("flowBusinessId not in", values, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidBetween(String value1, String value2) {
            addCriterion("flowBusinessId between", value1, value2, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinessidNotBetween(String value1, String value2) {
            addCriterion("flowBusinessId not between", value1, value2, "flowbusinessid");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeIsNull() {
            addCriterion("flowBusinessType is null");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeIsNotNull() {
            addCriterion("flowBusinessType is not null");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeEqualTo(String value) {
            addCriterion("flowBusinessType =", value, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeNotEqualTo(String value) {
            addCriterion("flowBusinessType <>", value, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeGreaterThan(String value) {
            addCriterion("flowBusinessType >", value, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("flowBusinessType >=", value, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeLessThan(String value) {
            addCriterion("flowBusinessType <", value, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("flowBusinessType <=", value, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeLike(String value) {
            addCriterion("flowBusinessType like", value, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeNotLike(String value) {
            addCriterion("flowBusinessType not like", value, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeIn(List<String> values) {
            addCriterion("flowBusinessType in", values, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeNotIn(List<String> values) {
            addCriterion("flowBusinessType not in", values, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeBetween(String value1, String value2) {
            addCriterion("flowBusinessType between", value1, value2, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowbusinesstypeNotBetween(String value1, String value2) {
            addCriterion("flowBusinessType not between", value1, value2, "flowbusinesstype");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonIsNull() {
            addCriterion("flowChangeReason is null");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonIsNotNull() {
            addCriterion("flowChangeReason is not null");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonEqualTo(String value) {
            addCriterion("flowChangeReason =", value, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonNotEqualTo(String value) {
            addCriterion("flowChangeReason <>", value, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonGreaterThan(String value) {
            addCriterion("flowChangeReason >", value, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonGreaterThanOrEqualTo(String value) {
            addCriterion("flowChangeReason >=", value, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonLessThan(String value) {
            addCriterion("flowChangeReason <", value, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonLessThanOrEqualTo(String value) {
            addCriterion("flowChangeReason <=", value, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonLike(String value) {
            addCriterion("flowChangeReason like", value, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonNotLike(String value) {
            addCriterion("flowChangeReason not like", value, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonIn(List<String> values) {
            addCriterion("flowChangeReason in", values, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonNotIn(List<String> values) {
            addCriterion("flowChangeReason not in", values, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonBetween(String value1, String value2) {
            addCriterion("flowChangeReason between", value1, value2, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andFlowchangereasonNotBetween(String value1, String value2) {
            addCriterion("flowChangeReason not between", value1, value2, "flowchangereason");
            return (Criteria) this;
        }

        public Criteria andNewflownodeIsNull() {
            addCriterion("newFlowNode is null");
            return (Criteria) this;
        }

        public Criteria andNewflownodeIsNotNull() {
            addCriterion("newFlowNode is not null");
            return (Criteria) this;
        }

        public Criteria andNewflownodeEqualTo(String value) {
            addCriterion("newFlowNode =", value, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeNotEqualTo(String value) {
            addCriterion("newFlowNode <>", value, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeGreaterThan(String value) {
            addCriterion("newFlowNode >", value, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeGreaterThanOrEqualTo(String value) {
            addCriterion("newFlowNode >=", value, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeLessThan(String value) {
            addCriterion("newFlowNode <", value, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeLessThanOrEqualTo(String value) {
            addCriterion("newFlowNode <=", value, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeLike(String value) {
            addCriterion("newFlowNode like", value, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeNotLike(String value) {
            addCriterion("newFlowNode not like", value, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeIn(List<String> values) {
            addCriterion("newFlowNode in", values, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeNotIn(List<String> values) {
            addCriterion("newFlowNode not in", values, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeBetween(String value1, String value2) {
            addCriterion("newFlowNode between", value1, value2, "newflownode");
            return (Criteria) this;
        }

        public Criteria andNewflownodeNotBetween(String value1, String value2) {
            addCriterion("newFlowNode not between", value1, value2, "newflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeIsNull() {
            addCriterion("oldFlowNode is null");
            return (Criteria) this;
        }

        public Criteria andOldflownodeIsNotNull() {
            addCriterion("oldFlowNode is not null");
            return (Criteria) this;
        }

        public Criteria andOldflownodeEqualTo(String value) {
            addCriterion("oldFlowNode =", value, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeNotEqualTo(String value) {
            addCriterion("oldFlowNode <>", value, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeGreaterThan(String value) {
            addCriterion("oldFlowNode >", value, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeGreaterThanOrEqualTo(String value) {
            addCriterion("oldFlowNode >=", value, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeLessThan(String value) {
            addCriterion("oldFlowNode <", value, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeLessThanOrEqualTo(String value) {
            addCriterion("oldFlowNode <=", value, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeLike(String value) {
            addCriterion("oldFlowNode like", value, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeNotLike(String value) {
            addCriterion("oldFlowNode not like", value, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeIn(List<String> values) {
            addCriterion("oldFlowNode in", values, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeNotIn(List<String> values) {
            addCriterion("oldFlowNode not in", values, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeBetween(String value1, String value2) {
            addCriterion("oldFlowNode between", value1, value2, "oldflownode");
            return (Criteria) this;
        }

        public Criteria andOldflownodeNotBetween(String value1, String value2) {
            addCriterion("oldFlowNode not between", value1, value2, "oldflownode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}