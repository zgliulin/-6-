package sigleton;

import java.lang.reflect.Constructor;

/**
 * Description: 反射破坏单例
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazzyStaticInnerSingleton.class;
            Constructor<?> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object instance1 = c.newInstance();
            Object instance2 = c.newInstance();
            System.out.println(instance1 == instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
