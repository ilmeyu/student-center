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
public class SimsCollege implements Serializable {

	private static final long serialVersionUID = 8054174616189387820L;

	/** 学院ID */
	private String id;

	/** 学院名称 */
	private String name;

	/** 学院简称 */
	private String shortName;

	/** 学院介绍 */
	private String intro;

	/** 专业个数 */
	private Integer professionNumber;

	/** 学生人数 */
	private Integer studentNumber;

	/** 院长 */
	private String president;

	/** 创建人 */
	private String createdBy;

	/** 创建时间 */
	private java.util.Date createdTime;

	/** 更新人 */
	private String updatedBy;

	/** 更新时间 */
	private java.util.Date updatedTime;

}
