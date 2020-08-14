import sys
def solve(N):
    x=N//4;
    y=N%4;
    if(y==0):
        return x%2;
    else:
        a=0;
        if(x%2==1):
            k=1;
            while(k<y):
                k=k+1;
                a=k;
                k=k+1;
            if(a==y):
                return 1;
            else:
                return 0;
        else:
            k=0;
            while(k<y):
                k=k+1;
                a=k;
                k=k+1;
            if(a==y):
                return 1;
            else:
                return 0;
T=int(input());
if(T<1 or T>1000):
    sys.exit();
for i in range(0,T):
    N=int(input());
    if(N<1 or N>10000):
        sys.exit();
    result=solve(N);
    if(result):
        print("Yes");
    else:
        print("No");