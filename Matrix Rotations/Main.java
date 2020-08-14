def rotateMatrix(A): 
    N = len(A[0]) 
    for i in range(N // 2): 
        for j in range(i, N - i - 1): 
            temp = A[i][j] 
            A[i][j] = A[N - 1 - j][i] 
            A[N - 1 - j][i] = A[N - 1 - i][N - 1 - j] 
            A[N - 1 - i][N - 1 - j] = A[j][N - 1 - i] 
            A[j][N - 1 - i] = temp 
mat = []
initial = []
N = int(input())
for x in range(N):
    mat.append([int(y) for y in input().split()])
initial = list(map(list,mat))
t = 0
a = 0
angle = 0
while(True):
	ch = input().split()
	if(ch[0] == 'A'):
		angle = int(ch[1])
		t = angle // 90;
		t = t % 4;
		a = a + t;
		while(t != 0):
			rotateMatrix(mat)
			t = t - 1
	elif(ch[0] == 'Q'):
		r = int(ch[1])
		c = int(ch[2])
		print(mat[r-1][c-1])
	elif(ch[0] == 'U'):
		x = int(ch[1])
		y = int(ch[2])
		z = int(ch[3])
		mat = list(map(list,initial))
		mat[x-1][y-1] = z
		while(a != 0):
			rotateMatrix(mat)
			a = a - 1
	elif(ch[0] == '-1'):
		break;