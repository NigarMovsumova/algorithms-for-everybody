PImage webImg;


void setup() {
  
  size(1000, 1000);
  background(255, 255, 255);
  textSize(24);
  //black_horse = loadImage("/Users/nigar/Downloads/black_horse.jpeg");
  String url = "https://processing.org/img/processing-web.png";
  webImg = loadImage(url, "png");
}

void draw() {
  Character [] alphabet = new Character[] {'a', 'b', 'c', 'd', 'e', 'f'};
    image(webImg, 0, 0);

  
  for (int i = 0; i < alphabet.length; i++) {
    stroke(236, 180, 240);
    strokeWeight(4);
    fill(236, 200, 240);
    rect(i * width /10 + 200, height/2, 100, 100);
    
    fill(0, 0, 0);
    text(alphabet[i], i * width/10 + 250, height / 2 +50);
  }
  
  text('b', width/4 + 40, height / 3 + 100);
}
