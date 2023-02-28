## Link of the tutorial

Here is the tutorial link: https://www.youtube.com/watch?v=rUP7SVIiRac

## Process

So the first thing to do is to create our Node class.

Then we will add the private attribute which are 1) the value, here it is an integer but in general we can use anyhting, then a next node and a previous node.

We will then create a coinstructor where we set up the value and the previous and next node.

Then our getter and setters.

After that we will create another class called "Doybly Linked List"

The attribute of this class should be a node header, a node trailer and a size.

The constructor for this class will create the header with only null or empty value, same for trailer. It will also use one of the setters we initialized (setNext) to link the header to the trailer.

After that we can initialize the getSize method which will return the size of the Linked List. The the isEmpty() method that check if the size is 0 or not. Then the first methiod which returns the value of the first node (header.getNext().getValue())

We do the same with the last node (trailer.getPrev().getValue())

Then we will create the methods addFirst and addLast. In everytime in a Linked list, we add between 2 nodes, so when we insert one of these
between the head and the first (head and head.getNext()) and the tail and the previous (trailer.getPrev(), trailer)

The addBetween function consists in adding a node between two nodes. To do so, we have a function that takes a value, a node for the next, a node the previous. Inside, we initialize a new node using all the parameters the function takes. Then we use the setNext() of the predecessor to point to the new node and we use the setPrev() of the successor to point to the new node. After that we increment the size of it.

After that we need to implement remove first and remove last. The idea is to again, check if the linked list is empty. If not, we use the remove function (not implemented yet) to remove the point from the header. The same for the tail but by removing the point to the previous.

Then we need to implement the remove method that returns an integer (or in general the data). The idea of this method is to remove a node. So we take a node as argument. We create two new node that will point to the previous of the node and the next of the node. 
Then we make them reference each other and we decrease the size, then we return the value of the node.

Then after we need to print the whole list. To do so we need to implement a printlist method that returns nothing but print inside the method. To do so first we check if it's empty. If not, we traverse the list up until we reach the trailer. First we create a new node that points the header, then we iterate until we reach the trailer. Everytime of course we print out the value and mostly we take the next node.