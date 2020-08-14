def is_even_col_2(is_even_col, row, depth):
	x = True
	if(is_even_col):
		if(row < depth):
			x = True
		else:
			x = False
	else:
		if(row >= 0):
			x = True
		else:
			x = False
	return x
def is_even_col_3(is_even_col, row):
	if(is_even_col):
		row = row + 1
	else:
		row = row - 1
	return row
depth = int(input())
crypted_str = input()
decrypted_str = []
if(depth == 1):
	print(crypted_str)
else:
	idx = 0
	str_len = len(crypted_str)
	n = (str_len - 1) // (depth + (depth - 2))
	for col in range(2*n):
		is_even_col = True
		if(col % 2 == 0):
			is_even_col = True
		else:
			is_even_col = False
		if(is_even_col):
			row = 0
		else:
			row = depth-1
		while(is_even_col_2(is_even_col, row, depth)):

			if(row == 0):
				is_first_row = True
			else:
				is_first_row = False
			if(row == (depth-1)):
				is_last_row = True
			else:
				is_last_row = False
			if(is_first_row and is_even_col and col != 0):
				row = is_even_col_3(is_even_col,row)
				continue;
			if(is_last_row and not (is_even_col)):
				row = is_even_col_3(is_even_col,row)
				continue
			if(is_first_row):
				elem_to_skip = (col // 2)
			else:
				elem_to_skip = (n - 1)
			if(is_last_row):
				elem_to_skip = elem_to_skip + ((col + 1) // 2)
			else:
				elem_to_skip = elem_to_skip + 0
			decrypted_str.append(crypted_str[row * 2 * n + col - elem_to_skip])
			#print(decrypted_str)
			#print(row, col, n, is_even_col)
			row = is_even_col_3(is_even_col,row)
		
	for i in range(len(decrypted_str)-1, -1, -1):
		if(decrypted_str[i] != 'X'):
			listToStr = ''.join(map(str, decrypted_str[:i+1]))
			break
	print(listToStr)