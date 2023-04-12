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
/*Given the pointer to the head node of a linked list and an integer to insert at a certain position, create a new node with the given integer as its data attribute, insert this node
at the desired position and return the head node.

A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The head pointer given may be null meaning that the initial list is empty.*/

SinglyLinkedListNode* insertNodeAtPosition(SinglyLinkedListNode* llist, int data, int position) {
    if (llist == NULL) {
        return create_singly_linked_list_node(data);
    }
    else {
        SinglyLinkedListNode* newNode = create_singly_linked_list_node(data);
        SinglyLinkedListNode* auxNode = llist;
        for (int i = 0; i < position - 1; i++) {
            auxNode = auxNode->next;
        }
        newNode->next = auxNode->next;
        auxNode->next = newNode;
        return llist;
    }
}