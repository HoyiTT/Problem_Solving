def solution(left, right):
    answer = 0
    for i in range(left, right + 1):
        divnum = 0
        for k in range(1, i + 1):
            if i % k == 0:
                divnum += 1
        if divnum % 2 == 0:
            answer += i
        else:
            answer -= i          
    return answer