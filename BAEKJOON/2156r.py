n = int(input())

d = [0] * (n+1)
p = [0] 

for _ in range(n):
    p.append(int(input()))
if n == 1 or n == 2:
    print(sum(p))
else: 
    d[1], d[2] = p[1], p[1]+p[2]

    for k in range(3,n+1):
        d[k] = p[k-1]
        d[k] = max(max(d[k-1],d[k-2]+p[k]),d[k-3]+p[k-1]+p[k])

    print(d[n])
