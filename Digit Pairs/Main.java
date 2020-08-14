def check(d,x):
    for i in range(x,len(l),2):
        if l[i][0] not in d:
            d[l[i][0]] = 0
        d[l[i][0]] += 1

def update(d):
    for i in d.keys():
        if d[i] == 2:
            ans[ord(i)-ord('0')] += 1
        elif d[i] > 2:
            ans[ord(i)-ord('0')] += 2
n = int(input())
ans = [0]*10
count = 0
l = []
for s in input().split():
    bit = int(max(s))*11 + int(min(s))*7
    l.append(str(bit)[-2:])
d = {}
check(d,0)
update(d)
d.clear()
check(d,1)
update(d)
for i in ans:
    if i > 2: count += 2
    else: count += i
print(count,end="")