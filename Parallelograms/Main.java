def isexist(a,n,v):
    flag=int(0)
    for i in range(0,n):
        if (a[i] == v):
            flag=int(1)
            break
    return flag
n=int(input())
a=[int(item) for item in input().split()]
freq=[]
size=int(0)
for i in range(0,n):
    exist=int(isexist(a,i,a[i]))
    if(exist==0):
        count=int(1)
        for j in range(i+1,n):
            if(a[i]==a[j]):
                count=count+1
        if(count>1):
            freq.append(count)
            size=size+1
prgm=int(0)
for i in range(0,size):
    for j in range(i+1,size):
        n1=freq[i]
        n2=freq[j]
        prgm=prgm+((((n1*(n1-1))/2))*((n2*(n2-1))/2))
print(int(prgm))