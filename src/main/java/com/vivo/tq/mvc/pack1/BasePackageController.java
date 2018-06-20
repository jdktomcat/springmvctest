package com.vivo.tq.mvc.pack1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @author 汤旗
 * @date 2018-06-20
 */
@RestController
@RequestMapping(value = "/find")
public class BasePackageController {
    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public String test(@RequestParam(value = "id", required = true) Integer id) {
        return "mvctest";
    }
}
