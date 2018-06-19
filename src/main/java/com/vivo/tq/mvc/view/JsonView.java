package com.vivo.tq.mvc.view;


import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

/**
 * 类描述：JSON view
 *
 * @author 汤旗
 * @date 2018-06-19
 */
@Component("jsonView")
public class JsonView extends AbstractView {
    /**
     * Subclasses must implement this method to actually render the view.
     * <p>The first step will be preparing the request: In the JSP case,
     * this would mean setting model objects as request attributes.
     * The second step will be the actual rendering of the view,
     * for example including the JSP via a RequestDispatcher.
     *
     * @param model    combined output Map (never {@code null}),
     *                 with dynamic values taking precedence over static attributes
     * @param request  current HTTP request
     * @param response current HTTP response
     * @throws Exception if rendering failed
     */
    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/json; charset=UTF-8");
        PrintWriter out = response.getWriter();
        JSONObject jb = new JSONObject(model);
        out.print(jb.toJSONString());
    }
}
