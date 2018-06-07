package cn.lastlysly.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestPermissionExample() {
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

        public Criteria andTestPermissionIdIsNull() {
            addCriterion("test_permission_id is null");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdIsNotNull() {
            addCriterion("test_permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdEqualTo(Integer value) {
            addCriterion("test_permission_id =", value, "testPermissionId");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdNotEqualTo(Integer value) {
            addCriterion("test_permission_id <>", value, "testPermissionId");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdGreaterThan(Integer value) {
            addCriterion("test_permission_id >", value, "testPermissionId");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_permission_id >=", value, "testPermissionId");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdLessThan(Integer value) {
            addCriterion("test_permission_id <", value, "testPermissionId");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_permission_id <=", value, "testPermissionId");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdIn(List<Integer> values) {
            addCriterion("test_permission_id in", values, "testPermissionId");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdNotIn(List<Integer> values) {
            addCriterion("test_permission_id not in", values, "testPermissionId");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdBetween(Integer value1, Integer value2) {
            addCriterion("test_permission_id between", value1, value2, "testPermissionId");
            return (Criteria) this;
        }

        public Criteria andTestPermissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_permission_id not between", value1, value2, "testPermissionId");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameIsNull() {
            addCriterion("test_permission_rolename is null");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameIsNotNull() {
            addCriterion("test_permission_rolename is not null");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameEqualTo(String value) {
            addCriterion("test_permission_rolename =", value, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameNotEqualTo(String value) {
            addCriterion("test_permission_rolename <>", value, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameGreaterThan(String value) {
            addCriterion("test_permission_rolename >", value, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("test_permission_rolename >=", value, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameLessThan(String value) {
            addCriterion("test_permission_rolename <", value, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameLessThanOrEqualTo(String value) {
            addCriterion("test_permission_rolename <=", value, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameLike(String value) {
            addCriterion("test_permission_rolename like", value, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameNotLike(String value) {
            addCriterion("test_permission_rolename not like", value, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameIn(List<String> values) {
            addCriterion("test_permission_rolename in", values, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameNotIn(List<String> values) {
            addCriterion("test_permission_rolename not in", values, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameBetween(String value1, String value2) {
            addCriterion("test_permission_rolename between", value1, value2, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionRolenameNotBetween(String value1, String value2) {
            addCriterion("test_permission_rolename not between", value1, value2, "testPermissionRolename");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionIsNull() {
            addCriterion("test_permission_permission is null");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionIsNotNull() {
            addCriterion("test_permission_permission is not null");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionEqualTo(String value) {
            addCriterion("test_permission_permission =", value, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionNotEqualTo(String value) {
            addCriterion("test_permission_permission <>", value, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionGreaterThan(String value) {
            addCriterion("test_permission_permission >", value, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("test_permission_permission >=", value, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionLessThan(String value) {
            addCriterion("test_permission_permission <", value, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionLessThanOrEqualTo(String value) {
            addCriterion("test_permission_permission <=", value, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionLike(String value) {
            addCriterion("test_permission_permission like", value, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionNotLike(String value) {
            addCriterion("test_permission_permission not like", value, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionIn(List<String> values) {
            addCriterion("test_permission_permission in", values, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionNotIn(List<String> values) {
            addCriterion("test_permission_permission not in", values, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionBetween(String value1, String value2) {
            addCriterion("test_permission_permission between", value1, value2, "testPermissionPermission");
            return (Criteria) this;
        }

        public Criteria andTestPermissionPermissionNotBetween(String value1, String value2) {
            addCriterion("test_permission_permission not between", value1, value2, "testPermissionPermission");
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