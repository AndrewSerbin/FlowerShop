package ua.com.andrewserbin.model.entity.boquet;

import ua.com.andrewserbin.model.entity.accessory.Basket;
import ua.com.andrewserbin.model.entity.accessory.Ribbon;
import ua.com.andrewserbin.model.entity.accessory.Wrapper;
import ua.com.andrewserbin.model.entity.plant.Flower;

import java.util.ArrayList;

/**
 * Created by layer on 26.07.2017.
 */
public class Boquet {

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
        return new Boquet().new Builder();
    }

    public class Builder {

        public Builder setEvent(Event event) {
            Boquet.this.event = event;
            return this;
        }

        public Builder setFreshness(Freshness freshness) {
            Boquet.this.freshness = freshness;
            return this;
        }

        public Builder setPrice(Price price) {
            Boquet.this.price = price;
            return this;
        }

        public Builder setSize(Size size) {
            Boquet.this.size = size;
            return this;
        }

        public Builder setStemLength(StemLength stemLength) {
            Boquet.this.stemLength = stemLength;
            return this;
        }

        public Builder setFlowers(Flower flower) {
            Boquet.this.flowers = new ArrayList<>();
            Boquet.this.flowers.add(flower);
            return this;
        }

        public Builder setFlowers(ArrayList<Flower> flowers) {
            Boquet.this.flowers = flowers;
            return this;
        }

        public Builder setBasket(Basket basket) {
            Boquet.this.basket = basket;
            return this;
        }

        public Builder setRibbon(Ribbon ribbon) {
            Boquet.this.ribbon = ribbon;
            return this;
        }

        public Builder setWrapper(Wrapper wrapper) {
            Boquet.this.freshness = freshness;
            return this;
        }

        public Boquet build() {
            return Boquet.this;
        }
    }

}
