package model;

import java.util.ArrayList;
import java.util.List;

public class BootsLeather extends ItemWoW {

    private final List<String> attributes;

    public BootsLeather(String name, String type, String spec, int price) {
        super(name, type, spec, price);

        this.attributes = new ArrayList<>();
        this.attributes.add("Stamina +550");
        this.attributes.add("Armor +250");
        this.attributes.add("Agility +300");
    }

    public List<String > getAttributes() {return attributes;}
}
