package com.vivo.tq.mvc.controller;

import com.vivo.tq.mvc.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类描述：swagger2测试控制类
 *
 * @author 汤旗
 * @date 2018-12-21
 */
@RestController
@RequestMapping(value = "/user")
@Api(tags = "swagger2接口",description = "swagger2接口")
public class Swagger2ExampleController {

    /**
     * 数据存储
     */
    private static Map<Integer, User> USER_DATA = new HashMap<>();

    @ApiOperation(value = "获取用户列表", notes = "查询用户列表")
    @RequestMapping(value = {"query"}, method = RequestMethod.GET)
    public List<User> getUserList() {
        return new ArrayList<>(USER_DATA.values());
    }

}
