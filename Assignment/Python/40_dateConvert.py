from datetime import date

def dateConvert(date):
    return date.strftime('%d-%m-%Y')

d=date(2024,1,27)
print("Date before Converting:",d)
new_date=dateConvert(d)
print("Date after Converting:",new_date)