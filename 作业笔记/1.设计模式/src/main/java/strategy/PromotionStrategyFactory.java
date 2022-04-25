package strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/25
 */
public class PromotionStrategyFactory {
    private static final IpromotionStrategy EMPTY = new EmptyStrategy();

    private PromotionStrategyFactory(){

    }
    private static Map<String, IpromotionStrategy> PROMOTIONS = new HashMap<>();

    static {
        PROMOTIONS.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTIONS.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTIONS.put(PromotionKey.GROUP, new GroupStrategy());
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String GROUP = "GROUP";
        String CASHBACK = "CASHBACK";
    }

    public static IpromotionStrategy getPromotionStrategy(String key) {
        if (PROMOTIONS.containsKey(key)) {
            return PROMOTIONS.get(key);
        }
        return EMPTY;
    }

    public static Set<String> getPromotionKeys() {
        return PROMOTIONS.keySet();
    }
}
