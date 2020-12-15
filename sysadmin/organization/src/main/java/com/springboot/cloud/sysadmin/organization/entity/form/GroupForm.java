package com.springboot.cloud.sysadmin.organization.entity.form;

import com.springboot.cloud.common.web.entity.form.BaseForm;
import com.springboot.cloud.sysadmin.organization.entity.po.Group;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel
@Data
public class GroupForm extends BaseForm<Group> {

    @NotBlank(message = "组织父id不能为空")
    @ApiModelProperty(value = "组织父id")
    private String parentId;

    @NotBlank(message = "组织名称不能为空")
    @ApiModelProperty(value = "组织名称")
    private String name;

    @ApiModelProperty(value = "组织描述")
    private String description;
    
    @ApiModelProperty(value = "组织编码")
    private String code;
    
    @ApiModelProperty(value = "组织类型")
    private String type;
}
