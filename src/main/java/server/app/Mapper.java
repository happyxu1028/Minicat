package server.app;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-13 23:52
 */
public class Mapper {

    private Host[] hosts;

    private Integer index = 0;

    public Host[] getHosts() {
        return hosts;
    }

    public void setHosts(Host[] hosts) {
        this.hosts = hosts;
    }


    public void loadConfigXml(){

    }

    public void init(int size) {
        hosts = new Host[size];
    }

    public void addHost(Host host){
        hosts[index++] = host;
    }
}
