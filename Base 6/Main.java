def base6(p):
    p=int(p)
    s=0
    while(p>0):
        q=p%6
        s+=q
        p=p//6
    return int(s)
a=[]
b=[]
n=int(input())
if n<=50:
    a=list(input().split(" "))
for i in range(0,n):
    res=base6(a[i])
    b.append(res)
count=0
for i in range(0,n):
    for j in range(i+1,n):
        if i<j and b[i]>b[j]:
            count+=1
print(count)