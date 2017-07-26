package ua.com.andrewserbin.model.entity.boquet;

import ua.com.andrewserbin.model.entity.accessory.Basket;
import ua.com.andrewserbin.model.entity.accessory.Ribbon;
import ua.com.andrewserbin.model.entity.accessory.Wrapper;
import ua.com.andrewserbin.model.entity.boquet.util.IncompleteBouquetInitialization;
import ua.com.andrewserbin.model.entity.plant.Flower;
import java.util.ArrayList;

/**
 * Created by layer on 26.07.2017.
 */
public class Bouquet {

    private Event event;

    private Freshness freshness;

    private Price price;

    private Size size;

    private StemLength stemLength;

    private ArrayList<Flower> flowers;

    private Basket basket;

    private Ribbon ribbon;

    private Wrapper wrapper;

    public static Builder getBuilder() {
        return new Bouquet().new Builder();
    }

    public class Builder {

        public Builder setEvent(Event event) {
            Bouquet.this.event = event;
            return this;
        }

        public Builder setFreshness(Freshness freshness) {
            Bouquet.this.freshness = freshness;
            return this;
        }

        public Builder setPrice(Price price) {
            Bouquet.this.price = price;
            return this;
        }

        public Builder setSize(Size size) {
            Bouquet.this.size = size;
            return this;
        }

        public Builder setStemLength(StemLength stemLength) {
            Bouquet.this.stemLength = stemLength;
            return this;
        }

        public Builder setFlowers(Flower flower) {
            Bouquet.this.flowers = new ArrayList<>();
            Bouquet.this.flowers.add(flower);
            return this;
        }

        public Builder setFlowers(ArrayList<Flower> flowers) {
            Bouquet.this.flowers = flowers;
            return this;
        }

        public Builder setBasket(Basket basket) {
            Bouquet.this.basket = basket;
            return this;
        }

        public Builder setRibbon(Ribbon ribbon) {
            Bouquet.this.ribbon = ribbon;
            return this;
        }

        public Builder setWrapper(Wrapper wrapper) {
            Bouquet.this.freshness = freshness;
            return this;
        }

        public Bouquet build() throws IncompleteBouquetInitialization {
            boolean incompleteBouquetInitialization = checkEventForNull() || checkFreshnessForNull()
                    || checkPriceForNull() || checkSizeForNull() || checkStemLengthForNull()
                    || checkFlowersForNull() || checkFlowersForZeroCapacity();
            if (incompleteBouquetInitialization) {
                throw new IncompleteBouquetInitialization();
            }

            return Bouquet.this;
        }

        private boolean checkEventForNull() {
            return Bouquet.this.event == null;
        }

        private boolean checkFreshnessForNull() {
            return Bouquet.this.freshness == null;
        }

        private boolean checkPriceForNull() {
            return Bouquet.this.price == null;
        }

        private boolean checkSizeForNull() {
            return Bouquet.this.size == null;
        }

        private boolean checkStemLengthForNull() {
            return Bouquet.this.stemLength == null;
        }

        private boolean checkFlowersForNull() {
            return Bouquet.this.flowers == null;
        }

        private boolean checkFlowersForZeroCapacity() {
            return Bouquet.this.flowers.size() == 0;
        }
    }

}
