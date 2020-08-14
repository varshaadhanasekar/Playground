total_value = int(input())
no_of_5s = int((total_value - 4) / 5)
if((total_value - (no_of_5s * 5))%2 == 0):
  no_of_1s = 2
else:
  no_of_1s = 1
no_of_2s = int((total_value - (no_of_5s * 5 + no_of_1s))/2)
total_coins = no_of_5s + no_of_2s + no_of_1s
print(total_coins, no_of_5s, no_of_2s, no_of_1s, end=" ")