n, m, k = map(int, input().split())
num = 0
for i in range(n):
    for j in range(m):
        for l in range(k):
            print(i,j,l)
            num+=1

print(num)