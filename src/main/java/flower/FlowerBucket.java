package flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
@Getter @NoArgsConstructor
public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack newFlowerPack) {
        flowerPacks.add(newFlowerPack);
    }
    public double getPrice() {
        double totalPrice = 0;
        for (FlowerPack newFlowerPack : flowerPacks) {
            totalPrice += newFlowerPack.getPrice();
        }
        return totalPrice;
    }
}
