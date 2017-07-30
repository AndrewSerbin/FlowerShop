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

    public FlowerType getType() {
        return type;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }

    public boolean isNeedFeed() {
        return needFeed;
    }

    public void setNeedFeed(boolean needFeed) {
        this.needFeed = needFeed;
    }

    public boolean isNeedSupport() {
        return needSupport;
    }

    public void setNeedSupport(boolean needSupport) {
        this.needSupport = needSupport;
    }
}
