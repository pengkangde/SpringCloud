package com.kd.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class AccessFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(AccessFilter.class);


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = rc.getRequest();
        //TODO get token
        String token = null;
        if (token == null) {
            logger.warn("token is null");
            /*rc.setSendZuulResponse(true);
            rc.setResponseStatusCode(401);
            rc.setResponseBody("token is null");*/
        } else {
            //TODO check token
            logger.info("token is ok");
        }
        return null;
    }
}
