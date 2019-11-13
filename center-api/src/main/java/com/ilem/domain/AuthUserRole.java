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
public class AuthUserRole implements Serializable {

	private static final long serialVersionUID = 2774109819507959338L;

	/** 职责ID */
	private String id;

	/** 机构ID */
	private String orgId;

	/** 角色ID */
	private String roleId;

	/** 用户ID */
	private String userId;

	/** 岗位类型 */
	private String positionType;

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
