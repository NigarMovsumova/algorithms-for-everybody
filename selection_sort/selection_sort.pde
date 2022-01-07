color sortedColor, unsortedColor, textColor, focusColor, swapColor;
int [] numbers, colors;


void setup () {
  size(1000, 1000);
  textSize(24);
  sortedColor = color(0, 255, 0);
  unsortedColor = color(255, 0, 0);
  textColor = color(0, 0, 0);
  focusColor = color(216, 200, 240);
  numbers = new int [] {5, 4, 3, 2, 1};
  colors = createColorsArray(numbers.length);
}

int [] createColorsArray(int length) {
  colors = new int [numbers.length];
  for (int i = 0; i < colors.length; i++) {
    colors[i] = unsortedColor;
  }
  return colors;
}


int findMinElementIndex(int [] numbers, int lowerLimit) {
  int min = numbers [lowerLimit];
  int minElementIndex = lowerLimit;
  for (int i = lowerLimit + 1; i < numbers.length; i++) {
    if (numbers[i] < min) {
      min = numbers[i];
      minElementIndex = i;
    }
  }
  return minElementIndex;
}


void swapElements(int [] numbers, int leftIndex, int rightIndex) {
  int temp = numbers[leftIndex];
  numbers[leftIndex] = numbers[rightIndex];
  numbers[rightIndex] = temp;
}

int [] sortNumbers(int [] numbers) {
  for (int i = 0; i < numbers.length; i++) {
    int minIndex = findMinElementIndex(numbers, i);
    swapElements(numbers, i, minIndex);
  }

  return numbers;
}

int j = 0;

void keyPressed() {
  if (j >= numbers.length) return;

  int minIndex = findMinElementIndex(numbers, j);
  println("min element index = ", minIndex, "min element = ", numbers[minIndex]);
  
  colors[minIndex] = focusColor;
  swapElements(numbers, j, minIndex);
  colors[j] = sortedColor;
  j++;
}

void draw() {
  background(255, 255, 255);
  for (int i = 0; i < numbers.length; i++) {
    fill(colors[i]);
    rect((i + 1) * width/10, height/2, width/10, -1*numbers[i] * height/30);
    fill(textColor);
    text(numbers[i], (i+1) * width/10 + width/20, height/5.2);
    text(i, (i+1) * width/10 + width/20, height/4.4);
  }
}
