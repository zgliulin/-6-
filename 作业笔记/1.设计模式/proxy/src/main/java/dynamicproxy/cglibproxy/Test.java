package dynamicproxy.cglibproxy;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/25
 */
public class Test {
    public static void main(String[] args) {
        ZhangSan zhangSan =  (ZhangSan)new CglibMeipo().getInstance(ZhangSan.class);
        zhangSan.findLove();
    }
}
