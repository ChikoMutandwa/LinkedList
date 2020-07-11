package linkedlistassignment;

import java.util.Scanner;

/**
 *
 * @author chiko
 */
public class LinkedListAssignment {

    public static void main(String[] args) {
        Scanner cm = new Scanner(System.in);    int noValues, num;
        linkedlist list = new linkedlist();
        System.out.println("How many values do you want to enter");
        noValues = cm.nextInt();
        System.out.println("Please insert the values:");
        for (int i = 0; i < noValues; i++) {
            System.out.print("->");
            num = cm.nextInt();
            list.add(num);
        }
        System.out.println("              OUTPUT        ");
        System.out.println("The list is " + list);
        System.out.println("The size of the list is " + list.getSize());
    }
    
}
