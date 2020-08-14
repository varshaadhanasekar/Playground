str1 = input()
slabs = []
slabs = list(map(int, str1.split()))
slabcount = len(slabs)
taxper = list(int(num) for num in input().strip().split())[:slabcount]
rebate = int(input())
str2 = input()
tax = []
tax = list(map(int, str2.split()))
max_tax = []
max_tax.append(0.0)
for i in range(1, slabcount):
    e = (slabs[i]-slabs[i-1]) * (taxper[i-1]/100.0)
    max_tax.append(e)
taxcount = len(tax)
total = 0
for i in range(taxcount):
    sal = 0
    count = 1
    while(tax[i] != 0):
        if(count < slabcount):
            if(tax[i] >= max_tax[count]):
                sal = slabs[count]
                tax[i] = tax[i] - max_tax[count]
            count = count + 1
        else:
            sal = slabs[count-1] + (tax[i] * 100.0 // taxper[count-1])
            tax[i] = 0
            break
    sal = sal + rebate
    total = total + sal
if(total == (taxcount * rebate)):
    print("The salaries are not more than 3,00,000 or there are no slabs");
else:
    print(int(total))