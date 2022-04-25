package sigleton;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class HungrySingleton {
    private static final HungrySingleton hungrysigleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrysigleton;
    }
}
