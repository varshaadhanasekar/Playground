size, R = [int(x) for x in input().split()]   
sample = [int(x) for x in input().split()]   
c=0
for it in range(R):
  Range = [int(x) for x in input().split()]
  j=0
  c=0
  while(j<size):
    if((sample[j]>=Range[0]) and (sample[j]<=Range[1])):
      c = c+1
    j=j+1
  print(c, end=" ")