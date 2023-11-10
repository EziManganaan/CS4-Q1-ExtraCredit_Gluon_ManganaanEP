class Main {
  public static void main(String[] args) {

    Item i1 = new Item("Burger", "Food", 50);
    Item i2 = new Item("Fries", "Food", 30);
    Item i3 = new Item("Fried Chicken", "Food", 70);

    Item i4 = new Item("Shampoo", "Toiletries", 120);
    Item i5 = new Item("Soap", "Toiletries", 65);
    Item i6 = new Item("Toothpaste", "Toiletries", 95);

    Item i7 = new Item("T-shirt", "Clothes", 200);
    Item i8 = new Item("Jeans", "Clothes", 1200);
    Item i9 = new Item("Shoes", "Clothes", 2300);

    Store mcdo = new Store("McDo");
    Store watsons = new Store("Watsons");
    Store mall = new Store("Supermall");

    mcdo.addItem(i1);
    mcdo.addItem(i2);
    mcdo.addItem(i3);

    watsons.addItem(i4);
    watsons.addItem(i5);
    watsons.addItem(i6);

    mall.addItem(i1);
    mall.addItem(i2);
    mall.addItem(i4);
    mall.addItem(i5);
    mall.addItem(i6);
    mall.addItem(i7);
    mall.addItem(i8);
    mall.addItem(i9);

    mall.filterType("Food");
    mall.filterCheap(500);
    mall.filterExpensive(1000);

    mcdo.sellItem(0);
    mcdo.sellItem(50);
    watsons.sellItem("Soap");
    watsons.sellItem("Mouthwash");
    mall.sellItem(i7);
    mall.sellItem(i3);


    Store.printStats();
  }
}