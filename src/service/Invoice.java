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

    public int getTotalWithDiscount(String rank) {
        return switch (rank) {
            case "Core Raider" -> total * 80 / 100; // 20% off
            case "Raider" -> total * 90 / 100;      // 10% off
            case "Member" -> total * 95 / 100;     // 5% off
            default -> total;
        };
    }

    public int getTotal() {return total;}

    public List<Sellable> getItems() {return items;}

    public Apply getBuyer() {return buyer;}

}


