package service;

import model.Apply;
import model.Sellable;

import java.util.List;

public class Invoice {

    private final Apply buyer;
    private final List<Sellable> items;
    private final int total;


    public Invoice (Apply buyer, List<Sellable> items){

        this.buyer = buyer;
        this.items = items;
        this.total = items.stream().mapToInt(Sellable::getSell).sum();

    }

    public int getTotal() {return total;}

    public List<Sellable> getItems() {return items;}

    public Apply getBuyer() {return buyer;}
}

