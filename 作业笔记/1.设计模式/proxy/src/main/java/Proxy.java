/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class Proxy implements ISubject{
    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void after() {
        System.out.println("called after request");
    }

    public void before() {
        System.out.println("called before request");
    }
}
