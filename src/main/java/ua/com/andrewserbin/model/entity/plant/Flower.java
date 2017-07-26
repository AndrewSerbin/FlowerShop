package ua.com.andrewserbin.model.entity.plant;

/**
 * Created by layer on 26.07.2017.
 */
public class Flower extends Plant {

    private FlowerType type;

    public Flower(String name, FlowerType type) {
        super(name);
        this.type = type;
    }
}
