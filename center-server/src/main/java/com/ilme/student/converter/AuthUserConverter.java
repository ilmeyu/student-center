package com.ilme.student.converter;

import com.ilem.domain.AuthUser;
import com.ilem.dto.input.user.AuthUserAddRpcIn;
import org.mapstruct.Mapper;

/**
 * @Author ilem
 * @date 2019/12/30 10:39 上午
 * @since 1.0.0
 **/
@Mapper(componentModel = "spring")
public interface AuthUserConverter {

	AuthUser userAddDto2Do(AuthUserAddRpcIn dto);
}
