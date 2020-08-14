n=m=i=j=p=q=max_num=0
cnt=0
k=1
c=0
u=1
t1=min_num=0
e=f=ct=count=t2=t=0
#array declare and initialize with zero
g = [ [ 0 for i in range(50) ] for j in range(50) ]
x = [ 0 for i in range(50) ]
y = [ 0 for i in range(50) ]
sc = [ 0 for i in range(50) ]
a = [ 0 for i in range(50) ]
n,m = input().split()
n = int(n)
m = int(m)
arr = []
for i in range(n):
    arr.append(list(input().split()))
for i in range(1,n+1):
    for j in range(1,m+1):
        g[i][j]  = int(arr[i-1][j-1])
for i in range(1,n+1):
    for j in range(1,m+1):
        cnt = 0
        if(g[i][j]==1):
            t = t + 1
            for p in range(i-1,i+1+1):
                for q in range(j-1,j+1+1):
                    if(g[p][q]==1):
                        cnt = cnt + 1
            cnt= cnt - 1
            a[k]= cnt
            k = k + 1
for k in range(1,t+1):
    if(a[k] > max_num):
        max_num = a[k]

        
if(g[1][1] == 1):
    if(g[2][2] == 1 and g[1][2] == 1 and g[2][1] == 1 ):
        max_num = max_num - 1
    if(n == 2 and m == 2 and (g[2][2] == 1 or g[1][2] == 1 or g[2][1] == 1)):
        max_num = max_num - 1
    for n, i in enumerate(a):
        if i == max_num+1:
            a[n] = max_num
if(max_num == 0):
    print("No Suitable girl found")
else:
    for k in range(1,t+1):
        if(a[k]==max_num):
            c = c + 1
    for k in range(1,t+1):
        t2=0
        if(a[k]==max_num):
            for i in range(1,n+1):
                for j in range(1,m+1):
                    if(g[i][j]==1):
                        t2 = t2 + 1
                    if(t2 == k):
                        x[u]=i
                        y[u]=j
                        u = u + 1
    t1=u-1
    if(c==1):
        print(str(x[1])+":"+str(y[1])+":"+str(max_num))
    else:
        for u in range(1,t1+1):
            e=x[u]-1
            f=y[u]-1
            if(e>=f):
                sc[u]=e
            else:
                sc[u] = f
        min_num=sc[1]
        for u in range(1,t1+1):
            if(sc[u] < min_num):
                min_num = sc[u]
        for u in range(1,t1+1):
            if(sc[u] == min_num):
                count = count + 1
        if(count > 1):
            print("Polygamy not allowed")
        if(count==1):
            for u in range(1,t1+1):
                if(sc[u]==min_num):
                    print(str(x[u])+":"+str(y[u])+":"+str(max_num))
