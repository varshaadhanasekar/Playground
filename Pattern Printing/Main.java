num = int(input())
star = 0
lterm = 1
rterm = num * num + 1
for i in range(num,0,-1):
    for space in range(1,star+1):
        print("*",sep="",end="")
    star = star + 2
    for j in range(1,i+1):
        print(lterm,"0",sep="",end="")
        lterm = lterm+1
    for j in range(1,i+1):
        print(rterm,sep="",end="")
        if (j < i) :
            print("0",end="")
        rterm=rterm+1
    rterm = rterm - (i - 1) * 2 - 1
    print()