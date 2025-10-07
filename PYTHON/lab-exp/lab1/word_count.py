def count_words(text):
    words = text.split()
    return len(words)-1

input_string = "Sum of 12 and 20 is 32"
print(count_words(input_string))  # Output: 6

