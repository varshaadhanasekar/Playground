import functools 
from itertools import permutations 
least_multiple = -1
flag = 0
N , d = map(int, input().split(" "))
digits_cnt = 0
temp = N
digit_arr = []
while(temp!=0):
    digit_arr.append(temp%10)
    digits_cnt = digits_cnt + 1
    temp = temp//10;
digit_arr.sort()
perm = permutations(digit_arr)
min = -1
for i in list(perm):
    num = functools.reduce(lambda sub, ele: sub * 10 + ele, i)
    if(num % d == 0):
        if(num < min or min == -1):
            min = num
            flag = 1
            print(num)
            break
if(flag != 1):
    print(least_multiple)