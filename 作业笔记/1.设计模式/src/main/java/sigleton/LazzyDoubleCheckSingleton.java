package sigleton;

/**
 * Description:懒汉式单例写法2
 * 优点：性能高了，线程安全了
 * 缺点：可读性难度加大
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class LazzyDoubleCheckSingleton {
    private volatile static LazzyDoubleCheckSingleton hungrysigleton;

    private LazzyDoubleCheckSingleton() {
    }

    public static LazzyDoubleCheckSingleton getInstance() {
        // 检查是否要阻塞
        if (hungrysigleton == null) {
            synchronized (LazzyDoubleCheckSingleton.class) {
                // 检查是否要重新创建实例
                if (hungrysigleton == null) {
                    hungrysigleton = new LazzyDoubleCheckSingleton();
                    // 指令重排序的问题
                }
            }
        }
        return hungrysigleton;
    }
}
