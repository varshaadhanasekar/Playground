n,k=list(map(int,input("").split()))
#n=12
#k=3
if k==1:
	print(n)
else:
	sqrt=int(n**0.5)
	l=[]
	for i in range(1,sqrt+1):
		if n%i==0:
			l.append(i)
			if n//i!=i:
				l.append(n//i)
	l.sort()
	if k>len(l):		
		print(1)
	else:
		print(l[-k])