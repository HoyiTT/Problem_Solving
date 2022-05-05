abox = []
bbox = []
for _ in range(10):
    abox.append(int(input()))

for i in range(10):
    bbox.append(abox[i] % 42)

bbox = set(bbox)

print(len(bbox))