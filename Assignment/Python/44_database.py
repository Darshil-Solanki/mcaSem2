import sqlite3 as db
conn = db.connect('database.db')
cursor = conn.cursor()
def create_table():
    try: 
        cursor.execute('''
            CREATE TABLE STUDENT(
                PRN INTEGER PRIMARY KEY,
                SNAME VARCHAR2(50),
                DOB DATE,
                ADDRESS VARCHAR2(60),
                GENDER CHAR DEFAULT 'M',
                COURSE VARCHAR2(10)
            )    
        ''')
        conn.commit()
        print("Table created Successfully.")
    except Exception as e:
        print("Error occured:",e)

def insert_record(prn,sname,dob,address,gender,course):
    try:
        cursor.execute('INSERT INTO STUDENT VALUES(?,?,?,?,?,?)',[prn,sname,dob,address,gender,course])
        conn.commit()
        print("Record inserted Successfully.")
    except Exception as e:
        print("Error Occured:",e)

create_table()
insert_record(8023057262,'Darshilkumar','12-02-2002','Porbandar','M','MCA')

