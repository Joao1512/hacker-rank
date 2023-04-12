#include <stdio.h>
#include <stdlib.h>

typedef struct SinglyLinkedListNode SinglyLinkedListNode;
typedef struct SinglyLinkedList SinglyLinkedList;

struct SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode* next;
};

SinglyLinkedListNode* create_singly_linked_list_node(int node_data) {
    SinglyLinkedListNode* node = malloc(sizeof(SinglyLinkedListNode));

    node->data = node_data;
    node->next = NULL;

    return node;
}
/*Given a pointer to the head of a linked list, insert a new node before the head. The next value in the new node should point to head and the data value should be replaced with a given value.
Return a reference to the new head of the list. The head pointer given may be null meaning that the initial list is empty.*/

SinglyLinkedListNode* insertNodeAtHead(SinglyLinkedListNode* llist, int data) {
    if (llist == NULL) {
        return create_singly_linked_list_node(data);
    }
    else {
        SinglyLinkedListNode* newNode = create_singly_linked_list_node(data);
        newNode->next = llist;
        llist = newNode;
        return llist;
    }
}