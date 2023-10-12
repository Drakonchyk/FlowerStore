package flower;

public class Rose extends Flower {
    Rose() {
        super(FlowerType.ROSE);
    }
    Rose(double newSepalLengthh, FlowerColor newColor,
         double newPrice) {
        super(newSepalLengthh, newColor, newPrice, FlowerType.ROSE);
    }
}