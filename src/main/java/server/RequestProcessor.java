package server;

import server.app.Context;
import server.app.Host;
import server.app.Mapper;
import server.app.Wrapper;

import java.io.InputStream;
import java.net.Socket;
import java.util.Map;

public class RequestProcessor extends Thread {

    private Socket socket;
    private Mapper mapper;

    public RequestProcessor(Socket socket, Mapper mapper) {
        this.socket = socket;
        this.mapper = mapper;
    }

    @Override
    public void run() {
        try{
            InputStream inputStream = socket.getInputStream();

            // 封装Request对象和Response对象
            Request request = new Request(inputStream);
            Response response = new Response(socket.getOutputStream());

            Servlet servlet = getServlet(mapper,request);

            // 静态资源处理
            if(null == servlet) {
                response.outputHtml(request.getUrl());
            }else{
                // 动态资源servlet请求
                servlet.service(request,response);
            }

            socket.close();

        }catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * 根据路径获取Servlet
     * @param mapper
     * @param request
     * @return
     */
    private Servlet getServlet(Mapper mapper, Request request) {
        //http://localhost:8080/demo01/lagouServlet
        String[] split = request.getUrl().split("\\/");
        String context = split[1];
        String servletName = split[2];

        for (Host host : mapper.getHosts()) {
            // host匹配
           if( host.getName().equals(request.getHostAndPort().split(":")[0])){
               for (Context thisContext : host.getContexts()) {
                   // context 匹配
                   if(thisContext.getContextName().equals(context)){
                       for (Wrapper wrapper : thisContext.getWrappers()) {
                           // wrapper匹配
                           if(wrapper.getUrlPattern().equals("/"+servletName)){
                               return wrapper.getServlet();
                           }
                       }
                   }
               }
           }
        }
        return  null;
    }

    public static void main(String[] args) {
        String str = "http://localhost:8080/demo01/lagouServlet";
        String[] split = str.split("\\/");
        System.out.println(split);
    }
}
