package com.ilem.dto.input.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yuwenkai
 * @date 2019/11/14 11:56 上午
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AuthUserAddRpcIn implements Serializable {

	/** ID */
	private String id;

	/** 用户名 */
	private String name;

	/** 密码 */
	private String password;

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
}
