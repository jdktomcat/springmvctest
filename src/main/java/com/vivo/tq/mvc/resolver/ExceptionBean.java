package com.vivo.tq.mvc.resolver;

import java.util.Map;

/**
 * 类描述：异常信息类
 *
 * @author 汤旗
 * @date 2018-06-19
 */
public class ExceptionBean {

    /**
     * 异常信息
     */
    private String message;

    /**
     * 请求处理类
     */
    private String className;

    /**
     * 请求路径
     */
    private String uri;

    /**
     * 请求参数
     */
    private Map<String,Object> param;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Map<String, Object> getParam() {
        return param;
    }

    public void setParam(Map<String, Object> param) {
        this.param = param;
    }
}
