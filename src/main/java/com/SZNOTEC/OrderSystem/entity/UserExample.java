package com.SZNOTEC.OrderSystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserSNoIsNull() {
            addCriterion("userSNo is null");
            return (Criteria) this;
        }

        public Criteria andUserSNoIsNotNull() {
            addCriterion("userSNo is not null");
            return (Criteria) this;
        }

        public Criteria andUserSNoEqualTo(Integer value) {
            addCriterion("userSNo =", value, "userSNo");
            return (Criteria) this;
        }

        public Criteria andUserSNoNotEqualTo(Integer value) {
            addCriterion("userSNo <>", value, "userSNo");
            return (Criteria) this;
        }

        public Criteria andUserSNoGreaterThan(Integer value) {
            addCriterion("userSNo >", value, "userSNo");
            return (Criteria) this;
        }

        public Criteria andUserSNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("userSNo >=", value, "userSNo");
            return (Criteria) this;
        }

        public Criteria andUserSNoLessThan(Integer value) {
            addCriterion("userSNo <", value, "userSNo");
            return (Criteria) this;
        }

        public Criteria andUserSNoLessThanOrEqualTo(Integer value) {
            addCriterion("userSNo <=", value, "userSNo");
            return (Criteria) this;
        }

        public Criteria andUserSNoIn(List<Integer> values) {
            addCriterion("userSNo in", values, "userSNo");
            return (Criteria) this;
        }

        public Criteria andUserSNoNotIn(List<Integer> values) {
            addCriterion("userSNo not in", values, "userSNo");
            return (Criteria) this;
        }

        public Criteria andUserSNoBetween(Integer value1, Integer value2) {
            addCriterion("userSNo between", value1, value2, "userSNo");
            return (Criteria) this;
        }

        public Criteria andUserSNoNotBetween(Integer value1, Integer value2) {
            addCriterion("userSNo not between", value1, value2, "userSNo");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andEmpSnoIsNull() {
            addCriterion("empSno is null");
            return (Criteria) this;
        }

        public Criteria andEmpSnoIsNotNull() {
            addCriterion("empSno is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSnoEqualTo(Integer value) {
            addCriterion("empSno =", value, "empSno");
            return (Criteria) this;
        }

        public Criteria andEmpSnoNotEqualTo(Integer value) {
            addCriterion("empSno <>", value, "empSno");
            return (Criteria) this;
        }

        public Criteria andEmpSnoGreaterThan(Integer value) {
            addCriterion("empSno >", value, "empSno");
            return (Criteria) this;
        }

        public Criteria andEmpSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("empSno >=", value, "empSno");
            return (Criteria) this;
        }

        public Criteria andEmpSnoLessThan(Integer value) {
            addCriterion("empSno <", value, "empSno");
            return (Criteria) this;
        }

        public Criteria andEmpSnoLessThanOrEqualTo(Integer value) {
            addCriterion("empSno <=", value, "empSno");
            return (Criteria) this;
        }

        public Criteria andEmpSnoIn(List<Integer> values) {
            addCriterion("empSno in", values, "empSno");
            return (Criteria) this;
        }

        public Criteria andEmpSnoNotIn(List<Integer> values) {
            addCriterion("empSno not in", values, "empSno");
            return (Criteria) this;
        }

        public Criteria andEmpSnoBetween(Integer value1, Integer value2) {
            addCriterion("empSno between", value1, value2, "empSno");
            return (Criteria) this;
        }

        public Criteria andEmpSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("empSno not between", value1, value2, "empSno");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCmtIsNull() {
            addCriterion("cmt is null");
            return (Criteria) this;
        }

        public Criteria andCmtIsNotNull() {
            addCriterion("cmt is not null");
            return (Criteria) this;
        }

        public Criteria andCmtEqualTo(String value) {
            addCriterion("cmt =", value, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtNotEqualTo(String value) {
            addCriterion("cmt <>", value, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtGreaterThan(String value) {
            addCriterion("cmt >", value, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtGreaterThanOrEqualTo(String value) {
            addCriterion("cmt >=", value, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtLessThan(String value) {
            addCriterion("cmt <", value, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtLessThanOrEqualTo(String value) {
            addCriterion("cmt <=", value, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtLike(String value) {
            addCriterion("cmt like", value, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtNotLike(String value) {
            addCriterion("cmt not like", value, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtIn(List<String> values) {
            addCriterion("cmt in", values, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtNotIn(List<String> values) {
            addCriterion("cmt not in", values, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtBetween(String value1, String value2) {
            addCriterion("cmt between", value1, value2, "cmt");
            return (Criteria) this;
        }

        public Criteria andCmtNotBetween(String value1, String value2) {
            addCriterion("cmt not between", value1, value2, "cmt");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
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