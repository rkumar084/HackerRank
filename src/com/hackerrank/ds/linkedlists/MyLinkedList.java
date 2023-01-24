package com.hackerrank.ds.linkedlists;

import java.util.Scanner;

class MyLinkedList {
    
    private class Node {
        int val;
        Node next;
    }

    private Node head;
    
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        if (index < 0)
            return -1;
        
        if (head == null) {
            return -1;
        }
        int count = 0;
        Node tmp = head;
        while (tmp != null) {
            if (count == index) {
                return tmp.val;
            }
            tmp = tmp.next;
            count++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node node = new Node();
        node.val= val;
        node.next = null;
        if (head == null) {
            head = node;
            return;
        }
        
        node.next = head;
        head = node;
    }
    
    public void addAtTail(int val) {
        Node node = new Node();
        node.val= val;
        node.next = null;
        if (head == null) {
            head = node;
            return;
        } 
        
        Node tmp = head;
        
        while (tmp.next !=null) {
            tmp = tmp.next;    
        }
        
        tmp.next = node;
    }
    
    public void addAtIndex(int index, int val) {
//void addAtIndex(int index, int val) Add a node of value val before the indexth 
//node in the linked list. If index equals the length of the linked list, 
//the node will be appended to the end of the linked list. If index is greater than the length, 
   //the node will not be in        
        int length = 0;
        Node tmp = head;
        while(tmp!=null) {
            tmp=tmp.next;
            length++;
        }
        
        if (length < index) {
            return;
        }
        
        if (length == index) {
        	addAtTail(val);
        	return;
        }
        
        int count = 0;
        tmp = head;
        while (count < index -1) {
            tmp = tmp.next;
            count++;
        }
        Node node = new Node();
        node.val = val;
        node.next = tmp.next;
        tmp.next = node;
    }
    
    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        } 
        if (index == 0) {
            head = head.next;
            return;
        }
        Node beforeNode = head;
        int count = 0;
        while(count < index - 1 && beforeNode != null) {
            beforeNode = beforeNode.next;
            count++;
        }
        
        if (beforeNode == null)
            return ;
        
        beforeNode.next = beforeNode.next.next;
        
       // System.out.println("After delete");
       // printList();
    }
    
    public void printList() {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.val + ", ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	MyLinkedList list = new MyLinkedList();
    	
    	while(true) {
    		System.out.println("1. get \n 2.add at head \n3. add at tail \n4. add at index \n5. delete at index\n 6.exit");
    		int choice = scanner.nextInt();
    		switch(choice) {
    		case 0:
    			list.printList();
    			break;
    		case 1:
    			System.out.println("enter index value to get");
    			System.out.println(list.get(scanner.nextInt()));
    		case 2:	
    			System.out.println("enter value to be added");
    			list.addAtHead(scanner.nextInt());
    			break;
    		case 3:
    			System.out.println("enter value to be added");
    			list.addAtTail(scanner.nextInt());
    			break;    			
    		case 4:
    			System.out.println("Enter index and value");
    			list.addAtIndex(scanner.nextInt(), scanner.nextInt());
    			break;
    		case 5:
    			System.out.println("Enter index to delete");
    			list.deleteAtIndex(scanner.nextInt());
    			break;
    		case 6:
    			System.exit(0);
    		}
    		
    	}
    	
    }
}


