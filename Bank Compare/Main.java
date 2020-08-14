bank = [];
l=0;
p=float(input())
y=int(input())
for k in range(0,2):
  n=int(input());
  sum=0;
  for i in range(0,n):
    yrs,s=input().split()
    yrs = int(yrs);
    s=float(s);
    mi=0;
    j=s/1200;
    j1=1+j;
    y1=yrs*12;
    sq=pow(j1,y1);
    emi=p*(j/(1-(1/(sq))));
    mi=emi*y1;
    sum=sum+mi;
  bank.append(sum);
if(bank[0]<bank[1]):
  print("Bank A");
else:
  print("Bank B");