package strategy;

import java.util.Set;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/25
 */
public class Test {
    public static void main(String[] args) {
        Set<String> promotionKeys = PromotionStrategyFactory.getPromotionKeys();
        String selectKey = "COUPON";
        PromotionStrategyFactory.getPromotionStrategy(selectKey).promotion();
    }
}
