package server.app;


import server.Servlet;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-13 23:53
 */
public class Wrapper {


    private String urlPattern;

    private Servlet servlet;

    public Servlet getServlet() {
        return servlet;
    }

    public void setServlet(Servlet servlet) {
        this.servlet = servlet;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public Wrapper() {
    }

    public Wrapper(String urlPattern, Servlet servlet) {
        this.urlPattern = urlPattern;
        this.servlet = servlet;
    }
}
