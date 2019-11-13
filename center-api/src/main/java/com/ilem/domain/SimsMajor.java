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
public class SimsMajor implements Serializable {

	private static final long serialVersionUID = 4080298166792256808L;

	/** 专业ID */
	private String id;

	/** 专业名称 */
	private String name;

	/** 专业简称 */
	private String shortName;

	/** 开设时间 */
	private java.util.Date estabDate;

	/** 专业介绍 */
	private String intro;

	/** 学费 */
	private String tuitionFee;

	/** 创建人 */
	private String createdBy;

	/** 创建时间 */
	private java.util.Date createdTime;

	/** 更新人 */
	private String updatedBy;

	/** 更新时间 */
	private java.util.Date updatedTime;

}
