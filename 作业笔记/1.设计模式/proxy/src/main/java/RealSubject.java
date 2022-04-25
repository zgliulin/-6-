/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("real service is called");
    }
}
