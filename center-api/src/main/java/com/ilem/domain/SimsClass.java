package com.ilem.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;

/**
 * Auto Generated Sat Nov 02 10:03:02 CST 2019
 *
 * @author ilme
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SimsClass implements Serializable {

	private static final long serialVersionUID = 7919982514790787832L;

	/** 所在学院 */
	private String collegeId;

	/** 所属专业 */
	private String majorId;

	/** 班级ID */
	private String id;

	/** 班级名称 */
	private String name;

	/** 班级人数 */
	private Integer studentNumber;

	/** 辅导员 */
	private String adviser;

	/** 成立时间 */
	private java.util.Date estabDate;

	/** 学习年数 */
	private Integer yearNumber;

	/** 创建人 */
	private String cratedBy;

	/** 创建时间 */
	private java.util.Date cratedTime;

	/** 更新人 */
	private String updatedBy;

	/** 更新时间 */
	private java.util.Date updatedTime;

}
