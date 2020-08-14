def sum_num(a, b, arr, N):
    sum = 0
    for i in range(a, b+1):
        sum = sum + arr[i]
    return sum
N = int(input())
arr = []
arr = list(map(int, input().strip().split()))[:N]
flag = False
sum1 = 0
sum2 = 0
sum3 = 0
for i in range(0, N-2):
    a = i
    for j in range(i+2, N):
        b = j
        sum1 = sum_num(0, a-1, arr, N)
        sum2 = sum_num(a+1, b-1, arr, N)
        sum3 = sum_num(b+1, N-1, arr, N)
        if(sum1 == sum2 and sum1 == sum3 and sum2 == sum3):
            print("Indices which form equi pair {%d,%d}"%(a,b))
            print("Slices are {0,%d},{%d,%d},{%d,%d}" %(a-1,a+1,b-1,b+1,N-1))
            flag = True
            break;
    if(flag == True):
        break
if(flag == False):
    print("Array does not contain any equi pair")