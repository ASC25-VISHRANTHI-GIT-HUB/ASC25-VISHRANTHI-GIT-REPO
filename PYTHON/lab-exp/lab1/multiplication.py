def multiplication_table_for(num):
    for i in range(1, 11):
        print(f"{num} x {i} = {num * i}")

def multiplication_table_while(num):
    i = 1
    while i <= 10:
        print(f"{num} x {i} = {num * i}")
        i += 1

def multiplication_table_do_while(num):
    i = 1
    while True:
        print(f"{num} x {i} = {num * i}")
        i += 1
        if i > 10:
            break
number = int(input("Enter a number to display its multiplication table: ")) 
print("Using for loop:")
multiplication_table_for(number)

print("\nUsing while loop:")
multiplication_table_while(number)

print("\nUsing do-while loop:")
multiplication_table_do_while(number)