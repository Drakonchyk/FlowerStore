package flower;

public class Chamomile extends Flower {
    Chamomile() {
        super(FlowerType.CHAMOMILE);
    }
    Chamomile(double newSepalLengthh, FlowerColor newColor,
              double newPrice) {
        super(newSepalLengthh, newColor, newPrice, FlowerType.CHAMOMILE);
    }
}