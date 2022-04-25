package dynamicproxy.gpproxy.client;


/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class ZhangSan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }

    @Override
    public void buyInsure() {
        System.out.println("50W");
    }
}
