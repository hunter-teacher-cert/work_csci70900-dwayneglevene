	Standards Covered


###### CT.3 Refine and visualize complex data sets to tell different stories with the same data set

# Intro to arrays Day 2
**Aim:** How can you display random text with random color on the screen by selecting elements from arrays?

**Objective:** SWBAT display random text with random color on the screen by selecting elements from arrays.

**Do now:** What does the floor() function do in p5?

# Mini Lesson
When adding text to a P5 sketch, use these in function draw:

fill(); //sets text color

textSize(); //sets the text size

text(‘Type your text here.’,10,60);  
//these three values are the text, 
x and y locations of the text

[Groups code along ]

We are going to need P5 to select a random fortune and store it in a variable.
Let’s create a new variable, then set it equal to a random element within each array.

var index; //declare global variable
index=fortunes[floor(random(0,fortunes.length))];

This happens in function setup. Then replace the text you want to display with your variable name.

1. Use a variable to hold the value of a random element in your array. Remember to round the decimal number by using floor(); 


2. Use text(); to display a random fortune on the screen

3. Adjust the text size

# Activity
Open your Fortune Teller.

Within your same sketch, declare an array of colors. Add at least five elements in this array.

For our fortune teller, we are going to need P5 to select a random fortune and a random text color.
Let’s create a new variable, then set it equal to a random element within the color array.

To begin your random fortune teller:

1. Use a variable to hold the value of a random element in your array. Remember to round the decimal number by using floor(); 


2.  Use text(); to display a random fortune on the screen

3. Adjust the text size
