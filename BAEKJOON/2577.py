x = int(input())
y = int(input())
z = int(input())

a = x * y * z

a = str(a)


for b in range(0,10):
    k = 0
    for i in range (len(a)):
        if  str(b) in a[i]:
            k += 1
    print(k)    
