n = int(input())
m = int(input())
a = []
finalkey = [0] * n
d = []
for i in range(m+1):
	d = list(int(num) for num in input().strip().split())
	a.append(d)
option = [0] * 5
for i in range(n):
	    finalkey[i] = a[0][i]
#print(finalkey)
for l in range(1, m+1):
	score=0;
	j=0;
	option = [0] * 5
	while(j<n):
		if(finalkey[j]==a[l][j]):
			score = score + 1
		j = j + 1
	print(score)
	
	for i in range(n):
		option = [0] * 5
		max=0
		maxcount=0
		for j in range(0, l+1):
			option[a[j][i]] += 1
		for k in range(1, 5):
			if(option[k]>max):
				max=option[k]
				finalkey[i]=k
		for k in range(1, 5):
			if(max==option[k]):
				maxcount = maxcount + 1
		flag = 1
		if(maxcount>1):
			for j in range(l, 0, -1):
				for k in range(1, 5, 1):
					if((a[j][i] == k) and (option[k] == max) and (flag == 1)):
							finalkey[i] = k
							flag=0;
							break;
maxscore=0
maxperson=0;
for i in range(1, m+1):
	score=0
	for j in range(n):
		if(finalkey[j] == a[i][j]):
			score = score + 1
	if(score>maxscore):
		maxscore=score;
		maxperson=i
print(maxperson, maxscore)