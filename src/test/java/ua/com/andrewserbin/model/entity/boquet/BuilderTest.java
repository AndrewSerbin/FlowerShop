package ua.com.andrewserbin.model.entity.boquet;

import org.junit.Test;
import ua.com.andrewserbin.model.entity.accessory.Basket;
import ua.com.andrewserbin.model.entity.accessory.Ribbon;
import ua.com.andrewserbin.model.entity.accessory.Wrapper;
import ua.com.andrewserbin.model.entity.boquet.util.IncompleteBouquetInitialization;
import ua.com.andrewserbin.model.entity.plant.Flower;
import ua.com.andrewserbin.model.entity.plant.FlowerType;

/**
 * Created by layer on 26.07.2017.
 */
public class BuilderTest {

    static String DEFAULT_NAME = "Default";

    @Test (expected = IncompleteBouquetInitialization.class)
    public void buildBouquetWithoutEvent() throws Exception {
        Bouquet bouquet = Bouquet.getBuilder()
                .setFreshness(Freshness.BAD)
                .setPrice(Price.CHEAP)
                .setSize(Size.MEDIUM)
                .setStemLength(StemLength.LONG)
                .setFlowers(new Flower(FlowerExample.ROSE.name(), FlowerExample.ROSE.getType(),
                        FlowerExample.ROSE.isNeedFeed(), FlowerExample.ROSE.isNeedSupport()))
                .setBasket(new Basket(DEFAULT_NAME))
                .setRibbon(new Ribbon(DEFAULT_NAME))
                .setWrapper(new Wrapper(DEFAULT_NAME))
                .build();
    }

}