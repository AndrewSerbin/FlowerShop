package ua.com.andrewserbin.model.entity.boquet.util;

/**
 * Created by layer on 26.07.2017.
 */
public class IncompleteBouquetInitialization extends Exception {

    public IncompleteBouquetInitialization() {

    }

    public IncompleteBouquetInitialization(String message) {
        super(message);
    }
}
