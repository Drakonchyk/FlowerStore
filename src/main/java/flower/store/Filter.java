package flower.store;

public abstract class Filter{
    protected abstract boolean match(Item item);
}
