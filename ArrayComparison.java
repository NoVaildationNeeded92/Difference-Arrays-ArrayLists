import java.util.ArrayList;

public class ArrayComparison
{
    public static void main(String[] args)
    {
        // ARRAY DEMONSTRATION
        // I created a fixed-length array to store my Jordan collection.
        int[] jordanShoes = {1, 3, 4, 12};

        System.out.println("----- ARRAY DEMONSTRATION -----");

        // Retrieving my Jordan 4s using index 2.
        System.out.println("Selected Jordan: " + jordanShoes[2]);

        System.out.println("Total Jordan pairs: " + jordanShoes.length);

        // Arrays start at index 0, so using <= would cause a bounds error.
        for (int i = 0; i < jordanShoes.length; i++)
        {
            System.out.println("Jordan " + jordanShoes[i]);
        }

        // Something happened to my Jordan 12s,
        // so I replaced them with my Jordan 8s.
        jordanShoes[3] = 8;

        System.out.println("Replacement Jordans: " + jordanShoes[3]);
        System.out.println("Total pairs after replacement: " + jordanShoes.length);

        // ARRAYLIST DEMONSTRATION
        // An ArrayList allows my collection to grow and shrink.
        ArrayList<Integer> jordanCollection = new ArrayList<>();

        jordanCollection.add(1);
        jordanCollection.add(3);
        jordanCollection.add(4);
        jordanCollection.add(8);

        System.out.println("\n----- ARRAYLIST DEMONSTRATION -----");
        System.out.println("Original collection: " + jordanCollection);

        // I purchased Jordan 11s without replacing another pair.
        jordanCollection.add(11);

        System.out.println("Collection after buying Jordan 11s: " + jordanCollection);
        System.out.println("ArrayList total pairs: " + jordanCollection.size());
        System.out.println("Array total pairs: " + jordanShoes.length);

        // Retrieving my Jordan 4s using the get() method.
        System.out.println("Selected Jordan: " + jordanCollection.get(2));

        // I decided to sell my Jordan 3s at index 1.
        jordanCollection.remove(1);

        System.out.println("Collection after selling Jordan 3s: " + jordanCollection);
        System.out.println("Total pairs after selling: " + jordanCollection.size());

        // Arrays have a fixed length, while ArrayLists have a dynamic size.
        System.out.println("\nArrays have a fixed length.");
        System.out.println("ArrayLists can grow and shrink.");
    }
}
