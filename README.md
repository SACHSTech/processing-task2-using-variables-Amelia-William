# Processing Task 2 - Using Variables

## Learning Objectives
In this task, you will learn about:
Using Processing variables like `width` and `height` to make a drawing that is dynamic to changes in size


## Step 1 - Lesson
Acquire the learning objectives by reviewing [this page](https://happycoding.io/tutorials/processing/using-variables)

## Step 2 - Task
Consider your drawing from the previous lesson.  Modify it use the `width` and `height` variables so that it works with any sized window (scales proportionally with changes in width and height)


## Submission
1. Commit and push your code to this repository
2. Take a screenshot of your work and upload it to the Google Classroom assignment post
import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(194, 236, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    stroke(89, 207, 106);
    fill(89, 207, 106);
    rect(0, height/1.5, width/1, height/1);  
    
    stroke(252, 239, 119);
    fill(252, 239, 119);
    ellipse(width/16.7, height/16.7, width/3.3, height/3.3);
    
    stroke(173, 112, 66);
    fill(173, 112, 66);
    rect(width/3.3, height/2, width/3.6, height/3.6);
    
    stroke(61, 27, 3);
    fill(61, 27, 3);
    triangle(width/3.6, height/1.9, width/2.3, height/2.8, width/1.7, height/1.9);  
  }
  
  // define other methods down here.
}
