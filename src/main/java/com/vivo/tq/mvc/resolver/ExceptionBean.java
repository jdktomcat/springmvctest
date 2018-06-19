package com.vivo.tq.mvc.resolver;

import java.util.Map;

/**
 * 类描述：异常信息类
 *
 * @author 汤旗
 * @date 2018-06-19
 */
public class ExceptionBean {

    private String className;

    private String uri;

    private Map<String,Object> param;

    public ExceptionBean() {
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
