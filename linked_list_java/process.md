##Doubly Linked List
So to implement a doubly linked list, we first need to create a doublylinkedlist class. The attributes of this DoublyLinkedList are a head, a tail and a length.

Then we need to create a class node that will keep the data we need and have the link to the next and previous Node

In this node we need 3 attributes, one data, one next and one previous as well as one constructor that initialize the data

In the DoublyLinkedList, we have a constructor which will initialize the head, tail and length. The head and tail will point to null and the length will be  zero.

We as well can have method such as isEmpty (if lentgh is 0) or length() that returns the length of the linkedlist.