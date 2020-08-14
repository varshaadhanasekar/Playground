n = int(input())
h = []
cap = []
h = list(int(num) for num in input().strip().split())[:n]
for i in range(n):
    cap.append(i+1)
m = int(input())
res = 0
ctr = 0 
b = []
b = list(int(num) for num in input().strip().split())[:m]
for i in range(m):
    ctr = 0
    for j in range(n-1, -1, -1):
        if(b[i] <= h[j] and cap[j]!=0):
            print(j+1, end = " ")
            cap[j] = cap[j] - 1
            ctr = 1
            break
    if(ctr == 0):
        print("0", end = " ")
		