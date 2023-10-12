package flower.store;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

public class Store {
    @Getter
    private List<Item> inventory = new ArrayList<>();

    public void addItem(Item item) {
        inventory.add(item);
    }
    public List<Item> search(Filter filter) {
        List<Item> results = new ArrayList<>();
        for (Item item : inventory) {
            if (filter.match(item)) {
                results.add(item);
            }
        }
        return results;
    }
}