import math

def Divisors(n):
  l = []
  for i in range(1, int(math.sqrt(n))+1):
    if(n%i==0):
      if(n/i==i):
        print(i, end=" ")
      else:
        print(i, end=" ")
        l.append(int(n/i))
  for i in l[::-1]:
    print(i, end=" ")
    
N = int(input())
Divisors(N)