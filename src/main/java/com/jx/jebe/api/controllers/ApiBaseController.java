package com.jx.jebe.api.controllers;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xiaowei on 17/7/31.
 */
@WebFilter(urlPatterns = {"/*"},
        dispatcherTypes = {DispatcherType.REQUEST},
        initParams = {@WebInitParam(name = "encoding", value = "UTF-8")}
)
public class ApiBaseController implements Filter{

//    private ArgoDispatcher dispatcher;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        dispatcher = ArgoDispatcherFactory.create(filterConfig.getServletContext());//.cr
//        dispatcher.init();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) request;
        HttpServletResponse httpResp = (HttpServletResponse) response;
        System.out.println(httpReq.getRequestURI());
        httpResp.getWriter().println("hello "+httpReq.getRequestURI());

    }

    @Override
    public void destroy() {
//        dispatcher.destroy();
    }
}
