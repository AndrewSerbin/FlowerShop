package ua.com.andrewserbin.model.entity.boquet;

import ua.com.andrewserbin.model.entity.plant.FlowerType;

/**
 * Data for testing.
 * Created by layer on 30.07.2017.
 */
public enum FlowerExample {

    ROSE(FlowerType.ONE_FLOWER, true, true),
    CHAMOMILE(FlowerType.MULTI_FLOWER, true, true);

    private FlowerType type;

    private boolean needFeed;

    private boolean needSupport;

    FlowerExample(FlowerType type, boolean needFeed, boolean needSupport) {
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
