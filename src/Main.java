public class Main {
    public static void main (String[] args) {
       GenericItem object = new GenericItem(1, "pazan1", 99F);
       GenericItem object1 = new GenericItem(2, "pazan2", 101F);
       GenericItem object2 = new GenericItem(3, "pazan3", 103F);
       FoodItem object3 = new FoodItem(4, "pazan4_food", 10F,
               1212121212121L, (short) 3);
       TechicalItem object4 = new TechicalItem(5, "pazan5_tech", 11F,
               (short)151);

       GenericItem [] mas = {object,object1,object2, object3, object4};

        for (GenericItem item : mas) item.printAll();

        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");
        FoodItem object5 = new FoodItem(item_fld[0],
                Integer.parseInt(item_fld[1]), (short) Integer.parseInt(item_fld[2]));
        object5.printAll();
    }
}