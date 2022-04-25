package staticproxy;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class ZhangLaoSan implements IPerson{

    private ZhangSan zhangSan;

    public ZhangLaoSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void findLove() {
        System.out.println("张老三开始物色");
        zhangSan.findLove();
        System.out.println("开始物色");
    }
}
