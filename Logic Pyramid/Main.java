k = 2 
n = int(input())
for i in range(n):
	for sp in range(n-i-1):
		print("     ", end="")
	for j in range(i+1):
		if(j == 0):
			print("%05d" %(k*(2*k-1)), end="")
		else:
			print("     ", end="")
			print("%05d" %(k*(2*k-1)), end="")
		k = k + 2
	print()