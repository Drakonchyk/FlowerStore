package flower;

public class Tulip extends Flower {
    Tulip() {
        super(FlowerType.TULIP);
    }
    Tulip(double newSepalLengthh, FlowerColor newColor,
          double newPrice) {
        super(newSepalLengthh, newColor, newPrice, FlowerType.TULIP);
    }
}
