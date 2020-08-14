def concat_nos(a, b):
	if(b < 10):
		return (a * 10) + b
	return (a * 100) + b
def is_prime(n):
	if(n <= 3):
		return 1
	for i in range(2, (n //2) + 1):
		if(n % i == 0):
			return 0
	return 1

N = int(input())
primes = []
s = set()
for i in range(2, N+1):
    if(is_prime(i) == 1):
        primes.append(i)
for i in range(0, len(primes)):
    for j in range(i + 1, len(primes)):
        if(i == j):
            continue
        concated_no1 = concat_nos(primes[i], primes[j])
        concated_no2 = concat_nos(primes[j], primes[i])
        if(is_prime(concated_no1) == 1):
            s.add(concated_no1)
        if(is_prime(concated_no2) == 1):
            s.add(concated_no2)
print(len(s))