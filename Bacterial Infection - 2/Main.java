import sys
def min(t1, t2, t3, t4):
	if(t1 < t2 and t1 < t3 and t1 < t4):
		return t1
	elif(t2 < t3 and t2 < t4):
		return t2
	elif(t3 < t4):
		return t3
	else:
		return t4

def compute_infec_t(house_layout, current_row, current_col, total_rows, total_col, house_infec_time, current_time):
	if((current_row >= total_rows) or (current_row < 0)  or (current_col >= total_col)  or (current_col < 0)):
		return;
	
	if(house_layout[current_row][current_col] == 'c'):
		return;
	
	if(current_time >= house_infec_time[current_row][current_col]):
		return;
	house_infec_time[current_row][current_col] = current_time
	compute_infec_t(house_layout,current_row, current_col+1,total_rows, total_col,house_infec_time,current_time + 1)
	compute_infec_t(house_layout,current_row - 1, current_col,total_rows, total_col,house_infec_time,current_time + 1)
	compute_infec_t(house_layout,current_row, current_col - 1,total_rows, total_col,house_infec_time,current_time + 1)
	compute_infec_t(house_layout, current_row + 1, current_col,total_rows, total_col, house_infec_time, current_time + 1)
	
	return
	
def compute_infec_time_wrapper(house_layout, first_infec_room_row, first_infec_room_col, total_rows, total_col):
	house_infec_time=[0]*total_rows
	for i in range (total_rows):
		house_infec_time[i]=[0]*total_col
		for j in range (total_col):
			house_infec_time[i][j]=sys.maxsize
	compute_infec_t(house_layout, first_infec_room_row, first_infec_room_col,total_rows, total_col,house_infec_time,1)
	
	max = 0
	for i in range(total_rows):
		for j in range(total_col):
			if((house_infec_time[i][j] != sys.maxsize) and (max < house_infec_time[i][j])):
				max = house_infec_time[i][j]
	return max

total_rows, total_col = map(int, input().split())
house_layout = []
for i in range(0,total_rows):
    house_layout.append(list(input().rstrip().split()))
first_infec_room_row, first_infec_room_col = map(int, input().split())
time_taken = compute_infec_time_wrapper(house_layout, first_infec_room_row, first_infec_room_col, total_rows, total_col)
print(time_taken)