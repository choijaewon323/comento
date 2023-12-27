# SQL 작성 과제
### 1. 월별 접속자 수
```
SELECT
	COUNT(*) AS TOTCNT
FROM
	STATISTC.REQUESTINFO AS RI
WHERE
	SUBSTR(RI.CREATEDATE, 3, 2) = #{MONTH}
```

### 2. 일자별 접속자 수
```
SELECT
	COUNT(*) AS TOTCNT
FROM
	STATISTC.REQUESTINFO AS RI
WHERE
	SUBSTR(RI.CREATEDATE, 5, 2) = #{DAY}
```

### 3. 평균 하루 로그인 수
```
SELECT
	AVG(*) AS AVGCNT
FROM
	(SELECT
		COUNT(*) AS TOTCNT
	FROM
		STATISTC.REQUESTINFO AS RI
	GROUP BY
		RI.CREATEDATE) AS TEMP
```

### 4. 휴일을 제외한 로그인 수 (적용 X)
```
SELECT
	COUNT(*) AS TOTCNT
FROM
	STATISTC.REQUESTINFO AS RI
```

### 5. 부서별 월별 로그인 수
```
SELECT
	COUNT(*) AS TOTCNT
FROM
	STATISTC.REQUESTINFO AS RI
    	INNER JOIN STATISTC.USER AS U
    	ON RI.USERID = U.USERID
WHERE
        U.HR_ORGAN = #{ORGAN} AND
        SUBSTR(RI.CREATEDATE, 5, 2) = #{MONTH}
```

# 3차 과제 주간 보고
1. Spring Boot 환경 세팅
- Spring Boot 환경 세팅 (완료)
	- Java 8
	- Spring Boot 2.2.2
	- Spring Web
	- Spring Boot DevTools
	- Lombok 1.16.20
	- mybatis-spring-boot-starter 2.1.3

2. 20년도 API 개발
- statistc 데이터베이스 및 하위 테이블 생성 (완료)
- ResponseBody를 활용한 20년도 API 개발 (완료)
4. SQL 과제
- 월별 접속자 수, 일자별 접속자 수, 평균 하루 로그인 수, 휴일을 제외한 로그인 수, 부서별 월별 로그인 수 SQL 작성 (완료)
