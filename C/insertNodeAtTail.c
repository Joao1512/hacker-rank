#include <stdio.h>
#include <stdlib.h>

typedef struct SinglyLinkedListNode SinglyLinkedListNode;
typedef struct SinglyLinkedList SinglyLinkedList;

struct SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode* next;
};

struct SinglyLinkedList {
    SinglyLinkedListNode* head;
};

SinglyLinkedListNode* create_singly_linked_list_node(int node_data) {
    SinglyLinkedListNode* node = malloc(sizeof(SinglyLinkedListNode));

    node->data = node_data;
    node->next = NULL;

    return node;
}
/*You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer.
Insert this node at the tail of the linked list and
return the head node of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the initial list is empty.*/

SinglyLinkedListNode* insertNodeAtTail(SinglyLinkedListNode* head, int data) {

    if (head == NULL) {
        SinglyLinkedList* list = malloc(sizeof(SinglyLinkedList));
        list->head = create_singly_linked_list_node(data);
        return list->head;
    }
    else {
        SinglyLinkedListNode* newNode = create_singly_linked_list_node(data);
        if (head->next == NULL) {
            head->next = newNode;
            return head;
        }
        else {
            SinglyLinkedListNode* auxNode = head;
            while (auxNode->next != NULL) {
                auxNode = auxNode->next;
            }
            auxNode->next = newNode;
            return head;
        }
    }
}