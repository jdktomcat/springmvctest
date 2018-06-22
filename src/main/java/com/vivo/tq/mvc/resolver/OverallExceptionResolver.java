package com.vivo.tq.mvc.resolver;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 类描述：异常解决
 *
 * @author 汤旗
 * @date 2018-06-19
 */
@ControllerAdvice(basePackages = "com.vivo.tq.mvc.controller")
public class OverallExceptionResolver {

    private static final String CONTENT_TYPE = "text/json; charset=UTF-8";

//    @ExceptionHandler({Exception.class})
//    public void resolveException(HttpServletRequest request, HttpServletResponse response, MissingServletRequestParameterException ex) throws Exception {
////        response.setContentType(CONTENT_TYPE);
////        ExceptionBean exceptionBean = new ExceptionBean();
////        exceptionBean.setMessage(ex.getMessage());
////        exceptionBean.setRemoteHost(request.getRemoteAddr());
////        exceptionBean.setUri(request.getRequestURI());
////        exceptionBean.setParam(request.getParameterMap());
////        PrintWriter out = response.getWriter();
////        out.print(JSONObject.toJSONString(exceptionBean));
//    }

    @ExceptionHandler({MissingServletRequestParameterException.class})
    public void resolveSubException(HttpServletRequest request, HttpServletResponse response, MissingServletRequestParameterException ex) throws Exception {
        response.setContentType(CONTENT_TYPE);
        ExceptionBean exceptionBean = new ExceptionBean();
        exceptionBean.setMessage(ex.getMessage());
        exceptionBean.setRemoteHost(request.getRemoteAddr());
        exceptionBean.setUri(request.getRequestURI());
        exceptionBean.setParam(request.getParameterMap());
        PrintWriter out = response.getWriter();
        out.print(JSONObject.toJSONString(exceptionBean));
    }
}
