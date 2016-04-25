# Java Interview Ques / Practice

A small project (for now), to help others practice the various Java Interview questions I find on the internet.

# String Questions

**Palindrome**
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward. Eg: jaaj or javaj.

Have solved it using:

1. toCharArray
2. Recursion                - One line solution
3. StringBuilder Reverse    - One line solution

**Anagram**
Two strings AA and BB are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".

1. By sorting the both strings and then comparing them. This is a very costly computation. With each sort being O(n logn) 
2. By using a Hash Map to count the frequency of the letters and then comparing.


**Some Tips**
1. When Using Java Collection Framework (eg: HashMap or LinkedList or ArrayList), if you already know the size of the Collection then you should specify it instead of leaving the size as empty.
This is beacuse each time the the Collection is 'filled' up it will be copied onto the memory again, with a increased size. Sometimes this is too much of an overhead, esp if we exceed the size multiple times.

