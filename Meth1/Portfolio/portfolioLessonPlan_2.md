	Standards Covered


###### CT.3 Refine and visualize complex data sets to tell different stories with the same data set

# Intro to arrays Day 2
**Aim:** How can you display random text with random color on the screen by selecting elements from arrays?

**Objective:** SWBAT display random text with random color on the screen by selecting elements from arrays.

**Do now:** What does the floor() function do in p5?

# Mini Lesson

            ** Yesterday **
* We will be creating a fortune teller in p5 
- You will make an array for your different fortunes, one for your colors, and another for your the size of text of each fortune
- This will then allow for a random fortune,color and size everytime your press play *

            **Today **
When adding text to a P5 sketch, use these in function draw:

fill(); //sets text color

textSize(); //sets the text size

text(‘Type your text here.’,10,60);  
//these three values are the text, 
x and y locations of the text

**[Group code along ]**

We are going to need P5 to select a random fortune and store it in a variable.Let’s create a new variable, then set it equal to a random element within each array.

var index; //declare global variable
index    =   fortunes[floor(random(0,fortunes.length))];
*Variable*     *Array*                    *Array length*

This happens in function setup and we must then replace the text you want to display with your variable name.

1. Use a variable to hold the value of a random element in your array. Remember to round the decimal number by using floor(); 

2. Use text(); to display a random fortune on the screen

3. Adjust the text size

-----------------------------------

# Activity
Now that we have done the Fortune teller array together, we now know how to have a random element print from the array

As your independent worktime
> Do the same exact steps for your color array and size array in order for them to effect your fortunes

