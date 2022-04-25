package dynamicproxy.gpproxy.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/25
 */
public class GPProxy {
    public static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader loader,
                                          Class<?>[] interfaces,
                                          GPInvocationHandler h) {
        try {
            // 1.动态生成源码.java
            String src = generateSrc(interfaces);
            // 2.Java文件输出到磁盘，保存为文件$Proxy0.java
            String filePath = GPProxy.class.getResource("").getPath();
            filePath = "D:\\workdoc\\doc\\me\\gupao-6th-study\\作业笔记\\1.设计模式\\proxy\\target\\classes\\dynamicproxy\\gpproxy\\proxy\\";
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();
            // 3.把java文件编译成$Proxy0.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();
            // 4.把生产的.class文件加载到JVM
            Class proxyClass = loader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            // 5. 返回新的代理对象
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package dynamicproxy.gpproxy.proxy;" + ln);
        sb.append("import dynamicproxy.gpproxy.client.IPerson;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public final class $Proxy0 implements " + interfaces[0].getName() + " {" + ln);
        sb.append("GPInvocationHandler h;" + ln);
        sb.append("public $Proxy0(GPInvocationHandler h) { " + ln);
            sb.append("this.h = h;" +ln);
        sb.append("}" + ln);

        for (Method method : interfaces[0].getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
//            StringBuilder paramNames = new StringBuilder();
//            StringBuilder paramValues = new StringBuilder();
//            StringBuilder paramClasses = new StringBuilder();
//
//            for (int i = 0; i < parameterTypes.length; i++) {
//                Class<?> parameterType = parameterTypes[i];
//                String type = parameterType.getName();
//                String
//            }

            sb.append("public " + method.getReturnType().getName() + " " + method.getName()+"() {" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName()+".class.getMethod(\""+ method.getName()+"\",new Class[]{});"+ln);
            sb.append("this.h.invoke(this,m,new Object[]{});" + ln);
            sb.append("return; " + ln);
            sb.append("}catch(Error _ex) {}" + ln);
            sb.append("catch(Throwable throwable)" + ln);
            sb.append("{" + ln);
            sb.append("throw new UndeclaredThrowableException(throwable);" + ln);
            sb.append("}" + ln);
            sb.append("}");
        }
        sb.append("}");

        return sb.toString();
    }
}
