package flower;

import flower.store.Filter;
import flower.store.Item;
import flower.store.Store;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class StoreTest {
    private Store store;
    private Item item1;
    private Item item2;

    @BeforeEach
    public void init() {
        store = new Store();
        item1 = new ConcreteItem("Rose", 10.0);
        item2 = new ConcreteItem("Tulip", 5.0);
    }

    @Test
    public void testAddItem() {
        store.addItem(item1);
        store.addItem(item2);
        Assertions.assertEquals(2, store.getInventory().size());
    }

    @Test
    public void testSearch() {
        Filter filter = new ConcreteFilter("Rose");

        store.addItem(item1);
        store.addItem(item2);

        List<Item> searchResults = store.search(filter);
        Assertions.assertEquals(1, searchResults.size());
        // Replace the following line with an assertion using the item's properties
        // Assertions.assertEquals("Rose", searchResults.get(0).getName());
        Assertions.assertEquals("Rose", ((ConcreteItem)searchResults.get(0)).getName());
    }
}

class ConcreteItem extends Item {
    @Getter
    private String name;
    private double price;

    public ConcreteItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

}

class ConcreteFilter extends Filter {
    private final String targetName;

    public ConcreteFilter(String targetName) {
        this.targetName = targetName;
    }

    @Override
    public boolean match(Item item) {
        if (item instanceof ConcreteItem) {
            ConcreteItem concreteItem = (ConcreteItem) item;
            return concreteItem.getName().equals(targetName);
        }
        return false;
    }
}