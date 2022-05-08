x = int(input())

b = [0, 1, 3]

for n in range(3,x+1):
    b.append(b[n-1]+2*(b[n-2]))

print(b[x] % 10007)