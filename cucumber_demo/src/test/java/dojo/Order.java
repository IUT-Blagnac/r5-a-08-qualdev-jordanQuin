package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String owner;
    private String target;
    private List<String> cocktails;

    public Order() {
        cocktails = new ArrayList<>();
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public List<String> getCocktails() {
        return cocktails;
    }

    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void addCocktail(String cocktail) {
        cocktails.add(cocktail);
    }

    public String getOwner() {
        return owner;
    }

    public String getTarget() {
        return target;
    }
}
