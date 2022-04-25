package sigleton.clonetest;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class CloneTest {
    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype prototype = ConcretePrototype.getInstance();

        //复制原型对象
        ConcretePrototype cloneType = prototype.clone();

        System.out.println("原型对象和克隆对象比较：" + (prototype == cloneType));
    }
}
