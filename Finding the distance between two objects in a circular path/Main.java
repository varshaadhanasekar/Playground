import math
PI = 3.14159265
v1 = int(input())
r1 = int(input())
v2 = int(input())
r2 = int(input())
t = int(input())
val = PI / 180.0;
dega = (v1 * t) % 360
degb = (v2 * t) % 360
anglee = abs(dega - degb)
angx = 360 - anglee
if(angx > anglee):
	ang = anglee
else:
	ang = angx
if(v1>0 and v2>0 and r1>0 and r2>0):
    if(r2>r1 and r2<=100):
        if(v1<=360 and v2<=360):
                if(t>0 or t<=100):
                    if(ang == 0):
                        print("%.2f" %(r2-r1))
                    elif(ang == 180):
                        print("%.2f" %(r1+r2))
                    else:
                        ret = math.cos(ang*val)
                        a = math.pow(r1,2)+ math.pow(r2,2)-(2*r1*r2*ret);
                        f = math.sqrt(a);
                        print("%.2f" %(f))