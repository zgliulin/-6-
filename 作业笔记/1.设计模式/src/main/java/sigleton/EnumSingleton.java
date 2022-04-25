package sigleton;

/**
 * Description: 枚举式单例
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
