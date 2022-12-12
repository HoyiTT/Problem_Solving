a =int(input())
b =int(input())
c =int(input())
d =int(input())
e =int(input())

if (a <= b) and (a <= c):
    pasta=a
elif (b <= a) and (b <= c):
    pasta=b
else:
    pasta=c

if d > e:
    drink = e
else:
    drink = d 
    
full = pasta + drink 
full = full + full*0.1 
print(round(full,1))