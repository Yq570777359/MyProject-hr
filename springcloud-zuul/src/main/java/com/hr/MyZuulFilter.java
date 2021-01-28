package com.hr;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyZuulFilter extends ZuulFilter {

    public String filterType() {
        return "pre";
    }

    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        return false;
    }

    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();


        return null;
    }
}
