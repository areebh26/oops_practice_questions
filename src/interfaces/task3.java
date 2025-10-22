package interfaces;

//Below is a code skeleton for an interface called “Enumeration” and a class called “NameCollection “.
//Enumeration provides an interface to sequentially iterate through some type of collection. In this case,
//the collection will be the class NameCollection that simply stores a collection of names using an array
//        of strings.
//interface Enumeration
//{
//    // return true if a value exists in the next index
//    public boolean hasNext(int index);
//    // returns the next element in the collection as an Object
//    public Object getNext(int index);
//}
////NameCollection implements a collection of names using a simple array.
//class NameCollection
//{
//    String[] names = new String[100];
//}
//Create constructor and abstract methods of interface in the class NameCollection.
//Then write a main method that creates a NamesCollection object with a sample array of strings,
//and then iterates through the enumeration outputting each name using the getNext() method.

import java.util.Arrays;
import java.util.Objects;

interface Enumerate{
    public boolean hasNext(int index);
    public Object getNext(int index);
}
class NameCollection implements Enumerate {
    private String[] names;

    public NameCollection(String[] names) {
        this.names = names;
    }

    public NameCollection() {
        this.names = new String[100];
    }

    @Override
    public boolean hasNext(int index) {
        if (names[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object getNext(int index) {
        String waste = "";
        waste = names[index];
        return waste;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NameCollection that = (NameCollection) o;
        return Objects.deepEquals(names, that.names);
    }


}


public class task3 {
    static void main(String[] args) {
        String[] names = {"abcd", "efgh", " ijkl", null, "qrst", "uvwx", "yz"};
        NameCollection collection = new NameCollection(names);
        for (int i = 0; i < names.length; i++) {
            if (collection.hasNext(i)) {
                System.out.println(collection.getNext(i));
            }
        }
    }
}


