x = int(input())

for i in range(1,2*x):
    if i >= 1 and i <= x:
        print(' ' * (x - i)+('*' * i))
    else:
        print(' ' * (i - x) + '*' * (2 * x - i))