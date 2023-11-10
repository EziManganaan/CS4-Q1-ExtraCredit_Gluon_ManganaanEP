import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    earnings = 0;
    itemList = new ArrayList<Item>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }

  public double getEarnings(){
    return earnings;
  }

  public void sellItem(int index){
    if(index < itemList.size() && index >= 0){
      this.earnings += (itemList.get(index).getCost());
      System.out.println("Sale: " + itemList.get(index).getName() + ", " + itemList.get(index).getCost());
    }

    else {
      System.out.println("There are only " + itemList.size() + " items in the store.");
    }
  }

  public void sellItem(String name){
    boolean found = false;
    for(Item i : itemList) {
      if(i.getName().equals(name)) {
        this.earnings += (i.getCost());
        System.out.println("Sale: " + name + ", " + i.getCost()); 
        found = true;
      }
    }

    if(!found) {
      System.out.println("The store doesn't sell this item.");
    }
  }

  public void sellItem(Item i){
    if(itemList.contains(i)) {
      this.earnings += (i.getCost());
      System.out.println("Sale: " + i.getName() + ", " + i.getCost()); 
    }

    else {
      System.out.println("The store doesn't sell this item.");
    }
  }

  public void addItem(Item i){

    itemList.add(i);
  }

  public void filterType(String type){
    System.out.println(type + " Items: ");
    boolean found = false;
    for(Item i : itemList) {
      if(i.getType().equals(type)) {
        System.out.println(i.getName());
        found = true;
      }
    }

    if(!found) {
      System.out.println("There are no available items with this type.");
    }
  }

  public void filterCheap(double maxCost){
    System.out.println("Cheap Items: ");
    for(Item i : itemList) {
      if(i.getCost() <= maxCost) {
        System.out.println(i.getName());
      }
    }
  }

  public void filterExpensive(double minCost){
    System.out.println("Expensive Items: ");
    for(Item i : itemList) {
      if(i.getCost() >= minCost) {
        System.out.println(i.getName());
      }
    }
  }

  public static void printStats(){
    for(Store s : storeList) {
      System.out.println(s.getName() + ": " + s.getEarnings());
    }
  }
}