def solution(array):
    a = max(array)
    b = 0
    for i in range(0, len(array)):
        if array[i] == a:
            b = i
    answer = [a, b]
    return answer