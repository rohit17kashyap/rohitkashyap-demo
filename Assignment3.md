1 How can you find only the departments that currently have no employees assigned to them?



**SELECT D.DEPTNO, D.DNAME**

**FROM DEPT D**

**LEFT JOIN EMP E ON D.DEPTNO = E.DEPTNO**

**WHERE E.EMPNO IS NULL;**



2.List Employees Who Are Both Managers and Analysts (Using INTERSECT)**(INTERSECT IS NOT SUPPORTED IN MYSQL)** 



**SELECT ENAME**

**FROM EMP**

**WHERE JOB = 'MANAGER'**

**AND JOB = 'ANALYST';**



3.Employees Who Work in Same Department as ‘SCOTT’ and ‘KING’(Using INTERSECT)**(INTERSECT IS NOT SUPPORTED IN MYSQL)**



**SELECT ENAME** 

**FROM EMP**

**WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME='SCOTT')**

**AND DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME='KING');**



4.List Employees in Dept 10 or Having Salary > 3000 (Using UNION)



**SELECT EMPNO , ENAME FROM EMP WHERE DEPTNO = 10**

**UNION**

**SELECT EMPNO , ENAME FROM EMP WHERE SAL > 3000;**



5.Find Employees Who Do NOT Belong to Any Department



**SELECT E.EMPNO, E.ENAME**

**FROM EMP E**

**LEFT JOIN DEPT D ON E.DEPTNO = D.DEPTNO**

**WHERE D.DEPTNO IS NULL;**



6.List Departments with Total Salary Greater Than 2000



**SELECT DEPTNO,SUM(SAL) AS TOTAL\_SAL FROM EMP** 

**GROUP BY DEPTNO**

**HAVING SUM(SAL) > 2000;**



7.Show Dept with Highest Total Salary



**SELECT DEPTNO, SUM(SAL) AS TOTAL\_SAL**

**FROM EMP**

**GROUP BY DEPTNO**

**ORDER BY TOTAL\_SAL DESC**

**LIMIT 1;**



8.Display Total Commission Paid Department-wise



**SELECT DEPTNO, SUM(IFNULL(COMM,0)) AS TOTAL\_COMM**

**FROM EMP**

**GROUP BY DEPTNO;**



9.Show Departments Where Average Salary is Greater Than Overall Average



**SELECT DEPTNO , AVG(SAL) FROM EMP**

**GROUP BY DEPTNO**

**HAVING AVG(SAL) > (SELECT AVG(SAL) FROM EMP);**



10.Departments Where At Least One Employee Earns More Than 4000



**SELECT DEPTNO**

**FROM EMP**

**GROUP BY DEPTNO**

**HAVING MAX(SAL) > 4000;**







