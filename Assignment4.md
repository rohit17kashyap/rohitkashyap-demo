1\) List employees who have the same job title as any employee working in 'CHICAGO'.



**SELECT ENAME FROM EMP** 

**WHERE JOB IN (SELECT JOB FROM EMP JOIN DEPT ON EMP.DEPTNO= DEPT.DEPTNO** 

**WHERE DEPT.LOC='CHICAGO');**



**OR**



**SELECT DISTINCT E1.ENAME**

**FROM EMP E1**

**JOIN EMP E2 ON E1.JOB = E2.JOB**

**JOIN DEPT D ON E2.DEPTNO = D.DEPTNO**

**WHERE D.LOC = 'CHICAGO';**





2)List the names of employees who report to a manager based in 'NEW YORK'.



**SELECT E1.EMPNO, E1.ENAME, E1.MGR**

**FROM EMP E1**

**JOIN EMP E2 ON E1.MGR = E2.EMPNO**

**JOIN DEPT D ON E2.DEPTNO = D.DEPTNO**

**WHERE D.LOC = 'NEW YORK';** 





3)List the names and salaries of employees who earn more than the average salary of the entire company.



**SELECT ENAME , SAL FROM EMP**

**WHERE SAL > (SELECT AVG(SAL) FROM EMP);**



4)Find all employees who hold the same job as 'SMITH' but earn a different salary than him.



**SELECT ENAME FROM EMP** 

**WHERE JOB = (SELECT JOB FROM EMP WHERE ENAME = 'SMITH')**

**AND**

**SAL != (SELECT SAL FROM EMP WHERE ENAME = 'SMITH');**



5)List all employees who were hired after the employee 'ADAMS' was hired.



**SELECT ENAME FROM EMP**

**WHERE HIREDATE > (SELECT HIREDATE FROM EMP**

**WHERE ENAME = 'ADAMS');**





6)Find the names of employees who work in the same department as the employee who earns the highest commission.



**SELECT ENAME ,DEPTNO FROM EMP**

**WHERE DEPTNO = (**

**SELECT DEPTNO FROM EMP WHERE COMM = (**

**SELECT MAX(COMM) FROM EMP));**



7)Show the names of employees whose salary is exactly equal to the minimum salary in the company.



**SELECT ENAME FROM EMP** 

**WHERE SAL =(**

**SELECT MIN(SAL) FROM EMP);**



8)Find all employees who have the same manager as 'FORD'.



**SELECT ENAME FROM EMP**

**WHERE MGR = (**

**SELECT MGR FROM EMP WHERE ENAME = 'FORD')**

**AND ENAME <> 'FORD';**



9)Display the employee names who work in the same department as 'SCOTT'.



**SELECT ENAME FROM EMP**

**WHERE DEPTNO = (**

**SELECT DEPTNO FROM EMP WHERE ENAME = 'SCOTT')**

**AND ENAME <> 'SCOTT';**



10)Find the names of all employees hired in the same year as 'JAMES'



**SELECT ENAME ,HIREDATE FROM EMP**

**WHERE YEAR(HIREDATE) = (**

**SELECT YEAR(HIREDATE) FROM EMP WHERE ENAME = 'JAMES')**

**AND ENAME <> 'JAMES';**

