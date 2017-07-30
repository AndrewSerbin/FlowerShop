package ua.com.andrewserbin.model.entity.plant;

/**
 * Created by layer on 26.07.2017.
 */
public class NotFlower extends Plant {

    private NotFlowerType type;

    public NotFlower(String name, NotFlowerType type) {
        super(name);
        this.type = type;
    }

    public NotFlowerType getType() {
        return type;
    }

    public void setType(NotFlowerType type) {
        this.type = type;
    }
}
