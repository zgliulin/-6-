package dynamicproxy.jdkproxy;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/25
 */
public class Test {
    public static void main(String[] args) {
        JkdMeipo meipo = new JkdMeipo();
        meipo.getInstance(new ZhangSan()).findLove();
        meipo.getInstance(new ZhaoLiu()).findLove();
    }
}
