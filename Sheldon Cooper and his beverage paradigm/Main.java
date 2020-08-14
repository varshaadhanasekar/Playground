def find(a,n,k,flag):
  for i in range(0,n):
    x = a[i];
    M = k -x;
    start = i + 1;
    end = n-1;
    while(start<end):
      sum = a[start] + a[end];
      if(sum==M):
        flag = 1;
        return flag;
      elif(sum<M):
        start+=1;
      else:
        end-=1;
flag = 0;
a = []
n = int(input())
for i in range(0,n):
  a.append(int(input()));
k=int(input())
a.sort();
flag = find(a,n,k,flag);
if(flag == 1):
  print("TRUE");
else:
  print("FALSE")