package com.ilme.student.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SimsClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimsClassExample() {
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

        public Criteria andMajorIdIsNull() {
            addCriterion("MAJOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("MAJOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(String value) {
            addCriterion("MAJOR_ID =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(String value) {
            addCriterion("MAJOR_ID <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(String value) {
            addCriterion("MAJOR_ID >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR_ID >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(String value) {
            addCriterion("MAJOR_ID <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(String value) {
            addCriterion("MAJOR_ID <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLike(String value) {
            addCriterion("MAJOR_ID like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotLike(String value) {
            addCriterion("MAJOR_ID not like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<String> values) {
            addCriterion("MAJOR_ID in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<String> values) {
            addCriterion("MAJOR_ID not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(String value1, String value2) {
            addCriterion("MAJOR_ID between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(String value1, String value2) {
            addCriterion("MAJOR_ID not between", value1, value2, "majorId");
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

        public Criteria andStudentNumberIsNull() {
            addCriterion("STUDENT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNotNull() {
            addCriterion("STUDENT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberEqualTo(Integer value) {
            addCriterion("STUDENT_NUMBER =", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotEqualTo(Integer value) {
            addCriterion("STUDENT_NUMBER <>", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThan(Integer value) {
            addCriterion("STUDENT_NUMBER >", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_NUMBER >=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThan(Integer value) {
            addCriterion("STUDENT_NUMBER <", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_NUMBER <=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIn(List<Integer> values) {
            addCriterion("STUDENT_NUMBER in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotIn(List<Integer> values) {
            addCriterion("STUDENT_NUMBER not in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_NUMBER between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_NUMBER not between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andAdviserIsNull() {
            addCriterion("ADVISER is null");
            return (Criteria) this;
        }

        public Criteria andAdviserIsNotNull() {
            addCriterion("ADVISER is not null");
            return (Criteria) this;
        }

        public Criteria andAdviserEqualTo(String value) {
            addCriterion("ADVISER =", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserNotEqualTo(String value) {
            addCriterion("ADVISER <>", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserGreaterThan(String value) {
            addCriterion("ADVISER >", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISER >=", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserLessThan(String value) {
            addCriterion("ADVISER <", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserLessThanOrEqualTo(String value) {
            addCriterion("ADVISER <=", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserLike(String value) {
            addCriterion("ADVISER like", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserNotLike(String value) {
            addCriterion("ADVISER not like", value, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserIn(List<String> values) {
            addCriterion("ADVISER in", values, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserNotIn(List<String> values) {
            addCriterion("ADVISER not in", values, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserBetween(String value1, String value2) {
            addCriterion("ADVISER between", value1, value2, "adviser");
            return (Criteria) this;
        }

        public Criteria andAdviserNotBetween(String value1, String value2) {
            addCriterion("ADVISER not between", value1, value2, "adviser");
            return (Criteria) this;
        }

        public Criteria andEstabDateIsNull() {
            addCriterion("ESTAB_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEstabDateIsNotNull() {
            addCriterion("ESTAB_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEstabDateEqualTo(Date value) {
            addCriterionForJDBCDate("ESTAB_DATE =", value, "estabDate");
            return (Criteria) this;
        }

        public Criteria andEstabDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ESTAB_DATE <>", value, "estabDate");
            return (Criteria) this;
        }

        public Criteria andEstabDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ESTAB_DATE >", value, "estabDate");
            return (Criteria) this;
        }

        public Criteria andEstabDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ESTAB_DATE >=", value, "estabDate");
            return (Criteria) this;
        }

        public Criteria andEstabDateLessThan(Date value) {
            addCriterionForJDBCDate("ESTAB_DATE <", value, "estabDate");
            return (Criteria) this;
        }

        public Criteria andEstabDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ESTAB_DATE <=", value, "estabDate");
            return (Criteria) this;
        }

        public Criteria andEstabDateIn(List<Date> values) {
            addCriterionForJDBCDate("ESTAB_DATE in", values, "estabDate");
            return (Criteria) this;
        }

        public Criteria andEstabDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ESTAB_DATE not in", values, "estabDate");
            return (Criteria) this;
        }

        public Criteria andEstabDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ESTAB_DATE between", value1, value2, "estabDate");
            return (Criteria) this;
        }

        public Criteria andEstabDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ESTAB_DATE not between", value1, value2, "estabDate");
            return (Criteria) this;
        }

        public Criteria andYearNumberIsNull() {
            addCriterion("YEAR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andYearNumberIsNotNull() {
            addCriterion("YEAR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andYearNumberEqualTo(Integer value) {
            addCriterion("YEAR_NUMBER =", value, "yearNumber");
            return (Criteria) this;
        }

        public Criteria andYearNumberNotEqualTo(Integer value) {
            addCriterion("YEAR_NUMBER <>", value, "yearNumber");
            return (Criteria) this;
        }

        public Criteria andYearNumberGreaterThan(Integer value) {
            addCriterion("YEAR_NUMBER >", value, "yearNumber");
            return (Criteria) this;
        }

        public Criteria andYearNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("YEAR_NUMBER >=", value, "yearNumber");
            return (Criteria) this;
        }

        public Criteria andYearNumberLessThan(Integer value) {
            addCriterion("YEAR_NUMBER <", value, "yearNumber");
            return (Criteria) this;
        }

        public Criteria andYearNumberLessThanOrEqualTo(Integer value) {
            addCriterion("YEAR_NUMBER <=", value, "yearNumber");
            return (Criteria) this;
        }

        public Criteria andYearNumberIn(List<Integer> values) {
            addCriterion("YEAR_NUMBER in", values, "yearNumber");
            return (Criteria) this;
        }

        public Criteria andYearNumberNotIn(List<Integer> values) {
            addCriterion("YEAR_NUMBER not in", values, "yearNumber");
            return (Criteria) this;
        }

        public Criteria andYearNumberBetween(Integer value1, Integer value2) {
            addCriterion("YEAR_NUMBER between", value1, value2, "yearNumber");
            return (Criteria) this;
        }

        public Criteria andYearNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("YEAR_NUMBER not between", value1, value2, "yearNumber");
            return (Criteria) this;
        }

        public Criteria andCratedByIsNull() {
            addCriterion("CRATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCratedByIsNotNull() {
            addCriterion("CRATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCratedByEqualTo(String value) {
            addCriterion("CRATED_BY =", value, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByNotEqualTo(String value) {
            addCriterion("CRATED_BY <>", value, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByGreaterThan(String value) {
            addCriterion("CRATED_BY >", value, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByGreaterThanOrEqualTo(String value) {
            addCriterion("CRATED_BY >=", value, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByLessThan(String value) {
            addCriterion("CRATED_BY <", value, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByLessThanOrEqualTo(String value) {
            addCriterion("CRATED_BY <=", value, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByLike(String value) {
            addCriterion("CRATED_BY like", value, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByNotLike(String value) {
            addCriterion("CRATED_BY not like", value, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByIn(List<String> values) {
            addCriterion("CRATED_BY in", values, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByNotIn(List<String> values) {
            addCriterion("CRATED_BY not in", values, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByBetween(String value1, String value2) {
            addCriterion("CRATED_BY between", value1, value2, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedByNotBetween(String value1, String value2) {
            addCriterion("CRATED_BY not between", value1, value2, "cratedBy");
            return (Criteria) this;
        }

        public Criteria andCratedTimeIsNull() {
            addCriterion("CRATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCratedTimeIsNotNull() {
            addCriterion("CRATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCratedTimeEqualTo(Date value) {
            addCriterion("CRATED_TIME =", value, "cratedTime");
            return (Criteria) this;
        }

        public Criteria andCratedTimeNotEqualTo(Date value) {
            addCriterion("CRATED_TIME <>", value, "cratedTime");
            return (Criteria) this;
        }

        public Criteria andCratedTimeGreaterThan(Date value) {
            addCriterion("CRATED_TIME >", value, "cratedTime");
            return (Criteria) this;
        }

        public Criteria andCratedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRATED_TIME >=", value, "cratedTime");
            return (Criteria) this;
        }

        public Criteria andCratedTimeLessThan(Date value) {
            addCriterion("CRATED_TIME <", value, "cratedTime");
            return (Criteria) this;
        }

        public Criteria andCratedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRATED_TIME <=", value, "cratedTime");
            return (Criteria) this;
        }

        public Criteria andCratedTimeIn(List<Date> values) {
            addCriterion("CRATED_TIME in", values, "cratedTime");
            return (Criteria) this;
        }

        public Criteria andCratedTimeNotIn(List<Date> values) {
            addCriterion("CRATED_TIME not in", values, "cratedTime");
            return (Criteria) this;
        }

        public Criteria andCratedTimeBetween(Date value1, Date value2) {
            addCriterion("CRATED_TIME between", value1, value2, "cratedTime");
            return (Criteria) this;
        }

        public Criteria andCratedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRATED_TIME not between", value1, value2, "cratedTime");
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