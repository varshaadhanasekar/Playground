n = int(input())
a = []
a = [int(i) for i in input().split()][:n]
maxi = 0
x = 0
f = 0
max = 0
for i in range(n-1):
    f = f + 1
    x = x + 1
    if(a[i] > a[i+1]):
        if(f>max):
            max = f;
            maxi = i - f + 1
           
        f = 0
f = f + 1
if(f>max):
    max = f
    maxi = x - f + 1
for i in range(maxi, maxi+max): 
	print(a[i],end=" ")