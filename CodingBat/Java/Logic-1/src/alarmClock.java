public String alarmClock(int day, boolean vacation) {
  String alarm1 = "7:00";
  String alarm2 = "10:00";
  if (vacation)
  {
    alarm1 = "10:00";
    alarm2 = "off";
  }
  if (day == 0 || day == 6) return alarm2;
  return alarm1;
}
