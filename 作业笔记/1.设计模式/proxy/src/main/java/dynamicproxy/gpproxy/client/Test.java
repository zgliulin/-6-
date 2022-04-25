package dynamicproxy.gpproxy.client;


/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/25
 */
public class Test {
    public static void main(String[] args) {
        GPMeipo meipo = new GPMeipo();
        meipo.getInstance(new ZhangSan()).findLove();
    }
}
