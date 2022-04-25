package dynamicproxy.gpproxy.proxy;

import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/25
 */
public interface GPInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable ;
}
