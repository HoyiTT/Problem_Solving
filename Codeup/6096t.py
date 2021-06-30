d= []
for m in range(19):
    d.append([])
    for n in range(19):
        d[m].append(0)
        
for i in range(19):
    d[i] = list(map(int, input().split()))

n = int(input())

for m in range(n):
    x , y = map(int, input().split())
    for b in range(19):
        if d[x-1][b] == 0 :
            d[x-1][b] = 1
        else:
            d[x-1][b] = 0
        if d[b][y-1] == 0 :
            d[b][y-1] = 1
        else:
            d[b][y-1] = 0
for m in range(19):
    for n in range(19):
        print(d[m][n], end=" ")
    print()