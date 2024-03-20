package ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem
{
    public FoodItem (int id, String name, float price, Date dateOfIncome, short expires){
        super(id, name, price);
        DateOfIncome = dateOfIncome;
        Expires = expires;
    }
    public FoodItem(String name, float price, FoodItem analog, Date date, short expires){}
    public FoodItem(String name, float price, short expires){
        setName(name);
        setPrice(price);
        Expires = expires;
    }
    public FoodItem(String name){}

    public Date getDateOfIncome() {
        return DateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        DateOfIncome = dateOfIncome;
    }

    public short getExpires() {
        return Expires;
    }

    public void setExpires(short expires) {
        Expires = expires;
    }

    private Date DateOfIncome;
    private short Expires;

    @Override
    void printAll() {
        System.out.printf("ID: %d , Name: %-10s , price: %5.2f, ru.billing.stocklist.Category: %-15s, Date of income: %d , Expires: %d\n" , getID(), getName(), getPrice(), getType(), DateOfIncome, Expires);
    }
}
