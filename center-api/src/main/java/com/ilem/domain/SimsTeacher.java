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
public class SimsTeacher implements Serializable {

	private static final long serialVersionUID = 9217559510376616194L;

	/** 所在学院 */
	private String collegeId;

	/** 教师编号 */
	private String id;

	/** 姓名 */
	private String name;

	/** 性别 */
	private String gender;

	/** 出生日期 */
	private java.util.Date birth;

	/** 介绍 */
	private String intro;

	/** 创建人 */
	private String createdBy;

	/** 创建时间 */
	private java.util.Date createdTime;

	/** 更新人 */
	private String updatedBy;

	/** 更新时间 */
	private java.util.Date updatedTime;

}
