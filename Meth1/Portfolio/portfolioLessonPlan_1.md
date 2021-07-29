	Standards Covered
IC	1,2,3,4
CT	4,9,10
DL	1,2,3,4,5,6,7

###### CT.3 Refine and visualize complex data sets to tell different stories with the same data set

# Intro to arrays
**Aim:** How can arrays be used instead of multiple variables?

**Objective:** SWBAT use arrays in place of multiple variables?


**Do now :** Unplugged activity - Take one of these post it notes, when i say you can: write a list of anything that interest you. It can be shoes, video games, music, etc.I I want you to number that list in order.You must follow this syntax in order to write your list

myFavsports = ["Basketball","Track","Football","Tennis","Football"];

# Mini Lesson
    
After 3 mins:Have a few students share out their list, choose 1 and grab thir post-it note. Type the code into your text editor
It may be something like:

*bestTiktokers = ["Adin Ross","lorengray","babyariel","jiffpom"]*

Explain to students the term bestTikTokers in this code statement is a variable storing data, this list is whats known as an array and can store different data types strings, integers and more.

Each term in the array is at a specific index 
but unlike most list our arrays do start at 1 when we number them they actuallt start at 0, so us counting in our array is really like this

bestTiktokers = ["Adin Ross","lorengray","babyariel","jiffpom"]
                     [0]         [1]        [2]         [3]

these numbers at the bottom are know an the array index and you can use this information to do something  to the item of you array

For example If I want to print the item at bestTiktokers[2] it would print babyariel

-----------------------------

# Activity

We will be creating a traffic light in p5 
You must create an array of colors for your traffic light
Create a ‘stop light’ using shapes.
Add fill by selecting specific colors within your array.
fill(colors[ ]);
