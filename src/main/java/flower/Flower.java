package flower;

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
    public Flower(double newSepalLengthh, FlowerColor newColor,
                  double newPrice, FlowerType newFlowerType) {
        sepalLength = newSepalLengthh;
        color = newColor;
        price = newPrice;
        flowerType = newFlowerType;
    }
    public Flower() { }
    public Flower(FlowerType type) {
        flowerType = type;
    }
    public String getColor() {
        return color.toString();
    }
}