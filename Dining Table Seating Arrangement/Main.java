t = int(input())
for i in range(t):
    tables, people = input().split()
    tables = int(tables)
    people = int(people)
    #for cases where tables are greater than or equal to number of people
    if tables>=people:
        print(1)
    #for all other cases    
    else:    
        #find number of people to be seated in each type A & type B table
        PA = people//tables
        PB = PA+1
    
        #find number of type A & type B tables
        TB = people%tables
        TA = tables-TB
    
        factorials=list((1,1))
        for i in range (2,people+2):
            x = i*factorials[i-1]
            factorials.append(x)
    
        #Dividing people between tables
        divide=factorials[people]//((factorials[PA]**TA)*(factorials[PB]**TB)*factorials[TA]*factorials[TB])
    
        #Arranging people after dividing them
        if PB>=4:
            arrange=int(divide*(factorials[PA-1]/2)**TA*(factorials[PB-1]/2)**TB)
        else:
            arrange=divide
    
        print(arrange)