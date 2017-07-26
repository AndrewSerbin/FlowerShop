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

    static String DEFAULT = "Default";
    
    @Test (expected = IncompleteBouquetInitialization.class)
    public void buildBouquetWithoutEvent() throws Exception {
        Bouquet bouquet = Bouquet.getBuilder()
                .setFreshness(Freshness.BAD)
                .setPrice(Price.CHEAP)
                .setSize(Size.MEDIUM)
                .setStemLength(StemLength.LONG)
                .setFlowers(new Flower(DEFAULT, FlowerType.MULTI_FLOWER,
                        true, true))
                .setBasket(new Basket(DEFAULT))
                .setRibbon(new Ribbon(DEFAULT))
                .setWrapper(new Wrapper(DEFAULT))
                .build();
    }

}