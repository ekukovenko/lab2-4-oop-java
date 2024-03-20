package ru.billing.stocklist;

public class TechicalItem extends GenericItem {
    public TechicalItem(int id, String name, float price, short warrantyTime){
        super(id, name, price);
        WarrantyTime = warrantyTime;
    }
    private short WarrantyTime;

    @Override
    void printAll() {
        System.out.printf("ID: %d , Name: %-10s , price: %5.2f, ru.billing.stocklist.Category: %-15s, Warranty time: %d\n" , getID(), getName(),
                getPrice(), getType(), WarrantyTime);
    }
}
