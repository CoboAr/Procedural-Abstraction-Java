# Procedural Abstraction

Designed and implemented procedures, based on their given specifications.


## How does it work?

The specification for a procedural abstraction contains:       

(a) Requires: This clause states any constraints under which the procedure will work.           
This is an optional clause.     

(b) Modifies: This clause lists the names of any inputs that are modified by the procedure.      
This is an optional clause.      

(c) Effects: This clause describes the behaviour of the procedure for all inputs that are    
not ruled out by the Requires clause.        

<ul>
<li>Exercise 1: Implementation of reverseFactorial procedure</li>      

  
A procedure named reverseFactorial takes one integer parameter x. When x is a positive integer, this procedure should return the smallest positive integer n for which n! (i.e. 1*2*3*…*n) is greater than or equal to x. For example: reverseFactorial(24) should return 4 since (1*2*3*4) = 24 but (1*2*3) < 24; reverseFactorial(119) should return 5 since (1*2*3*4*5) > 119 but (1*2*3*4) < 119.       
  

//Requires: None              
//Modifies: None        
//Effects: Returns the smallest positive integer n for which n!          
// (i.e. 1*2*3*…*n) is greater than or equal to x, for positive          
// integer x. Otherwise returns 1.      

public static int reverseFactorial(int x) {     
//write the code here    
}

<img width="1010" alt="Screenshot 2024-01-17 at 3 02 12 AM" src="https://github.com/CoboAr/Procedural-Abstraction-Java/assets/144629565/ee526f37-b037-414c-9f43-905c5c89ec40">
<img width="1382" alt="Screenshot 2024-01-17 at 2 48 43 AM" src="https://github.com/CoboAr/Procedural-Abstraction-Java/assets/144629565/78c900ce-9541-4a3f-9c0b-e75d3ebed094">


<li>Exercise 2: Implementation for isMatrixNice procedure</li>
Design and implement a procedure named isMatrixNice. A matrix is called Nice matrix if it satisfies the following properties:      

• The matrix is a square matrix. For example 2x2 or 3x3. And,       
• The sum of the integers in each row, each column and both the diagonals are same.    

For example, 276951438 is a Nice matrix. However, −3104−347−90 is not a Nice matrix.              
The procedure isMatrixNice should take a matrix (i.e. a two-dimensional array) of integers, arr, as its only parameter. If arr is a Nice matrix, the procedure should print the sum and return true. Otherwise returns false.         


//Requires: None      
//Modifies: None             
//Effects: If the matrix arr satisfies Nice property, prints the sum and         
// returns true. Otherwise returns false.      

public static boolean isMatrixNice(int[][] arr) {         
//write the code here         
}        

<img width="1015" alt="Screenshot 2024-01-17 at 3 01 23 AM" src="https://github.com/CoboAr/Procedural-Abstraction-Java/assets/144629565/92228221-d22d-447c-9b07-f9d87558ccf5">
<img width="1400" alt="Screenshot 2024-01-17 at 2 57 59 AM" src="https://github.com/CoboAr/Procedural-Abstraction-Java/assets/144629565/2d3ae936-eab9-4388-9021-d0cbdb34e82c">

</ul>

Enjoy! And please do let me know if you have any comments, constructive criticism, and/or bug reports.
## Author
## Arnold Cobo
