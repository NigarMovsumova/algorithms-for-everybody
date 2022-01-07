int width = 1000; 
int height = 1000;

void setup() {
  size(1000, 1000);
  background(255, 255, 255);
  
  
}

void draw() {
  String [] arr = new String [] {"a", "b", "c", "d", "e", "f", "g", "..."};
  for (int i = 0; i < arr.length; i++) {
    rect(mouseX, height/10, width/10, height/10);
    fill(0, 0, 255);
    
    textSize(24);
    text(arr[i], i * width/10 + 90, height/10 +50);
    fill(37, 150, 190);
    
    text(i, i * width/10 + 90, height/10 + 150);
  }
  
  
}
