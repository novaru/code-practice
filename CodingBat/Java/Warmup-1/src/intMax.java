public int intMax(int a, int b, int c) {
  int num[] = new int[3];
  num[0] = a;
  num[1] = b;
  num[2] = c;
  int max = num[0];
  for (int i=0; i<num.length; i++){
    if (num[i] > max){
      max = num[i];
    }
  }
  return max;
}
