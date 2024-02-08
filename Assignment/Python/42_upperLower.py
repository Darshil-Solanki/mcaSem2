import re
st=input("Enter a string:")
pattern=re.compile(r'([A-Z][a-z]+)')
matched = re.findall(pattern,st)
print("Matched Sequence of one uppercase followed by lowercase letter:",matched)