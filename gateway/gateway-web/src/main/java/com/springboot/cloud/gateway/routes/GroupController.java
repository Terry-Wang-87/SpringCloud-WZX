package com.springboot.cloud.gateway.routes;

import com.springboot.cloud.common.core.entity.vo.Result;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/group")
@Api("group")
@Slf4j
public class GroupController {

    @ApiOperation(value = "获取用户组", notes = "获取指定用户组信息")
    @ApiImplicitParam(paramType = "path", name = "id", value = "用户组ID", required = true, dataType = "string")
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable String id) {
        log.debug("get with id:{}", id);
        return Result.success("");
    }
}