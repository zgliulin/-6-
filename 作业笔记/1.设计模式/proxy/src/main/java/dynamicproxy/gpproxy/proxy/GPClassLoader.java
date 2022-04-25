package dynamicproxy.gpproxy.proxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/25
 */
public class GPClassLoader extends ClassLoader{
    private File classPathFile;

    public GPClassLoader(){
        String classPath = GPClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = GPClassLoader.class.getPackage().getName()+"."+name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile,name.replace("\\.","/")+".class");
            classFile = new File("D:\\workdoc\\doc\\me\\gupao-6th-study\\作业笔记\\1.设计模式\\proxy\\target\\classes\\dynamicproxy\\gpproxy\\proxy\\$Proxy0.class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1) {
                        out.write(buff,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
