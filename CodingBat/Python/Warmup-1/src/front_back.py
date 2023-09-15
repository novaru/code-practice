def front_back(str):
  if len(str) <= 1:
    return str
  center = str[1:-1]
  return str[len(str)-1] + center + str[0]
