#include <stdio.h>
#include <stdbool.h>

typedef struct SinglyLinkedListNode SinglyLinkedListNode;
struct SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode* next;
};

/*You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to check if they are equal.
If all data attributes are equal and the lists are the same length, return true. Otherwise, return false.*/

bool compare_lists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {

    while (head1 != NULL && head2 != NULL) {
        if (head1->data != head2->data) {
            return false;
        }
        head1 = head1->next;
        head2 = head2-> next;
    }
    return head1 == NULL && head2 == NULL;
}