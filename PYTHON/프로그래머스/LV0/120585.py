def solution(array, height):
    answer = 0
    array.sort()
    for i in range (0, len(array)):
        if array[i] > height:
            answer = len(array) - i
            print(answer , i)
            break
    return answer