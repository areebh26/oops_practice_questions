package interfaces;

//Below is the skeleton for a class named “InventoryItem” . Each inventory item has a name and a
//unique ID number:
//class InventoryItem
//{
//    private String name;
//    private int uniqueItemID;
//}
//76Flesh out the class with appropriate accessors, constructors, and mutatators. This class will implement
//        the following interface:
//Public interface compare
//{
//    boolean compareObjects(Object o);
//}

interface compare {
    boolean compareObjects(Object o);
}
class InventoryItem implements compare {
    private String name;
    private int uniqueItemID;

    public InventoryItem(String name, int uniqueItemID) {
        this.name = name;
        this.uniqueItemID = uniqueItemID;
    }
    public InventoryItem() {
        this.name = "ball";
        this.uniqueItemID = 4453;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniqueItemID() {
        return uniqueItemID;
    }

    public void setUniqueItemID(int uniqueItemID) {
        this.uniqueItemID = uniqueItemID;
    }


    @Override
    public boolean compareObjects(Object o) {
        InventoryItem item = (InventoryItem) o;
        if(this.uniqueItemID==item.uniqueItemID){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "InventoryItem : " +
                "\nname : " + name +
                "\nuniqueItemID : " + uniqueItemID;
    }
}
public class task2 {
    static void main(String[] args) {
        InventoryItem item1 = new InventoryItem();
        InventoryItem item2 = new InventoryItem("register" , 3498);
        System.out.println(item1.toString());
        System.out.println();
        System.out.println();
        System.out.println(item2.toString());
        System.out.println("Are both objects same ? " + item1.compareObjects(item2));
    }
}
