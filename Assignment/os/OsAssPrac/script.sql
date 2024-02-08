CREATE TABLE employee(
	empNo INTEGER PRIMARY KEY,
	empName VARCHAR2(15),
	salary INTEGER,
	job VARCHAR2(10),
	deptNo INTEGER
);
INSERT INTO employee 
VALUES(&empNo,'&empName',&salary,'&job',&deptNo);
/;
/;
/;
/;
exit;