n = int(input())
for i in range(1,2*n):
    if i >= 1 and i <= n:
        print(('*'*i)+' '*(n-i)+' '*(n-i)+('*'*i))
    else:
        print(('*'*(2*n-i)+' '*(i-n)+' '*(i-n)+'*'*(2*n-i)))
