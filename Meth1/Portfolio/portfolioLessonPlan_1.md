	Standards Covered


###### CT.3 Refine and visualize complex data sets to tell different stories with the same data set

# Intro to arrays Day 1
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

- We will be creating a fortune teller in p5 
- You will make an array for your different fortunes, one for your colors, and another for your the size of text of each fortune
- This will then allow for a random fortune,color and size everytime your press play

Here's an example of what the fortune array should look like
```javascript
var teller = ["He who laughs at himself never runs out of things to laugh at.", "You will die alone and poorly dressed.", "Don’t eat the paper.", "You are not illiterate.", "You have rice in your teeth."]
```

This is what your finished product will look like, refresh your web page to see it change

https://preview.p5js.org/brionnad4/present/oWhOrmWi6

Now that you have your 3 arrays in your p5 sketch, as comments in your code base. Write comments describing how you believe the arrays can provide the random data, if you are not sure use w3 schools or any other online resource to helo you find and idea of how to grab the random fortune data, random color data and the random size data from the three arrays


# Closing
> Students take turns and share their findings 
