#include <stdio.h>

typedef struct SinglyLinkedListNode SinglyLinkedListNode;
struct SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode* next;
};

/*Given a pointer to the head of a singly-linked list, print each data value from the reversed list.
If the given list is empty, do not print anything.*/

void reversePrint(SinglyLinkedListNode* llist) {
    if (llist != NULL) {
        reversePrint(llist->next);
        printf("%i \n", llist->data);
    }
}