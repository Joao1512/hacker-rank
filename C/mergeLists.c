#include <stdio.h>
#include <stdbool.h>

typedef struct SinglyLinkedListNode SinglyLinkedListNode;
struct SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode* next;
};

/*Given pointers to the heads of two sorted linked lists, merge them into a single, sorted linked list.
Either head pointer may be null meaning that the corresponding list is empty.*/

SinglyLinkedListNode* bubbleSort(SinglyLinkedListNode* head) {
    int switched = true;
    while (switched == true) {
        switched = false;
        SinglyLinkedListNode* auxNode = head;
        while (auxNode->next != NULL) {
            if (auxNode->data > auxNode->next->data) {
                int auxNodeData = auxNode->data;
                auxNode->data = auxNode->next->data;
                auxNode->next->data = auxNodeData;
                switched = true;
            }
            auxNode = auxNode->next;
        }
    }
    return head;
}

SinglyLinkedListNode* mergeLists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {
    if (head1 != NULL && head2 != NULL) {
        SinglyLinkedListNode* auxNode = head1;
        while (auxNode->next != NULL) {
            auxNode = auxNode->next;
        }
        auxNode->next = head2;
    }
    head1 = bubbleSort(head1);
    return head1;
}