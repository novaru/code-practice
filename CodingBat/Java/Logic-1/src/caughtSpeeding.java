public int caughtSpeeding(int speed, boolean isBirthday) {
  int minSpeed = 61;
  int maxSpeed = 80;
  if(isBirthday){
    minSpeed += 5;
    maxSpeed += 5;
  }
  if(speed > maxSpeed) return 2;
  if(speed >= minSpeed && speed <= maxSpeed) return 1;
  return 0;
}
