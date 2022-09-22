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
/*Delete the node at a given position in a linked list and return a reference to the head node.
The head is at position 0. The list may be empty after you delete the node. In that case, return a null value.*/

SinglyLinkedListNode* deleteNode(SinglyLinkedListNode* llist, int position) {
    SinglyLinkedListNode* auxNode = llist;
    if (position == 0) {
        llist = llist->next;
        return llist;
    }
    for(int i = 0; i < position - 1; i++) {
        auxNode = auxNode->next;
    }
    SinglyLinkedListNode* nodeToDelete = auxNode->next;
    auxNode->next = nodeToDelete->next;
    return llist;
}
}