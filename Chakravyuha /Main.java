number = int(input())

n = 1
start = 0
end = number-1

c = [[0 for x in range (number)] for y in range (number)]

p = list()
p.append((0,0))

for i in range(int((number+1)/2)):
    for j in range (start,end+1):
        c[start][j]=n
        if (n%11==0):
            p.append((start,j))
        n=n+1
    for j in range (start+1,end+1):
        c[j][end]=n
        if (n%11==0):
            p.append((j,end))
        n=n+1
    for j in range (end-1,start-1,-1):
        c[end][j]=n
        if (n%11==0):
            p.append((end,j))
        n=n+1
    for j in range (end-1,start,-1):
        c[j][start]=n
        if (n%11==0):
            p.append((j,start))
        n=n+1
    start=start+1    
    end=end-1

for i in range (number):
    for j in range (number):
        print(c[i][j], end="\t")
    print()
print("Total Power points :", len(p))    
print(*p, sep="\n")    
