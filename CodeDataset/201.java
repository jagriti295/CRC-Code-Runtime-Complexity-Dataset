
// Java implementation of above approach. 
import
java.util.Stack; 

class
GFG { 

// Function to check if A[] is 
// Stack Sortable or Not. 

static
boolean
check(
int
A[], 
int
N) { 

// Stack S 

Stack<Integer> S = 
new
Stack<Integer>(); 


// Pointer to the end value of array B. 

int
B_end = 
0
; 


// Traversing each element of A[] from starting 

// Checking if there is a valid operation 

// that can be performed. 

for
(
int
i = 
0
; i < N; i++) { 

// If the stack is not empty 

if
(!S.empty()) { 

// Top of the Stack. 

int
top = S.peek(); 


// If the top of the stack is 

// Equal to B_end+1, we will pop it 

// And increment B_end by 1. 

while
(top == B_end + 
1
) { 

// if current top is equal to 

// B_end+1, we will increment 

// B_end to B_end+1 

B_end = B_end + 
1
; 


// Pop the top element. 

S.pop(); 


// If the stack is empty We cannot 

// further perfom this operation. 

// Therefore break 

if
(S.empty()) { 

break
; 

} 


// Current Top 

top = S.peek(); 

} 


// If stack is empty 

// Push the Current element 

if
(S.empty()) { 

S.push(A[i]); 

} 
else
{ 

top = S.peek(); 


// If the Current element of the array A[] 

// if smaller than the top of the stack 

// We can push it in the Stack. 

if
(A[i] < top) { 

S.push(A[i]); 

} 
// Else We cannot sort the array 

// Using any valid operations. 

else
{ 

// Not Stack Sortable 

return
false
; 

} 

} 

} 
else
{ 

// If the stack is empty push the current 

// element in the stack. 

S.push(A[i]); 

} 

} 


// Stack Sortable 

return
true
; 

} 

// Driver's Code 

public
static
void
main(String[] args) { 


int
A[] = {
4
, 
1
, 
2
, 
3
}; 

int
N = A.length; 


if
(check(A, N)) { 

System.out.println(
"YES"
); 

} 
else
{ 

System.out.println(
"NO"
); 

} 


} 
} 
//This code is contributed by PrinciRaj1992 