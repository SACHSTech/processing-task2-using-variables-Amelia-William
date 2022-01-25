import processing.core.PApplet;

public class Sketch extends PApplet {

 public void settings() {
size(500, 500);
 }
  
 public void setup() { 
   background(194, 236, 255); 
  }

  public void draw() {
  stroke(89, 207, 106);
  fill(89, 207, 106);
  rect(0, height/2, width, height/2);  
  
  stroke(252, 239, 119);
  fill(252, 239, 119);
  ellipse(width/16, height/16, width/3, height/3);
  
  stroke(173, 112, 66);
  fill(173, 112, 66);
  rect(width/3, height/3, width/3, height/3);

  }
  
}
