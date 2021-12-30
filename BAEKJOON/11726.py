x = int(input())

b = [0]*(x+1)

b[1] = 1
b[2] = 2

for n in range(3,x+1):
    b[n] = b[n-1]+b[n-2]

print(b[x] % 10007)