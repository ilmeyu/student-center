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
public class AuthUser implements Serializable {

	private static final long serialVersionUID = 4366885025174976614L;

	/** 用户ID */
	private String id;

	/** 用户代码 */
	private String code;

	/** 用户名 */
	private String name;

	/** 密码 */
	private String password;

	/** 密码盐值 */
	private String salt;

	/** 头像 */
	private String avatar;

	/** 机构 */
	private String orgId;

	/** 邮件 */
	private String email;

	/** 手机号 */
	private String phone;

	/** 状态 */
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
