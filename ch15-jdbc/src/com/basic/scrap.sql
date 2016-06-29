--DBA로 로그인
sqlplus system/oracle_11g

--사용자 생성
CREATE USER user01 IDENTIFIED BY oracle_11g;

--권한부여
Grant DBA To user01;

--생성한 사용자로 로그인
conn user01 /oracle_11g;

-- com.basic, com.transaction 테스트용 오라클 테이블 생성
CREATE TABLE test1(id varchar2(10) NOT NULL, age number(3) NOT NULL);
