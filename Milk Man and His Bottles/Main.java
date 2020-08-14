import sys
def minCans(cans, m, V):
    INT_MAX = 2147483647
    table = []
    t = []
    table.append(0)
    for i in range(1, V+1):
        table.append(INT_MAX)
    t.append(0)
    for i in range(1, V+1):
        for j in range(m):
            if (cans[j] <= i):
                x = i - cans[j]
                sub_res = table[x] 
                if (sub_res != INT_MAX and (sub_res + 1 < table[i])):
                    table.insert(i, sub_res + 1)
    return table[V]; 
cans = [1, 5, 7, 10]
m = len(cans)
n = int(input())
for i in range(n):
	V = int(input())
	print(minCans(cans, m, V))