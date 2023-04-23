def solution(name, yearning, photo):
    data = dict(zip(name, yearning))
    answer = []
    for namelist in photo:
        result = 0
        for name in namelist:
            if name in data:
                result += data[name]
        answer.append(result)
    return answer