package com.ilme.student.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SimsStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimsStudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNull() {
            addCriterion("COLLEGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("COLLEGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(String value) {
            addCriterion("COLLEGE_ID =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(String value) {
            addCriterion("COLLEGE_ID <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(String value) {
            addCriterion("COLLEGE_ID >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(String value) {
            addCriterion("COLLEGE_ID >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(String value) {
            addCriterion("COLLEGE_ID <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(String value) {
            addCriterion("COLLEGE_ID <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLike(String value) {
            addCriterion("COLLEGE_ID like", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotLike(String value) {
            addCriterion("COLLEGE_ID not like", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<String> values) {
            addCriterion("COLLEGE_ID in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<String> values) {
            addCriterion("COLLEGE_ID not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(String value1, String value2) {
            addCriterion("COLLEGE_ID between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(String value1, String value2) {
            addCriterion("COLLEGE_ID not between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("CLASS_ID =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("CLASS_ID <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("CLASS_ID >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ID >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("CLASS_ID <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ID <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("CLASS_ID like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("CLASS_ID not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("CLASS_ID in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("CLASS_ID not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("CLASS_ID between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("CLASS_ID not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("ID_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("ID_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("ID_CARD_NO =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("ID_CARD_NO <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("ID_CARD_NO >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD_NO >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("ID_CARD_NO <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD_NO <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("ID_CARD_NO like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("ID_CARD_NO not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("ID_CARD_NO in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("ID_CARD_NO not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("ID_CARD_NO between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("ID_CARD_NO not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andEngNameIsNull() {
            addCriterion("ENG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEngNameIsNotNull() {
            addCriterion("ENG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEngNameEqualTo(String value) {
            addCriterion("ENG_NAME =", value, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameNotEqualTo(String value) {
            addCriterion("ENG_NAME <>", value, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameGreaterThan(String value) {
            addCriterion("ENG_NAME >", value, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENG_NAME >=", value, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameLessThan(String value) {
            addCriterion("ENG_NAME <", value, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameLessThanOrEqualTo(String value) {
            addCriterion("ENG_NAME <=", value, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameLike(String value) {
            addCriterion("ENG_NAME like", value, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameNotLike(String value) {
            addCriterion("ENG_NAME not like", value, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameIn(List<String> values) {
            addCriterion("ENG_NAME in", values, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameNotIn(List<String> values) {
            addCriterion("ENG_NAME not in", values, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameBetween(String value1, String value2) {
            addCriterion("ENG_NAME between", value1, value2, "engName");
            return (Criteria) this;
        }

        public Criteria andEngNameNotBetween(String value1, String value2) {
            addCriterion("ENG_NAME not between", value1, value2, "engName");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("MOBILE_PHONE <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("MOBILE_PHONE >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("MOBILE_PHONE <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("MOBILE_PHONE like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("MOBILE_PHONE not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("MOBILE_PHONE in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("MOBILE_PHONE not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTH >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterionForJDBCDate("BIRTH <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTH in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTH not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTH between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTH not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("AVATAR is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("AVATAR is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("AVATAR =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("AVATAR <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("AVATAR >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("AVATAR >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("AVATAR <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("AVATAR <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("AVATAR like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("AVATAR not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("AVATAR in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("AVATAR not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("AVATAR between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("AVATAR not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("HEIGHT =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("HEIGHT <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("HEIGHT >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHT >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("HEIGHT <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHT <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("HEIGHT in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("HEIGHT not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHT between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHT not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNull() {
            addCriterion("POLITICAL is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNotNull() {
            addCriterion("POLITICAL is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalEqualTo(String value) {
            addCriterion("POLITICAL =", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotEqualTo(String value) {
            addCriterion("POLITICAL <>", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThan(String value) {
            addCriterion("POLITICAL >", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICAL >=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThan(String value) {
            addCriterion("POLITICAL <", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThanOrEqualTo(String value) {
            addCriterion("POLITICAL <=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLike(String value) {
            addCriterion("POLITICAL like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotLike(String value) {
            addCriterion("POLITICAL not like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalIn(List<String> values) {
            addCriterion("POLITICAL in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotIn(List<String> values) {
            addCriterion("POLITICAL not in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalBetween(String value1, String value2) {
            addCriterion("POLITICAL between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotBetween(String value1, String value2) {
            addCriterion("POLITICAL not between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andMaritalIsNull() {
            addCriterion("MARITAL is null");
            return (Criteria) this;
        }

        public Criteria andMaritalIsNotNull() {
            addCriterion("MARITAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalEqualTo(String value) {
            addCriterion("MARITAL =", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotEqualTo(String value) {
            addCriterion("MARITAL <>", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalGreaterThan(String value) {
            addCriterion("MARITAL >", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL >=", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLessThan(String value) {
            addCriterion("MARITAL <", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLessThanOrEqualTo(String value) {
            addCriterion("MARITAL <=", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLike(String value) {
            addCriterion("MARITAL like", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotLike(String value) {
            addCriterion("MARITAL not like", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalIn(List<String> values) {
            addCriterion("MARITAL in", values, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotIn(List<String> values) {
            addCriterion("MARITAL not in", values, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalBetween(String value1, String value2) {
            addCriterion("MARITAL between", value1, value2, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotBetween(String value1, String value2) {
            addCriterion("MARITAL not between", value1, value2, "marital");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceIsNull() {
            addCriterion("DOMICILE_PLACE_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceIsNotNull() {
            addCriterion("DOMICILE_PLACE_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_PROVINCE =", value, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceNotEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_PROVINCE <>", value, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceGreaterThan(String value) {
            addCriterion("DOMICILE_PLACE_PROVINCE >", value, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_PROVINCE >=", value, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceLessThan(String value) {
            addCriterion("DOMICILE_PLACE_PROVINCE <", value, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceLessThanOrEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_PROVINCE <=", value, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceLike(String value) {
            addCriterion("DOMICILE_PLACE_PROVINCE like", value, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceNotLike(String value) {
            addCriterion("DOMICILE_PLACE_PROVINCE not like", value, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceIn(List<String> values) {
            addCriterion("DOMICILE_PLACE_PROVINCE in", values, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceNotIn(List<String> values) {
            addCriterion("DOMICILE_PLACE_PROVINCE not in", values, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceBetween(String value1, String value2) {
            addCriterion("DOMICILE_PLACE_PROVINCE between", value1, value2, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceProvinceNotBetween(String value1, String value2) {
            addCriterion("DOMICILE_PLACE_PROVINCE not between", value1, value2, "domicilePlaceProvince");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityIsNull() {
            addCriterion("DOMICILE_PLACE_CITY is null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityIsNotNull() {
            addCriterion("DOMICILE_PLACE_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_CITY =", value, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityNotEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_CITY <>", value, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityGreaterThan(String value) {
            addCriterion("DOMICILE_PLACE_CITY >", value, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityGreaterThanOrEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_CITY >=", value, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityLessThan(String value) {
            addCriterion("DOMICILE_PLACE_CITY <", value, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityLessThanOrEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_CITY <=", value, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityLike(String value) {
            addCriterion("DOMICILE_PLACE_CITY like", value, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityNotLike(String value) {
            addCriterion("DOMICILE_PLACE_CITY not like", value, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityIn(List<String> values) {
            addCriterion("DOMICILE_PLACE_CITY in", values, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityNotIn(List<String> values) {
            addCriterion("DOMICILE_PLACE_CITY not in", values, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityBetween(String value1, String value2) {
            addCriterion("DOMICILE_PLACE_CITY between", value1, value2, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceCityNotBetween(String value1, String value2) {
            addCriterion("DOMICILE_PLACE_CITY not between", value1, value2, "domicilePlaceCity");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressIsNull() {
            addCriterion("DOMICILE_PLACE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressIsNotNull() {
            addCriterion("DOMICILE_PLACE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_ADDRESS =", value, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressNotEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_ADDRESS <>", value, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressGreaterThan(String value) {
            addCriterion("DOMICILE_PLACE_ADDRESS >", value, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_ADDRESS >=", value, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressLessThan(String value) {
            addCriterion("DOMICILE_PLACE_ADDRESS <", value, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressLessThanOrEqualTo(String value) {
            addCriterion("DOMICILE_PLACE_ADDRESS <=", value, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressLike(String value) {
            addCriterion("DOMICILE_PLACE_ADDRESS like", value, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressNotLike(String value) {
            addCriterion("DOMICILE_PLACE_ADDRESS not like", value, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressIn(List<String> values) {
            addCriterion("DOMICILE_PLACE_ADDRESS in", values, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressNotIn(List<String> values) {
            addCriterion("DOMICILE_PLACE_ADDRESS not in", values, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressBetween(String value1, String value2) {
            addCriterion("DOMICILE_PLACE_ADDRESS between", value1, value2, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceAddressNotBetween(String value1, String value2) {
            addCriterion("DOMICILE_PLACE_ADDRESS not between", value1, value2, "domicilePlaceAddress");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("HOBBY is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("HOBBY is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("HOBBY =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("HOBBY <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("HOBBY >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("HOBBY >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("HOBBY <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("HOBBY <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("HOBBY like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("HOBBY not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("HOBBY in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("HOBBY not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("HOBBY between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("HOBBY not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("INTRO is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("INTRO =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("INTRO <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("INTRO >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("INTRO >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("INTRO <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("INTRO <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("INTRO like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("INTRO not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("INTRO in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("INTRO not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("INTRO between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("INTRO not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andPresentAddressIsNull() {
            addCriterion("PRESENT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPresentAddressIsNotNull() {
            addCriterion("PRESENT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPresentAddressEqualTo(String value) {
            addCriterion("PRESENT_ADDRESS =", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressNotEqualTo(String value) {
            addCriterion("PRESENT_ADDRESS <>", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressGreaterThan(String value) {
            addCriterion("PRESENT_ADDRESS >", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PRESENT_ADDRESS >=", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressLessThan(String value) {
            addCriterion("PRESENT_ADDRESS <", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressLessThanOrEqualTo(String value) {
            addCriterion("PRESENT_ADDRESS <=", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressLike(String value) {
            addCriterion("PRESENT_ADDRESS like", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressNotLike(String value) {
            addCriterion("PRESENT_ADDRESS not like", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressIn(List<String> values) {
            addCriterion("PRESENT_ADDRESS in", values, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressNotIn(List<String> values) {
            addCriterion("PRESENT_ADDRESS not in", values, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressBetween(String value1, String value2) {
            addCriterion("PRESENT_ADDRESS between", value1, value2, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressNotBetween(String value1, String value2) {
            addCriterion("PRESENT_ADDRESS not between", value1, value2, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNull() {
            addCriterion("ENTRY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("ENTRY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY_DATE <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<Date> values) {
            addCriterionForJDBCDate("ENTRY_DATE in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENTRY_DATE not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTRY_DATE between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTRY_DATE not between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("UPDATED_BY like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("UPDATED_BY not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("UPDATED_BY not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
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