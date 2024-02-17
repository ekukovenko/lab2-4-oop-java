import java.util.Date;

public class FoodItem extends GenericItem
{
    public FoodItem (int id, String name, float price, long dateOfIncome, short expires){
        super(id, name, price);
        DateOfIncome = dateOfIncome;
        Expires = expires;
    }
    public FoodItem(String name, float price, FoodItem analog, Date date, short expires){}
    public FoodItem(String name, float price, short expires){
        Name = name;
        Price = price;
        Expires = expires;
    }
    public FoodItem(String name){}

    long DateOfIncome;
    short Expires;

    @Override
    void printAll() {
        System.out.printf("ID: %d , Name: %-10s , price: %5.2f, Category: %-15s, Date of income: %d , Expires: %d\n" , ID, Name, Price, Type, DateOfIncome, Expires);
    }
}
