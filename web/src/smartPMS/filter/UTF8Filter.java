package smartPMS.filter;

import javax.servlet.*;
import java.io.IOException;

public class UTF8Filter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF8");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
