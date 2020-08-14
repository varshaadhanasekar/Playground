test = int(input())
while(test != 0):
    check = 0
    #No. of zombies & max time
    n, time = map(int, input().split())
    #energy of zombies
    z = list(map(int, input().strip().split()))[:n]
    #initial energy and minimum energy required for next level
    player, min = map(int, input().split())
    #if given time is less than no.of zombie the player can not complete the level
    if time < n: 
        check = check + 1
    else:
        z.sort()
            
        for i in range(n):
            if player>=z[i]:
                player = player + (player-z[i])#if player wins player gains the diffrence of energy
            else:
                check = check + 1
                break
    #check energy for next level
    if (player >= min and not(check)): 
        print("YES", end="") 
    else:
        print("NO", end="");
    check = 0
    test = test - 1