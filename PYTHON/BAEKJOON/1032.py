n = int(input())

data = []


for _ in range(n):
    data.append(input())

ans = list(data[0])

for i in range(n):
    for k in range(len(data[0])):
        if ans[k] == data[i][k]:
            continue
        else:
            ans[k] = '?'

print(''.join(ans))


