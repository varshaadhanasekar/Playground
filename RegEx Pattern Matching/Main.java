str = input()
pattern = input()
str_len = len(str)
pattern_len = len(pattern)
str_len = len(str)
pattern_idx = 0
is_match = True 
for str_idx in range(str_len):
	if(pattern_idx == pattern_len):
		is_match = False
		break
	curr_str_char = str[str_idx]
	if(pattern[pattern_idx] != '+'):
		if(pattern[pattern_idx] == curr_str_char):
			pattern_idx = pattern_idx + 1
		else:   
			is_match = False
			break
	elif((pattern[pattern_idx] == '+') and ((pattern_idx + 1) != pattern_len)):
		prev_pattern_char = pattern[pattern_idx - 1];
		next_pattern_char = pattern[pattern_idx + 1];
		if(curr_str_char == prev_pattern_char):
			pass
		elif(curr_str_char == next_pattern_char):
			pattern_idx = pattern_idx + 2
		elif(pattern_idx == pattern_len):
			is_match = False
			break
		else:
			is_match = False;
			break;
			
	elif((pattern[pattern_idx] == '+') and (pattern_idx + 1) == pattern_len):
		prev_pattern_char = pattern[pattern_idx - 1]
		if(curr_str_char == prev_pattern_char):
			pass
		else:
			is_match = False
			break
while(pattern_idx < pattern_len):
	if(pattern[pattern_idx] != '+'):
		break;
	pattern_idx = pattern_idx + 1
        
if((is_match == True) and (pattern_idx == pattern_len)):
	print("Matched")
else:
	print("Does not match")