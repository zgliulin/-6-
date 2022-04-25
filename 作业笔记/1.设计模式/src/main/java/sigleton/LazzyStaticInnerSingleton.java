package sigleton;

/**
 * Description:懒汉式单例写法3
 * 优点：利用了Java本身的语法特点，性能高，避免了内存浪费
 * 缺点：能够被反射破坏
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class LazzyStaticInnerSingleton {

    private LazzyStaticInnerSingleton() {
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不允许非法访问");
        }
    }

    public static LazzyStaticInnerSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazzyStaticInnerSingleton INSTANCE = new LazzyStaticInnerSingleton();
    }
}
