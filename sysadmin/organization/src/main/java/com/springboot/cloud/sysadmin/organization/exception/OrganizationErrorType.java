package com.springboot.cloud.sysadmin.organization.exception;

import com.springboot.cloud.common.core.exception.ErrorType;
import lombok.Getter;

@Getter
public enum OrganizationErrorType implements ErrorType {

    USER_NOT_FOUND("030100", "用户未找到！"),
    ROLE_NOT_FOUND("030200", "角色未找到！"),
	ORG_HAS_CHILD("030300", "存在下级用户！"),
	ORG_PARAM_ERROR("030500", "输入参数错误！"),
	ORG_NOT_FOUND("030400", "组织未找到！");

    /**
     * 错误类型码
     */
    private String code;
    /**
     * 错误类型描述信息
     */
    private String mesg;

    OrganizationErrorType(String code, String mesg) {
        this.code = code;
        this.mesg = mesg;
    }
}
