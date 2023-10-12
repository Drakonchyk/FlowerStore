package flower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        flower.setPrice(5.0); // Set a price for the flower
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testAddFlowerPack() {
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket.addFlowerPack(flowerPack);
        Assertions.assertEquals(1, flowerBucket.getFlowerPacks().size());
    }

    @Test
    public void testGetPrice() {
        FlowerPack flowerPack1 = new FlowerPack(flower, 10);
        FlowerPack flowerPack2 = new FlowerPack(flower, 5);
        flowerBucket.addFlowerPack(flowerPack1);
        flowerBucket.addFlowerPack(flowerPack2);
        double expectedPrice = (10 * 5.0) + (5 * 5.0); // Price of flower packs
        Assertions.assertEquals(expectedPrice, flowerBucket.getPrice());
    }
}
