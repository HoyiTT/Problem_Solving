a,b,c = map(int,input().split())
time = [0]*100
sum = 0

for _ in range(3):
    start, end = map(int,input().split())
    for i in range(start, end):
        time[i] += 1

for k in time:
    if k == 0:
        sum += 0
    if k == 1:
        sum +=a
    if k == 2:
        sum +=b*2
    if k == 3:
        sum +=c*3
        
print(sum)