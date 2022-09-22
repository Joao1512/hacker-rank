#include <stdio.h>

typedef struct SinglyLinkedListNode SinglyLinkedListNode;
struct SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode* next;
};
/*This is an to practice traversing a linked list. Given a pointer to the head node of a linked list,
print each node's data element, one per line. If the head pointer is null (indicating the list is empty), there is nothing to print.*/

void printLinkedList(SinglyLinkedListNode* head) {
    SinglyLinkedListNode* auxElement = head;
    while (auxElement != NULL) {
        printf("%i \n", auxElement->data);
        auxElement = auxElement->next;
    }
}