
// JAVA Code for Dynamic Programming | 
// Set 9 (Binomial Coefficient) 
import
java.util.*; 

class
GFG { 


// Returns value of Binomial 

// Coefficient C(n, k) 

static
int
binomialCoeff(
int
n, 
int
k) 

{ 


// Base Cases 

if
(k == 
0
|| k == n) 

return
1
; 


// Recur 

return
binomialCoeff(n - 
1
, k - 
1
) + 

binomialCoeff(n - 
1
, k); 

} 


/* Driver program to test above function */

public
static
void
main(String[] args) 

{ 

int
n = 
5
, k = 
2
; 

System.out.printf(
"Value of C(%d, %d) is %d "
, 

n, k, binomialCoeff(n, k)); 

} 
} 

// This code is contributed by Arnav Kr. Mandal. 