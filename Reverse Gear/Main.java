n=input()
try:
    n=int(n);
    if (n > 0):
      for i in range(0,n):
        f,b,t,d = input().split(" ")
        f=int(f)
        b=int(b)
        t=int(t)
        d=int(d)
        count=0;
        dist=0;
        ans=0;
        if(f>=b or d == 0 or t == 0):
          print("Cannot park");
        else:
          while(1):
            if((dist+b)<d):
              dist+=b;
            else:
              ans=(d-dist)*t;
              break;
            dist-=f;
            count+=1;
          ans+=(count*t)*(f+b);
          print(ans);
    else:
        print("Invalid test case");
except:
    print("Invalid test case");