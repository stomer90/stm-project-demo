package stm.zuuledgeservice.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

//@Component
public class LoggingFilter {//extends ZuulFilter {

//    private static final Logger LOG = LoggerFactory.getLogger(LoggingFilter.class);
//
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    @Override
//    public int filterOrder() {
//        return 1;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//
//        LOG.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
//
//        return null;
//    }
}
