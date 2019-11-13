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
public class AuthUserBehavior implements Serializable {

	private static final long serialVersionUID = 8323000837272877207L;

	/** 记录流水号 */
	private String id;

	/** 用户号 */
	private String userId;

	/** 关联对象类型 */
	private String objectType;

	/** 关联对象号 */
	private String objectId;

	/** 行为类型 */
	private String type;

	/** 行为数值 */
	private String value;

	/** 行为说明 */
	private String intro;

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
