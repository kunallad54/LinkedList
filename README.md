# LinkedList

## USECASES :
1. Created a simple Linked List of 56, 30 and 70
2. Ability to create Linked List by adding 30 and 56 to 70
   - Node with data 70 is First Created
   - Next 30 is added to 70
   - Finally 56 is added to 30
   - LinkedList Sequence: 56->30->70
3. Ability to create Linked List by appending 30 and 70 to 56
   - Node with data 56 is First Created
   - Next Append 30 to 56
   - Finally Append 70 to 30
   - LinkedList Sequence: 56->30->70
4. Ability to insert 30 between 56 and 70
   - Final Sequence: 56->30->70
5. Ability to delete the first element in the LinkedList
   of sequence 56->30->70 - Write pop method
   - Note there is new head
   - Final Sequence: 30->70
6. Ability to delete the last element 
   in the LinkedList of sequence 56->30->70
   - Write popLast method
   - Note there is new tail
   - Final Sequence: 56->30
7. Ability to search LinkedList to find Node with value 3
   - Loop through LinkedList to find node with key 30
8. Ability to insert 40 after 30 to the Linked List sequence of 56->30->70
   - Search LinkedList to get Node with key value 30
   - Then Insert 40 to 30
   - Final Sequence: 56->30->40->70
9. Ability to delete 40 from the Linked List sequence of 56->30->40->70
   and show the size of LinkedList is 3
   - Search LinkedList to find node with key value 40
   - Delete the node
   - Implement size() and show the Linked List size is 3
   - Final Sequence: 56->30->70
10. Ability to create Ordered Linked List in ascending order of data entered
    in following sequence 56, 30, 40, and 70
   - Refactor the code to create SortedLinkedList Class
   - Create Node that takes data that is Comparable
   - Perform Sorting during the add method call
   - Final Sequence: 30->40->56->70
