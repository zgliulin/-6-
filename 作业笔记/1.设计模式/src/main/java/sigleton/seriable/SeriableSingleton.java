package sigleton.seriable;

import java.io.Serializable;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class SeriableSingleton implements Serializable {
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 解决被序列化破坏的问题
     * @return
     */
    private Object readResolve() {
        return INSTANCE;
    }
}

