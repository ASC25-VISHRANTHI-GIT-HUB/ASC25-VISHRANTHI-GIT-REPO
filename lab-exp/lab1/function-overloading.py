def add(*args):
    if len(args) == 0:
        return None
    elif any(isinstance(i, str) for i in args):
        return " ".join(str(i)for i in args)
    elif all(isinstance(i, (int, float)) for i in args):
        return sum(args)
    else:
        return "Error: Mixed data types are not supported."

print(add(10, 20))         # → 30
print(add(10, 20, 30))     # → 60
print(add(10.5, 20.1))     # → 30.6
print(add("Hello", 20))    # → "Hello 20"


