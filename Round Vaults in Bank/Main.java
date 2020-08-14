MAX_VAULTS = 50
def MAX(a,b):
	if(a > b):
		return a
	return b
	
def can_i_steal(stolen_vaults, n, curr_vault):
	for vault_idx in range(curr_vault - 4, curr_vault+1):
		count = 0
		for j in range(vault_idx, (vault_idx + 5)):
			idx = j
			if(idx < 0):
				idx = n + idx
			elif(idx >= n):
				idx = idx % n
			if(stolen_vaults[idx] == 1):
				count = count + 1
		if(count >= 2):
			return 0
	return 1
	
def max_stealing_opt(vault_values, n, stolen_vaults, current_vault):
	if(current_vault >= n):
		values = 0
		for i in range(n):
			if(stolen_vaults[i] == 1):
				values += vault_values[i]
		return values
		
	if_stolen = 0;
	if(can_i_steal(stolen_vaults, n, current_vault) == 1):       
		stolen_vaults[current_vault] = 1;
		if_stolen = max_stealing_opt(vault_values, n, stolen_vaults, current_vault + 1);
		
		# If not stolen
	stolen_vaults[current_vault] = 0;
	if_not_stolen = max_stealing_opt(vault_values, n, stolen_vaults, current_vault + 1);
	return MAX(if_stolen, if_not_stolen)
		
def max_stealing_opt_wrapper(vault_values, n):
	stolen_vaults = []
	for i in range(n):
		stolen_vaults.append(0)
	return max_stealing_opt(vault_values, n, stolen_vaults, 0)

n = int(input())
vault_values = []
vault_values = list(int(num) for num in input("").strip().split())[:n]
print(max_stealing_opt_wrapper(vault_values, n))