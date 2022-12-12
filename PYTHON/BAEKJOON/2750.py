n = int(input())
data = []
for _ in range (n):
    data.append(int(input()))

data.sort()

for a in range (n):
    print(data[a])

