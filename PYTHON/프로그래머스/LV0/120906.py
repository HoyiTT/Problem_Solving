def solution(n):
    data = str(n)
    answer = 0
    for i in range(len(data)):
        answer += int(data[i])
    return answer