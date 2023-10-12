package flower.store;

public class Rose extends Flower {
    Rose() {
        super(FlowerType.ROSE);
    }
    Rose(final double newSepalLengthh, final FlowerColor newColor,
         final double newPrice) {
        super(newSepalLengthh, newColor, newPrice, FlowerType.ROSE);
    }
}