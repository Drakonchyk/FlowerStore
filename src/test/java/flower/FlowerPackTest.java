package flower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerPackTest {
    private FlowerPack flowerPack;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        flowerPack = new FlowerPack(flower, 10); // Example: 10 flowers in a pack
    }

    @Test
    public void testGetFlower() {
        Assertions.assertEquals(flower, flowerPack.getFlower());
    }

    @Test
    public void testGetAmount() {
        Assertions.assertEquals(10, flowerPack.getAmount()); // Example: 10 flowers in a pack
    }

    @Test
    public void testGetPrice() {
        flower.setPrice(5.0); // Set the price of the flower
        double expectedPrice = 5.0 * 10; // Price per flower times the amount
        Assertions.assertEquals(expectedPrice, flowerPack.getPrice());
    }
}
