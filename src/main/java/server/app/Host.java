package server.app;

import server.service.Connect;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-13 23:53
 */
public class Host {

    private String name;

    private List<Context> contexts;

    private Integer index = 0;

//    public void init(int size){
//        contexts = new ArrayList<>(size);
//    }

    public void addContext(Context context){
        if(null == contexts ){
            contexts = new ArrayList<Context>();
        }
        contexts.add(context);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Context> getContexts() {
        return contexts;
    }

    public void setContexts(List<Context> contexts) {
        this.contexts = contexts;
    }
}
