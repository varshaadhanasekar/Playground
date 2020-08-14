s=input().strip()
#print(s)
st=input().strip()
if len(st)==10 and len(set(st))==10:
    l=s.split('||')
    l1,l2=l[0].split('|'),list(l[-1])
    #print(l1,l2)
    l3=[]
    l4=[]
    for i in range(len(l1)):
        n=len(l1[i])
        t=l1[i]
        if n>1:
            for j in t[:n-1]:
                l3.append(int(j))
                l4.append(int(t[-1]))
    l5=[-1]*len(l4)
    for i in range(len(l4)):
        l5[l3[i]]=l4[i]
  
    for i in l2[:len(l2)-1]:
        j=int(i)
        l5[j]+=10
    
    l6=[int(l2[-1]),]
    for i in range(len(l5)-1):
        l6.append(l5[i]-l6[i])
    
    l7=[]
    for i in l6:
        l7.append(st[i])
    print(''.join(l7))
else:
    print(-1)