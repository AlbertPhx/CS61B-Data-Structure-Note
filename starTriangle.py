# Outer loop to iterate through each row
for i in range(1, 6):  # 1 to 4, inclusive
    # Inner loop to print asterisks for each row
    for j in range(i):  # Range up to i
        print("*", end="")  # Print asterisk without newline
    print()  # Move to the next line after each row
