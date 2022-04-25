package dynamicproxy.jdkproxy;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class ZhaoLiu implements IPerson {
    @Override
    public void findLove() {
        System.out.println("赵六要求：有车有房学历高");
    }

    @Override
    public void buyInsure() {
        System.out.println("100W");
    }
}
