package strategy;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/25
 */
public class PromotionActivity {
    private IpromotionStrategy strategy;

    public PromotionActivity(IpromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.promotion();
    }
}
