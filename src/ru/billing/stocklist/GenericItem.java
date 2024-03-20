package ru.billing.stocklist;

public class GenericItem {
    public GenericItem (int id, String name, float price){
        ID = GenericItem.CurrentID++;
        Name = name;
        Price = price;;
    }
    public GenericItem(String name, float price, Category category){
        this.ID = GenericItem.CurrentID++;
    }
    public GenericItem(String name, float price, GenericItem analog){
        this.ID = GenericItem.CurrentID++;
    }
    public GenericItem(){
        this.ID = GenericItem.CurrentID++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public Category getType() {
        return Type;
    }

    public void setType(Category type) {
        Type = type;
    }

    public static int getCurrentID() {
        return CurrentID;
    }

    public static void setCurrentID(int currentID) {
        CurrentID = currentID;
    }

    private int ID;
    private String Name;
    private float Price;
    private Category Type = Category.GENERAL;
    private static int CurrentID;
    void printAll(){
        System.out.printf("ID: %d , Name: %-10s , price: %5.2f, ru.billing.stocklist.Category: %-15s\n" , ID, Name, Price, Type);
    }

}
