d= []
for m in range(19):
    d.append([])
    for n in range(19):
        d[m].append(0)
# d 리스트에 0으로 19*19 만큼 채워넣는다.
for i in range(19):
    d[i] = list(map(int, input().split()))
#각 줄만다 리스트를 채워넣는다
n = int(input())
#입력할 인자의 수를 삽입한다.
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
#해당 좌표들의 0은 1로 1은 0으로 교체한다.  
for m in range(19):
    for n in range(19):
        print(d[m][n], end=" ")
    print()
#출력