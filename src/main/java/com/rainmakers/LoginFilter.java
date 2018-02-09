package com.rainmakers;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("********************开始对请求进行过滤********************");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        /*如果请求为登录接口，则直接放行，不需要校验token*/
        if (request.getRequestURI().endsWith("/user/login")) {
            System.out.println("登录接口");
            filterChain.doFilter(request, response);
            return;
        }
        /*拦截其他接口，进行token的校验*/
        System.out.println("********************开始校验token******************");
        /*从请求头中获取token*/
        String token = request.getHeader("Authorization").substring(6);
        System.out.println(token);
        // Map<String,Object> resultMap = JWT.
    }

    @Override
    public void destroy() {

    }
}
