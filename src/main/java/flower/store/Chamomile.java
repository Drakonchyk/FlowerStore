package flower.store;

public class Chamomile extends Flower {
    Chamomile() {
        super(FlowerType.CHAMOMILE);
    }
    Chamomile(final double newSepalLengthh, final FlowerColor newColor,
              final double newPrice) {
        super(newSepalLengthh, newColor, newPrice, FlowerType.CHAMOMILE);
    }
}