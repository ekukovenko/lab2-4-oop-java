import java.util.Locale;

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

    public int ID;
    public String Name;
    public float Price;
    public Category Type = Category.GENERAL;
    static int CurrentID;
    void printAll(){
        System.out.printf("ID: %d , Name: %-10s , price: %5.2f, Category: %-15s\n" , ID, Name, Price, Type);
    }

}
