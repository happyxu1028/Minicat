package server.util;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class DiskClassLoader
{
  public static Class loadClass(String path, String classPath)
  {
    try
    {
      File file = new File(path);
      URL url = file.toURL();
      URL[] urls = { url };
      ClassLoader cl = new URLClassLoader(urls);
      Class cls = cl.loadClass(classPath);
      return cls;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
  public static void main(String[] args) throws Exception {
    Class cls = loadClass("C:\\Users\\v-guxiaoliang\\git\\Minicat\\src\\main\\resources\\webapp\\demo2", "server.LagouServlet2");
    System.out.println(cls.newInstance());
  }
}