d = []
for m in range(10):
    d.append([])
    for n in range(10):
        d[m].append(0)

for m in range(10):
    d[m] = list(map(int, input().split()))
x = 1
y = 1

print(d[1][3])


while True:
    if d[x][y] == 2:
        break
        
    if d[x][y+1] == 1:
        x+=1
        continue
    
    if d[x+1][y] == 1:
        y+=1
        continue

for m in range(10):
    for n in range(10):
        print(d[m][n], end=" ")
    print()