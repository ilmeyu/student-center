package com.ilem.dto.input.user;

import com.ilem.dto.common.RpcInput;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author lime
 * @date 2019/11/14 11:56 上午
 **/
@Getter
@Setter
@Accessors(chain = true)
public class AuthUserAddRpcIn implements RpcInput {

	private static final long serialVersionUID = -4285749299059236421L;

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
		check(null != id && 64 > id.length(), "字段id过长");
		check(null != name && 64 > name.length(), "字段name过长");
		check(null != password && 64 > password.length(), "字段密码过长");
	}
}
