package flower;
import lombok.Getter;

public class FlowerPack {
    @Getter
    private Flower flower;
    @Getter
    private int amount;
    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
