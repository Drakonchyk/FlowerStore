package flower.store;

public class Tulip extends Flower {
    Tulip() {
        super(FlowerType.TULIP);
    }
    Tulip(final double newSepalLengthh, final FlowerColor newColor,
          final double newPrice) {
        super(newSepalLengthh, newColor, newPrice, FlowerType.TULIP);
    }
}
