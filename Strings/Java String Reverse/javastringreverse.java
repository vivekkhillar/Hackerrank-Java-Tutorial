/*

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.

Sample Input

madam

Sample Output

Yes

*/

import java.io.*;
import java.util.*;

public class javastringreverse {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String a = A.toLowerCase(); /* Here i converted the string to lower case because if any one enter the string first character is captial and rest are lower then there is a chance of code return the string ia not plaindrom. So if you don't wnat you can remove this also and change the code acordingly */
        String B = new StringBuilder(a).reverse().toString();
        System.out.println(B);
        System.out.println(a.equals(B)? "Yes" : "No");
    }
}