package com.ilem.dto.input.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yuwenkai
 * @date 2019/11/2 10:23 上午
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AuthUserListRpcIn implements Serializable {

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

	/** 创建人 */
	private String createdBy;

	/** 创建时间 */
	private java.util.Date createdTime;

	/** 更新人 */
	private String updatedBy;

	/** 更新时间 */
	private java.util.Date updatedTime;
}
