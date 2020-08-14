t = int(input())
for i in range(t):
  total = int(input())
  count = 0
  while total != 0:
    total = total // 2
    count += 1
  print(count)
