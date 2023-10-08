//        1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.

        // Product -> HotDrink -> HotTea, HotCoffee, HotChocolate

//        2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
//          и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
//          выдающий продукт соответствующий имени, объёму и температуре

//        3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
//          и воспроизвести логику, заложенную в программе

//        4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

package task_1;

public class Main {
    public static void main(String[] args) {
        HotDrink hotTeaSmall = new HotTea("Lemon Tea", 99, 180, 80);
        HotDrink hotCoffeeMedium = new HotCoffee("Cappucino", 149, 250, 75);
        HotDrink hotChocolateLarge = new HotChocolate("MacChocolate", 199, 380, 70);

        VendingMachine hotDrinksVending = new HotDrinksVendingMachine();

        hotDrinksVending.addProduct(hotTeaSmall);
        hotDrinksVending.addProduct(hotCoffeeMedium);
        hotDrinksVending.addProduct(hotChocolateLarge);

        System.out.println(hotDrinksVending.getProduct("Lemon Tea"));
        System.out.println(hotDrinksVending.getProduct("Cappucino"));
        System.out.println(hotDrinksVending.getProduct("MacChocolate"));
    }
}
