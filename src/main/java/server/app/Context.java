package server.app;

/**
 * @Description:
 * @Author: 长灵
 * @Date: 2020-04-13 23:53
 */
public class Context {

    private String contextName;

    private Wrapper[] wrappers;

    private Integer index = 0;


    public void init(int size){
        wrappers = new Wrapper[size];
    }

    public void addWrapper(Wrapper wrapper){
        wrappers[index++] = wrapper;
    }


    public Context(String contextName) {
        this.contextName = contextName;
    }

    public Wrapper[] getWrappers() {
        return wrappers;
    }

    public void setWrappers(Wrapper[] wrappers) {
        this.wrappers = wrappers;
    }

    public String getContextName() {
        return contextName;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }
}
