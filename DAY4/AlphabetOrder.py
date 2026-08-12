'''Sort String in Alphabetical Order Without Inbuilt Sort'''
s = input()

arr = list(s)

n = len(arr)

for i in range(n):
    for j in range(0, n - i - 1):
        if arr[j] > arr[j + 1]:
            arr[j], arr[j + 1] = arr[j + 1], arr[j]

print("".join(arr))
