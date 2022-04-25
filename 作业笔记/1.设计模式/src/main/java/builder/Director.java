package builder;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class Director {
    public static void main(String[] args) {
        IBuilder builder = new ConcreteBuilder();
        System.out.println(builder.build());
    }
}
