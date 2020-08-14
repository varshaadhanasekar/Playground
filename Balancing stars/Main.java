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
    def size(self):
        return len(self.items)

a=Stack()
s = input()
flag = 0
count = 0
for i in range(len(s)):
	if(s[i] == '{' or s[i] == '[' or s[i] == '('):
		a.push(s[i])
		flag = 1
	if(not(a.isEmpty())):
		if(s[i] == '}'):
			if(a.peek() == '{'):
				a.pop()
				continue
			else:
				break
		if(s[i] == ']'):
			if(a.peek() == '['):
				a.pop()
				continue
			else:
				break
		if (s[i] == ')'):
			if (a.peek() == '('):
				a.pop();
				continue;
			else:
				break
		if(s[i] == '*'):
			if(s[i+1] == '*'):
				if(a.peek()=='(' or a.peek()=='{' or a.peek()=='['):
					count = count + 1
	else:
		if(flag == 1):
			flag = 0
			break
if(a.isEmpty() and flag==1):
	print("Yes", count);
else:
	print("No", count);
		