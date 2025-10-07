class Student:
    def __init__(self):
        self._student_id = None
        self._student_name = None
        self._city = None
        self._marks1 = 0
        self._marks2 = 0
        self._marks3 = 0
        self._fee_per_month = 0.0
        self._is_eligible_for_scholarship = False

    def set_student_id(self, student_id): self._student_id = student_id
    def set_student_name(self, student_name): self._student_name = student_name
    def set_city(self, city): self._city = city
    def set_marks1(self, marks1): self._marks1 = marks1
    def set_marks2(self, marks2): self._marks2 = marks2
    def set_marks3(self, marks3): self._marks3 = marks3
    def set_fee_per_month(self, fee): self._fee_per_month = fee
    def set_is_eligible_for_scholarship(self, eligible): self._is_eligible_for_scholarship = eligible

    def get_student_id(self): return self._student_id
    def get_student_name(self): return self._student_name
    def get_city(self): return self._city
    def get_marks1(self): return self._marks1
    def get_marks2(self): return self._marks2
    def get_marks3(self): return self._marks3
    def get_fee_per_month(self): return self._fee_per_month
    def get_is_eligible_for_scholarship(self): return self._is_eligible_for_scholarship

    def get_annual_fee(self): return self._fee_per_month * 12
    def get_total_marks(self): return self._marks1 + self._marks2 + self._marks3
    def get_average(self): return self.get_total_marks() / 3
    def get_result(self):
        return "pass" if self._marks1 > 60 and self._marks2 > 60 and self._marks3 > 60 else "fail"
    

# Create three Student objects
s1 = Student()
s2 = Student()
s3 = Student()

# Assign data using setter methods
s1.set_student_id(101)
s1.set_student_name("Aarav")
s1.set_city("Mumbai")
s1.set_marks1(85)
s1.set_marks2(78)
s1.set_marks3(92)
s1.set_fee_per_month(1500.0)
s1.set_is_eligible_for_scholarship(True)

s2.set_student_id(102)
s2.set_student_name("Bhavna")
s2.set_city("Delhi")
s2.set_marks1(65)
s2.set_marks2(70)
s2.set_marks3(68)
s2.set_fee_per_month(1200.0)
s2.set_is_eligible_for_scholarship(False)

s3.set_student_id(103)
s3.set_student_name("Chirag")
s3.set_city("Chennai")
s3.set_marks1(55)
s3.set_marks2(60)
s3.set_marks3(58)
s3.set_fee_per_month(1000.0)
s3.set_is_eligible_for_scholarship(True)

# Store students in a list
students = [s1, s2, s3]

# Find student with highest total marks
topper = max(students, key=lambda s: s.get_total_marks())
print(f" Highest Total Marks: {topper.get_student_name()}")

# Find student with lowest monthly fee
lowest_fee_student = min(students, key=lambda s: s.get_fee_per_month())
print(f" Lowest Fee: {lowest_fee_student.get_student_name()} - ₹{lowest_fee_student.get_fee_per_month():.2f}")

# Print each student's details
print("\nStudent Details:")
for s in students:
    print(f"Name: {s.get_student_name()}")
    print(f"Total Marks: {s.get_total_marks()}")
    print(f"Average: {s.get_average():.2f}")
    print(f"Result: {s.get_result()}")
    print(f"Scholarship Eligible: {'Yes' if s.get_is_eligible_for_scholarship() else 'No'}")
    print("-" * 30)

