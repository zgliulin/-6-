package sigleton;

/**
 * Description:懒汉式单例写法1
 * 优点：节省了内存
 * 缺点：可能会出现线程不安全，可以在方法上加synchronized关键字，但是又会出现新的问题，会造成性能瓶颈
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class LazzySingleton {
    private static LazzySingleton hungrysigleton;

    private LazzySingleton() {
    }

    public static LazzySingleton getInstance() {
        if (hungrysigleton == null) {
            hungrysigleton = new LazzySingleton();
        }
        return hungrysigleton;
    }
}
