numbers = [0]*26
n = int(input())
while(n != 0):
    s = input()
    isAscii=True
    for i in s:
        if((i >= 'a') and (i <= 'z')):
            x = ord(i)
            y = ord('a')
            #print(y)
            numbers[x - y] = numbers[x - y] + 1
    for i in range(26):
        if((numbers[i]>0) and (numbers[i]!=(i+1))):
            isAscii=False
        numbers[i]=0
    if(isAscii):
        print("YES ",end="");
    else:
        print("NO ",end="");
    n = n - 1