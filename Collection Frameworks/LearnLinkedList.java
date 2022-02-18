import java.util.*;
// LinkedList has two interface : 1. List   2. Queue
public class LearnLinkedList {

    public static void queueLinkedList(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(25);
        queue.offer(35);
        queue.offer(15);
        queue.offer(10);
        queue.offer(30);
        System.out.println(queue);  // [25, 35, 15, 10, 30]

        // peak element - ready for remove from queue
        System.out.println(queue.peek());      // 25

        // Remove peak element
        queue.poll();
        System.out.println(queue);  // [35, 15, 10, 30]
    }

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        // Add element in list
        list.add("Animal");
        list.add("Fruits");
        list.add("Human");
        list.add("Birds");
        list.add("Vehicle");
        System.out.println(list); // [Animal, Fruits, Human, Birds, Vehicle]

        // Replace any element of list
        list.set(1, "Mango");
        System.out.println(list);     // [Animal, Mango, Human, Birds, Vehicle]

        // Access of any element from list by index
        System.out.println(list.get(3));        //Birds

        // Add any element in between list
        list.add(2, "Lion");
        System.out.println(list);       // [Animal, Mango, Lion, Human, Birds, Vehicle]

        // Copy a list into another list
        List<String> newList = new ArrayList<>();
        newList.add("Raushan");
        newList.add("Subhash");
        list.addAll(newList);
        System.out.println(list);     // [Animal, Mango, Lion, Human, Birds, Vehicle, Raushan, Subhash]

        // Remove any Element from list
        list.remove(2); // Pass index
        System.out.println(list);       // [Animal, Mango, Human, Birds, Vehicle, Raushan, Subhash]

        // Remove any value from list
        list.remove(String.valueOf("Mango"));
        System.out.println(list);     // [Animal, Human, Birds, Vehicle, Raushan, Subhash]

        // Clear full list
        newList.clear();
        System.out.println(newList); // []

        // Size
        System.out.println(list.size()); // 6

        // Check value is present or not
        System.out.println(list.contains("Subhash"));   // true
        System.out.println(list.contains("Lucifer"));   // false

        // Iterator
        Iterator<String> itList = list.listIterator();

        // check next element present or not
        while (itList.hasNext()){
            System.out.print(itList.next() + "  ");     // Animal  Human  Birds  Vehicle  Raushan  Subhash
        }
        System.out.println();      // Print next line
        // Iteration in ArrayList
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "    "); // Animal    Human    Birds    Vehicle    Raushan    Subhash
        }
        System.out.println();       // Print next line
        for (String str: list) {
            System.out.print(str + "    "); // Animal    Human    Birds    Vehicle    Raushan    Subhash
        }
        System.out.println();       // Print next line
        list.clear();
        System.out.println(list); // []


        // queueLinkedList function call
        queueLinkedList();
    }
}
