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
public class AuthRole implements Serializable {

	private static final long serialVersionUID = 1958276336578655047L;

	/** 角色ID */
	private String id;

	/** 角色代码 */
	private String code;

	/** 排序代码 */
	private String sortCode;

	/** 角色名 */
	private String name;

	/** 角色类型 */
	private String type;

	/** 是否应用于工作流 */
	private String inWorkFlow;

	/** 角色状态 */
	private String status;

	/** 角色描述 */
	private String summary;

	/** 乐观锁 */
	private Integer revision;

	/** 创建人 */
	private String createdBy;

	/** 创建时间 */
	private java.util.Date createdTime;

	/** 更新人 */
	private String updatedBy;

	/** 更新时间 */
	private java.util.Date updatedTime;

}
