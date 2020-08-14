import math
def isPrime(n) : 
  
    # Corner cases 
    if (n <= 1) : 
        return False
    if (n <= 3) : 
        return True
  
    # This is checked so that we can skip  
    # middle five numbers in below loop 
    if (n % 2 == 0 or n % 3 == 0) : 
        return False
  
    i = 5
    while(i * i <= n) : 
        if (n % i == 0 or n % (i + 2) == 0) : 
            return False
        i = i + 6
  
    return True
def sumDigitSquare(n) : 
    sq = 0
    while (n) : 
        digit = n % 10
        sq = sq + digit * digit 
        n = n // 10
      
    return sq 
def isHappy(n) : 
 
    while (1) : 
        if (n == 1) : 
            return True
        n = sumDigitSquare(n) 
  
        if (n == 4) : 
            return False
      
    return False
lower = int(input())
upper = int(input())
n = int(input())
is_true = True
if(lower>upper or lower<=0 or n<=0):
	is_true = False
count = 0
x  = 0
if(lower % 2 == 0):
    lower = lower + 1
if(is_true == True):
    for i in range(lower, upper+1, 2):
        #print(i)
        #print(isPrime(i))
        #print(isHappy(i))
        if(isPrime(i) == True) and (isHappy(i) == True):
                x = x + 1
                #print(x)
                count = count + 1
                if(count == n):
                    print(i)
                    break
if(is_true == False):
    print("Invalid Input")
elif(x  < n):
        print("No number is present at this index")