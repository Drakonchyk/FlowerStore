package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    public Flower(final double newSepalLengthh, final FlowerColor newColor,
                  final double newPrice, final FlowerType newFlowerType) {
        sepalLength = newSepalLengthh;
        color = newColor;
        price = newPrice;
        flowerType = newFlowerType;
    }
    public Flower() { }
    public Flower(final FlowerType type) {
        flowerType = type;
    }
    public String getColor() {
        return color.toString();
    }
}