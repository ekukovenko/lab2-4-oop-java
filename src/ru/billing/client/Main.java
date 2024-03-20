package ru.billing.client;


import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;
import ru.billing.stocklist.TechicalItem;

import java.util.Date;
public class Main {
    public static void main (String[] args) {
       GenericItem object = new GenericItem(1, "pazan1", 99F);
       GenericItem object1 = new GenericItem(2, "pazan2", 101F);
       GenericItem object2 = new GenericItem(3, "pazan3", 103F);
       FoodItem object3 = new FoodItem(4, "pazan4_food", 10F, null, (short) 3);
       TechicalItem object4 = new TechicalItem(5, "pazan5_tech", 11F,
               (short)151);

       GenericItem[] mas = {object,object1,object2, object3, object4};

        //for (ru.billing.stocklist.GenericItem item : mas) item.printAll();

        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");
        FoodItem object5 = new FoodItem(item_fld[0],
                Integer.parseInt(item_fld[1]), (short) Integer.parseInt(item_fld[2]));
        //object5.printAll();
//
        ItemCatalog cat = new ItemCatalog(); // 4.1
        cat.addItem(object);
        cat.addItem(object1);
        cat.addItem(object2);
        cat.addItem(object3);
        cat.addItem(object4);
        cat.addItem(object5);
        long begin = new Date().getTime();

        for(int i=0; i<100000;i++)
            cat.findItemByID(6);
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end-begin)); begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            cat.findItemByIDAL(6);
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end-begin));

        CatalogLoader loader = new CatalogStubLoader(); // 4.2
        loader.load(cat);

    }
}