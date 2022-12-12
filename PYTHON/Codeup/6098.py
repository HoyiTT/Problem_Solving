d = []
for m in range(10):
    d.append([])
    for n in range(10):
        d[m].append(0)

for m in range(10):
    d[m] = list(map(int, input().split()))
x = 1
y = 1

while True:
    if d[x][y] == 0:
        d[x][y] = 9
    elif d[x][y] == 2:
        d[x][y] = 9
        break

    if(d[x+1][y] == 1 and d[x][y+1] == 1)or(x==8 and y == 8):
        break
    if d[x][y+1] == 0:
        y = y + 1
    elif d[x][y+1] == 1:
        x = x + 1

for m in range(10):
    for n in range(10):
        print(d[m][n], end=" ")
    print()