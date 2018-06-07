package cn.lastlysly.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestUsersExample() {
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

        public Criteria andTestUserIdIsNull() {
            addCriterion("test_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTestUserIdIsNotNull() {
            addCriterion("test_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestUserIdEqualTo(Integer value) {
            addCriterion("test_user_id =", value, "testUserId");
            return (Criteria) this;
        }

        public Criteria andTestUserIdNotEqualTo(Integer value) {
            addCriterion("test_user_id <>", value, "testUserId");
            return (Criteria) this;
        }

        public Criteria andTestUserIdGreaterThan(Integer value) {
            addCriterion("test_user_id >", value, "testUserId");
            return (Criteria) this;
        }

        public Criteria andTestUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_user_id >=", value, "testUserId");
            return (Criteria) this;
        }

        public Criteria andTestUserIdLessThan(Integer value) {
            addCriterion("test_user_id <", value, "testUserId");
            return (Criteria) this;
        }

        public Criteria andTestUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_user_id <=", value, "testUserId");
            return (Criteria) this;
        }

        public Criteria andTestUserIdIn(List<Integer> values) {
            addCriterion("test_user_id in", values, "testUserId");
            return (Criteria) this;
        }

        public Criteria andTestUserIdNotIn(List<Integer> values) {
            addCriterion("test_user_id not in", values, "testUserId");
            return (Criteria) this;
        }

        public Criteria andTestUserIdBetween(Integer value1, Integer value2) {
            addCriterion("test_user_id between", value1, value2, "testUserId");
            return (Criteria) this;
        }

        public Criteria andTestUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_user_id not between", value1, value2, "testUserId");
            return (Criteria) this;
        }

        public Criteria andTestUsernameIsNull() {
            addCriterion("test_username is null");
            return (Criteria) this;
        }

        public Criteria andTestUsernameIsNotNull() {
            addCriterion("test_username is not null");
            return (Criteria) this;
        }

        public Criteria andTestUsernameEqualTo(String value) {
            addCriterion("test_username =", value, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameNotEqualTo(String value) {
            addCriterion("test_username <>", value, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameGreaterThan(String value) {
            addCriterion("test_username >", value, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("test_username >=", value, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameLessThan(String value) {
            addCriterion("test_username <", value, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameLessThanOrEqualTo(String value) {
            addCriterion("test_username <=", value, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameLike(String value) {
            addCriterion("test_username like", value, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameNotLike(String value) {
            addCriterion("test_username not like", value, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameIn(List<String> values) {
            addCriterion("test_username in", values, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameNotIn(List<String> values) {
            addCriterion("test_username not in", values, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameBetween(String value1, String value2) {
            addCriterion("test_username between", value1, value2, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestUsernameNotBetween(String value1, String value2) {
            addCriterion("test_username not between", value1, value2, "testUsername");
            return (Criteria) this;
        }

        public Criteria andTestPasswordIsNull() {
            addCriterion("test_password is null");
            return (Criteria) this;
        }

        public Criteria andTestPasswordIsNotNull() {
            addCriterion("test_password is not null");
            return (Criteria) this;
        }

        public Criteria andTestPasswordEqualTo(String value) {
            addCriterion("test_password =", value, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordNotEqualTo(String value) {
            addCriterion("test_password <>", value, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordGreaterThan(String value) {
            addCriterion("test_password >", value, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("test_password >=", value, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordLessThan(String value) {
            addCriterion("test_password <", value, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordLessThanOrEqualTo(String value) {
            addCriterion("test_password <=", value, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordLike(String value) {
            addCriterion("test_password like", value, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordNotLike(String value) {
            addCriterion("test_password not like", value, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordIn(List<String> values) {
            addCriterion("test_password in", values, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordNotIn(List<String> values) {
            addCriterion("test_password not in", values, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordBetween(String value1, String value2) {
            addCriterion("test_password between", value1, value2, "testPassword");
            return (Criteria) this;
        }

        public Criteria andTestPasswordNotBetween(String value1, String value2) {
            addCriterion("test_password not between", value1, value2, "testPassword");
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