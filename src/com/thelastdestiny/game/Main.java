package com.thelastdestiny.game;

import model.*;
import service.GuildBank;
import service.Invoice;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        GuildBank bank = new GuildBank();
        bank.addItem(new HeadPlate("Helm", "Plate", "Warrior", 100));
        bank.addItem(new PantsPlate("Legs", "Plate", "Warrior", 150));
        bank.addItem(new ChestCloth("Chest", "Cloth", "Mage", 200));
        bank.addItem(new WristCloth("Wrist", "Cloth", "Mage", 80));

        Apply buyer = new Apply("Andrey", "andrey@mail.com", "CR", 20, "AndreyGR", "Tank", "Prot", "Soy tank");

        Invoice invoice = new Invoice(buyer, List.of(bank.getItem(0)));
        System.out.println("Total: " + invoice.getTotal());
    }


}
