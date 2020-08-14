class Stack:
    def __init__(self):
        self.items = []
    def isEmpty(self):
        return self.items == []
    def push(self, item):
        self.items.append(item)
    def pop(self):
        return self.items.pop()
    def peek(self):
        return self.items[len(self.items)-1]
t = int(input())
for k in range(t):
	c = 0
	s = Stack()
	str = input()
	flag = True
	count = 0
	n = len(str)
	if(str[0] != '{' or str[1] == '{' or str[n-1] != '}'):
		flag = False
	else:
		for i in range(n-1):
			if (str[i] == '<'):
				s.push(str[i])
				continue
			if(str[i] == '{'):
				if(not(s.isEmpty())):
					s.push(str[i])
					continue
			if(str[i] == '('):
				if(s.isEmpty()):
					s.push(str[i])
					continue
				else:
					flag = False
					break
			if (not(s.isEmpty())):
				if (str[i] == '}'):
					if (s.peek() == '{'):
						s.pop()
						continue
					else:
						break
				if (str[i] == '>'):
					count = count + 1
					if(count > 1):
						flag = 0
						break;
					if (s.peek() == '<'):
						s.pop()
						continue
						
					else:
						break;
				if (str[i] == ')'):
					if (s.peek() == '('):
						s.pop()
						continue
					else:
						break;
				if(str[i] == 'P' and s.peek() == '('):
					c = c + 1
					continue
			
			
	if(count == 0 or c > 100):
		flag = 0;
	if ((s.isEmpty()) and (flag == 1)):
		print("No Compilation Errors")
	else:
		print("Compilation Errors")