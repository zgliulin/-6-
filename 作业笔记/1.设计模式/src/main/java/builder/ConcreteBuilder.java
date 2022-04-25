package builder;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class ConcreteBuilder implements IBuilder {
    private Product product = new Product();

    @Override
    public Product build() {
        return product;
    }
}
