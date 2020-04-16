package server.service;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-14 23:13
 */
public class Connect {

    private Integer port;

    public Connect(Integer port) {
        this.port = port;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
