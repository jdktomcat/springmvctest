package com.vivo.tq.mvc.resolver;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 类描述：异常解决
 *
 * @author 汤旗
 * @date 2018-06-19
 */
@ControllerAdvice(basePackages = "com.vivo.tq.mvc.controller")
public class OverallExceptionResolver {

    @ExceptionHandler({MissingServletRequestParameterException.class})
    @ResponseBody
    public ExceptionBean resolveSubException(HttpServletRequest request, MissingServletRequestParameterException ex) {
        return getExceptionBean(request, ex);
    }

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ExceptionBean resolveException(HttpServletRequest request, Exception ex) {
        return getExceptionBean(request, ex);
    }

    private ExceptionBean getExceptionBean(HttpServletRequest request, Exception ex) {
        ExceptionBean exceptionBean = new ExceptionBean();
        exceptionBean.setMessage(ex.getMessage());
        exceptionBean.setRemoteHost(request.getRemoteAddr());
        exceptionBean.setUri(request.getRequestURI());
        exceptionBean.setParam(request.getParameterMap());
        return exceptionBean;
    }

}
