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
public class AuthOrg implements Serializable {

	private static final long serialVersionUID = 8253888259154438071L;

	/** 机构ID */
	private String id;

	/** 机构代号 */
	private String code;

	/** 机构名 */
	private String name;

	/** 机构路径全称 */
	private String fullName;

	/** 机构简称 */
	private String shortName;

	/** 排序代码 */
	private String sortCode;

	/** 上级机构 */
	private String parentId;

	/** 机构级别 */
	private String level;

	/** 机构类型 */
	private String orgType;

	/** 负责人 */
	private String leader;

	/** 机构说明 */
	private String remark;

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
