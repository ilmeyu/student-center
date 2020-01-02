package com.ilem.dto.common;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author ilme
 * @date 2019/11/1 11:51 上午
 **/
@Getter
@Setter
@Accessors(chain = true)
public class RpcPageIn implements RpcInput {

	private static final long serialVersionUID = 5762291504971259278L;

	private Integer limit;

	private Integer page;

	@Override
	public void doCheck() {
		check(1000 < limit || 0 > limit, "记录条数不能小于0或者大于1000");
		check(0 < page, "页码不能小于0");
	}
}
