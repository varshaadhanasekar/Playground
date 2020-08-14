def convert_to_base(no, base):
	store = []
	index = 0;
		
	while(no > 0):
		quot = no // base
		rem  = no % base
		store.append(rem)
		no = quot
	index = len(store)	
	converted_no = 0
	for i in range(index-1, -1, -1):
		converted_no = converted_no * 10 + store[i]
	return converted_no
def compute_sum_of_digits(n):
	sod = 0
	while(n > 0):
		sod = sod + n % 10
		n = n // 10
	return sod
b, t = map(int,input().split())
count = 0
i = b
while(True):
	tmp   = convert_to_base(i, b)
	sod = compute_sum_of_digits(tmp)
	if(i % sod == 0):
		count = count + 1
	else:
		if(count == t):
			break
		count = 0
	i = i + 1
print(convert_to_base(i - t, b))
