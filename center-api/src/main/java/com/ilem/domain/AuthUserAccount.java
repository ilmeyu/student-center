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
public class AuthUserAccount implements Serializable {

	private static final long serialVersionUID = 7576722547666180806L;

	/** 账号ID */
	private String id;

	/** 用户ID */
	private String userId;

	/** 账号代号 */
	private String accountCode;

	/** 账号密码 */
	private String password;

	/** 账号类型 */
	private String accountType;

	/** 账号状态 */
	private String status;

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
