package model;

import java.util.ArrayList;
import java.util.List;


public class Product {
    private String name;
    private int price;
    private int id;
    private ArrayList<Feature> features; // List to store product features

    private static int count = 0;

    public Product() {
        count++;
        id = count;
        features = new ArrayList<>(); // Initialize the list of features
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Getter for the list of features
    public List<Feature> getFeatures() {
        return features;
    }

    // Method to add a new feature
    public Feature addNewFeature() {
        Feature newFeature = new Feature(this);
        features.add(newFeature);
        return newFeature;
    }

    @Override
    public String toString() {
        return name;
    }
}
