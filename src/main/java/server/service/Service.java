package server.service;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-14 23:11
 */
public class Service {


    private Connect[] connects;

    private int index = 0;

    private Engine engine;

    public Service(Connect[] connects, Engine engine) {
        this.connects = connects;
        this.engine = engine;
    }

    public Service() {
    }

    public void init(int size){
        connects = new Connect[size];
    }

    public Connect[] getConnects() {
        return connects;
    }

    public void setConnects(Connect[] connects) {
        this.connects = connects;
    }

    public void addConnect(Connect connect){
        connects[index++] = connect;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
