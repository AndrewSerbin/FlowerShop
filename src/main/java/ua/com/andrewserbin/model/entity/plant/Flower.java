package ua.com.andrewserbin.model.entity.plant;

/**
 * Created by layer on 26.07.2017.
 */
public class Flower extends Plant {

    private FlowerType type;

    private boolean needFeed;

    private boolean needSupport;

    public Flower(String name, FlowerType type, boolean needFeed, boolean needSupport) {
        super(name);
        this.type = type;
        this.needFeed = needFeed;
        this.needSupport = needSupport;
    }
}
