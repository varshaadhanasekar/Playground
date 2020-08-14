T = int(input())
while(T > 0):
    n = int(input())
    a = []
    a = [int(i) for i in input().split()][:n]
    alpha = []
    a1 = []
    a2 = []
    ch = 'a'
    for i in range(n):
        a1.append(ch)
        ch = chr(ord(ch) + 1)
        alpha.append(a1[i])
    is_true = True
    count = 1
    while(is_true):
        a2 = [0] *n
        for i in range(0, n):
            e = a[i] - 1
            a2.pop(e)
            a2.insert(e , a1[i])
        if a2 == alpha:
            break
        else:
            a1 = []
            for i in range(n):
                a1.insert(i, a2[i])
            
        count = count + 1
    print(count)
    T = T - 1
   