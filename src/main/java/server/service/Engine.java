package server.service;

import server.app.Host;
import server.app.Mapper;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-14 23:13
 */
public class Engine {

    private Mapper mapper;

    public Engine() {
    }

    public Engine(Mapper mapper) {
        this.mapper = mapper;
    }

    public Mapper getMapper() {
        return mapper;
    }

    public void setMapper(Mapper mapper) {
        this.mapper = mapper;
    }

}
