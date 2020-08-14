n=int(input())
if n<=1:
    print('You cannot generate christmas tree')
elif n>20:
    print('Tree is no more')
else:
  for i in range(1,n+2):
    print((n-i+1)*' ',end='')
    print((2*i-1)*'*')
  for j in range(1,n-1):
    for k in range(1,n-j+1):
      print((n-k)*' ',end='')
      print((2*k+1)*'*')
  for i in range(2):
    print(n*" ",end='')
    print('*')