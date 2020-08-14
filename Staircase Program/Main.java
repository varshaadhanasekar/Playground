def countWaysUtil(n, m): 
    res = [0 for x in range(n)]  
    res[0], res[1] = 1, 1
      
    for i in range(2, n): 
        j = 1
        while j<= m and j<= i: 
            res[i] = res[i] + res[i-j] 
            j = j + 1 
    return res[n-1] 
  
def countWays(s, m): 
    return countWaysUtil(s + 1, m) 
      
s=int(input());
m=2
print(countWays(s, m));