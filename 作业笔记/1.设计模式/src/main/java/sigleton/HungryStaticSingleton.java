package sigleton;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrysigleton;

    static {
        hungrysigleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungrysigleton;
    }
}
