w , h = map(int, input().split())

z=[]

for m in range(w):
    z.append([])
    for n in range(h):
        z[m].append(0)



n = int(input())

for st in range(n):
    l, d, x, y = map(int, input().split())
    if d == 0:
        for c in range(l):
            z[x-1][y-1+c] = 1
    else:
        for c in range(l):
            z[x-1+c][y-1] = 1

for m in range(w):
    for n in range(h):
        print(z[m][n], end=" ")
    print()