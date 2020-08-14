c1, w1, r1 = map(int, input().split())
c2, w2, r2 = map(int, input().split())
c3, w3, r3 = map(int, input().split())
h = []
for i in range(5):
	e = int(input())
	h.append(e)
r = [r1, r2, r3]
w = [w1, w2, w3]
c = [c1, c2, c3]
total_cost = 0
for i in range(5):
	cost = 0
	v = []
	for j in range(3):
		hr = h[i] * 730
		cost = hr * r[j]
		bc = 1
		while(hr > w[j]):
			hr = hr - w[j]
			bc = bc + 1
		cr = cost + (bc * c[j])
		v.append(cr)
	v.sort()
	min_cost = v[0]
	if(i == 1 or i == 2 or i == 3):
		min_cost *= 2
	total_cost = total_cost + min_cost
print(total_cost)