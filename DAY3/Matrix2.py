matrix = []

print("Enter the elements of the 3x3 matrix:")

for i in range(3):
    row = list(map(int, input().split()))
    matrix.append(row)

print("The matrix is:")

for row in matrix:
    print(row)