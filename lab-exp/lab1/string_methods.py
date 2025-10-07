text = "Python is Powerful and Popular  "
other = "python is powerful and popular"

# Indexing
print(text[2]) 

# Membership test
print("Powerful" in text)  

# Length
print(len(text))  

# find()
print(text.find("Popular"))  

# Equality
print(text == other)  

# Case-insensitive equality
print(text.strip().lower() == other.lower()) 

# join()
words = ["Python", "is", "fun"]
print(" ".join(words))  

# rfind()
print(text.rfind("P"))  

# Slicing
print(text[2:8])  

# lower()
print(text.lower())  

# upper()
print(text.upper())  

# strip()
print(text.strip())
