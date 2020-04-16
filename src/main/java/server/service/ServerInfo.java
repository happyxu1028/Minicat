package server.service;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-14 23:11
 */
public class ServerInfo {


    private Service service;

    public ServerInfo() {
    }

    public ServerInfo(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
