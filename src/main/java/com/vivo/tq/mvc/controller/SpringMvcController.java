package com.vivo.tq.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：Spring MVC 测试
 *
 * @author 汤旗
 * @date 2018-06-19
 */
@RestController
@RequestMapping(value = "/mvc")
public class SpringMvcController {

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public String test(@RequestParam(value = "id", required = true) Integer id) {
        return "mvctest";
    }
}
