public class TechicalItem extends GenericItem {
    public TechicalItem(int id, String name, float price, short warrantyTime){
        super(id, name, price);
        WarrantyTime = warrantyTime;
    }
    short WarrantyTime;

    @Override
    void printAll() {
        System.out.printf("ID: %d , Name: %-10s , price: %5.2f, Category: %-15s, Warranty time: %d\n" , ID, Name, Price, Type, WarrantyTime);
    }
}
