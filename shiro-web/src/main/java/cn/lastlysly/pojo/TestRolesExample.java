package cn.lastlysly.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestRolesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestRolesExample() {
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

        public Criteria andTestRoleIdIsNull() {
            addCriterion("test_role_id is null");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdIsNotNull() {
            addCriterion("test_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdEqualTo(Integer value) {
            addCriterion("test_role_id =", value, "testRoleId");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdNotEqualTo(Integer value) {
            addCriterion("test_role_id <>", value, "testRoleId");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdGreaterThan(Integer value) {
            addCriterion("test_role_id >", value, "testRoleId");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_role_id >=", value, "testRoleId");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdLessThan(Integer value) {
            addCriterion("test_role_id <", value, "testRoleId");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_role_id <=", value, "testRoleId");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdIn(List<Integer> values) {
            addCriterion("test_role_id in", values, "testRoleId");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdNotIn(List<Integer> values) {
            addCriterion("test_role_id not in", values, "testRoleId");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("test_role_id between", value1, value2, "testRoleId");
            return (Criteria) this;
        }

        public Criteria andTestRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_role_id not between", value1, value2, "testRoleId");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameIsNull() {
            addCriterion("test_role_username is null");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameIsNotNull() {
            addCriterion("test_role_username is not null");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameEqualTo(String value) {
            addCriterion("test_role_username =", value, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameNotEqualTo(String value) {
            addCriterion("test_role_username <>", value, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameGreaterThan(String value) {
            addCriterion("test_role_username >", value, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("test_role_username >=", value, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameLessThan(String value) {
            addCriterion("test_role_username <", value, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameLessThanOrEqualTo(String value) {
            addCriterion("test_role_username <=", value, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameLike(String value) {
            addCriterion("test_role_username like", value, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameNotLike(String value) {
            addCriterion("test_role_username not like", value, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameIn(List<String> values) {
            addCriterion("test_role_username in", values, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameNotIn(List<String> values) {
            addCriterion("test_role_username not in", values, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameBetween(String value1, String value2) {
            addCriterion("test_role_username between", value1, value2, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleUsernameNotBetween(String value1, String value2) {
            addCriterion("test_role_username not between", value1, value2, "testRoleUsername");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameIsNull() {
            addCriterion("test_role_name is null");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameIsNotNull() {
            addCriterion("test_role_name is not null");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameEqualTo(String value) {
            addCriterion("test_role_name =", value, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameNotEqualTo(String value) {
            addCriterion("test_role_name <>", value, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameGreaterThan(String value) {
            addCriterion("test_role_name >", value, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("test_role_name >=", value, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameLessThan(String value) {
            addCriterion("test_role_name <", value, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameLessThanOrEqualTo(String value) {
            addCriterion("test_role_name <=", value, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameLike(String value) {
            addCriterion("test_role_name like", value, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameNotLike(String value) {
            addCriterion("test_role_name not like", value, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameIn(List<String> values) {
            addCriterion("test_role_name in", values, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameNotIn(List<String> values) {
            addCriterion("test_role_name not in", values, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameBetween(String value1, String value2) {
            addCriterion("test_role_name between", value1, value2, "testRoleName");
            return (Criteria) this;
        }

        public Criteria andTestRoleNameNotBetween(String value1, String value2) {
            addCriterion("test_role_name not between", value1, value2, "testRoleName");
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