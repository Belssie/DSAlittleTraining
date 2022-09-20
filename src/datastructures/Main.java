package datastructures;

import java.util.Arrays;

import static algorithms.sorts.QuickSort.quickSort;

public class Main {

    public static void printItems(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                    System.out.println(i + " " + j);
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
    }

    public static void printItems (int a, int b){
        for (int i = 0; i < a; i++){
            System.out.println(i);
        }

        for (int j = 0; j < b; j++){
            System.out.println(j);
        }
    }

    public static int addItems (int n){
        return n + n + n;
    }

    public static void main(String[] args) {
       /* HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        map1.put("value", 22);

        System.out.println(map1);
        System.out.println(map2);

        int num1 = 11;
        int num2 = num1;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        addItems(10);

        Cookie cookieOne = new Cookie("green");

        Cookie cookieTwo = new Cookie("blue");

        System.out.println(cookieOne.getColor());

        System.out.println(cookieTwo.getColor());

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();


        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.reverse();

        myLinkedList.printList();

        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);

myDLL.remove(1);

        myDLL.printList();

        Stack myStack = new Stack (7);
        myStack.push(23);
        myStack.push(3);
        myStack.push(11);

        myStack.pop();

        myStack.printStack();

        Queue myQueue = new Queue(2);


        myQueue.enqueue(1);

        System.out.println(myQueue.dequue().value);
        System.out.println(myQueue.dequue().value);
        System.out.println(myQueue.dequue());




        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println(myBST.contains(27));
        System.out.println(myBST.contains(17));



        HashTable myHashTable = new HashTable();

        myHashTable.set("pain", 20);
        myHashTable.set("bolts", 40);
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);


        System.out.println( myHashTable.keys() );

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");

        myGraph.removeVertex("D");

        myGraph.printGraph();

        int [] myArray = {4,2,6,5,1,3};

        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));

        int[] myArray = {4,2,6,5,1,3};

        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));

        int[] myArray = {4,2,6,5,1,3};
        insertionSort(myArray);

        System.out.println(Arrays.toString(myArray));

        int[] myArray = {3,1,4,2};

        System.out.println(Arrays.toString(mergeSort(myArray)));



        int[] myArray = {4,6,1,7,3,2,5};


        quickSort(myArray);

        System.out.println(Arrays.toString(myArray)); */
    }
}
