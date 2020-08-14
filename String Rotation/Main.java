def leftrotate(str,d): 
    Lfirst = str[0 : d] 
    Lsecond = str[d :] 
    return Lsecond+Lfirst
def rightrotate(str,d):
    Rfirst = str[0 : len(str)-d] 
    Rsecond = str[len(str)-d : ] 
    return Rsecond + Rfirst
def areAnagram(str1, str2):
    n1 = len(str1)  
    n2 = len(str2)  
    if n1 != n2:  
        return 0 
    str1 = sorted(str1) 
    str2 = sorted(str2) 
    for i in range(0, n1):  
        if str1[i] != str2[i]:  
            return 0
    return 1
    
a=input()
temp=a
n=int(input())
d=[]
r=[]
str=[]
for i in range(n):
    x,y=input().split()
    d.append(x)
    r.append(int(y))
for i in range(n):
    if(d[i]=='L'):
        a=leftrotate(a,r[i])
        str.append(a[0])
    elif(d[i]=='R'):
        a=rightrotate(a,r[i])
        str.append(a[0])
str1=""
for i in str:
    str1+=i
is_true=0
a=temp
for i in range(len(a)-len(str1)+1):
    sub = a[i:len(str1)+i]
    if(areAnagram(str1,sub)):
        is_true=1
        break
if(is_true==1):
    print("YES")
else:
    print("NO")