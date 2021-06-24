w, h, b = map(int, input().split())

mb = w * h * b / 1024 / 1024 / 8
#mb = round(mb, 3)

print('%.2f' %mb , "MB" )

