test_case=int(input())
for index in range(1,test_case+1):
	result="";
	str11=list(input());
	str22=list(input());
	frequency = []
	for i in range(0,256):
		frequency.append(0);
	for i in range(0,len(str22)):
		frequency[ord(str22[i])] = frequency[ord(str22[i])] + 1;
	for i in range(0,len(str11)):
		if(frequency[ord(str11[i])] != 0):
			while(frequency[ord(str11[i])] > 0):
				frequency[ord(str11[i])] = frequency[ord(str11[i])] - 1
				result=result+str11[i]
	if(index < test_case):
		print(result)
	else:
		print(result)