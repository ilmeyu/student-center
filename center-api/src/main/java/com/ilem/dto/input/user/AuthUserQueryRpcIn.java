package com.ilem.dto.input.user;

import com.ilem.dto.common.RpcInput;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author lime
 * @date 2019/11/2 10:23 上午
 **/
@Getter
@Setter
@Accessors(chain = true)
public class AuthUserQueryRpcIn implements RpcInput {

	private static final long serialVersionUID = 3738662764967381777L;

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

	@Override
	public void doCheck() {

	}
}
