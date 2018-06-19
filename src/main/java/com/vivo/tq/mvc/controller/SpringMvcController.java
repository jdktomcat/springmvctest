package com.vivo.tq.mvc.controller;

import com.vivo.tq.mvc.model.FormatModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 类描述：
 *
 * @author 汤旗
 * @date 2018-06-19
 */
@Controller
@RequestMapping(value = "/mvc")
public class SpringMvcController {

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public String test(@RequestParam(value = "id",required = true) Integer id) {

        return "globaltest";
    }
}
