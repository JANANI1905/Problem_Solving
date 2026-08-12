a = list(map(int, input().split()))
target = int(input())
seen = set()
for num in a:
    diff = target - num
    if diff in seen:
        print(diff,num)
        break
    seen.add(num)