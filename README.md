# Anagram-Jumble Solver
It is a fun brain exercise to take a group of scrambled letters and attmept to rearrange them into a word.<br>

Examples:<br>
loehl = hello<br>
prcmoae = compare<br>
uoehs = house<br>

It is intriguing to think how the brain can solve these puzzles. For a computer, hashing seems like the most efficient way to retrieve the solution.  

The class 'CreateHashMap' takes each word of an English dictionary and sorts its characters to use as the Key in the map. A list is created to store the untouched word as the Value. Words with duplicate hashes are simply added to the list. The values are stored in the file 'hashmap' which is read by the next class.

KEY: ehllo -> VAL: [hello]<br>
KEY: adel  -> VAL: [lead,deal,...]<br>

'Anagram' takes an arguement of jumbled letters and sorts the letters to query the mathcing words in the hash map. When run by itself, it returns the solution very quickly. 

The most efficient way to compare two words as being an anagram with each other is to simply sort the words and compare. I used this as the basis for my Anagram algorithm which takes the concept one step further. There are several websites that offer this type of service for games like scrabble, but unfortunately do not have details of their algorithm. 

Utilizing a hash function that simply sorts the letters, the solution can be reached in a in a constant time complexity, in roughly 50 lines of code.<br><br>

To run on the command line:<br>
javac CreateHashMap.java<br>
touch hashmap<br>
java CreateHashMap > hashmap<br>
javac Anagram.java<br>
java Anagram <i>jumbledWord,</i>

   
