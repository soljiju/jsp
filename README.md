# 🌱 JSP & Servlet 기초 학습 정리

JSP와 Servlet을 공부하면서 기초부터 실습까지 진행한 내용을 정리한 레포지토리입니다. 간단한 예제부터 `jboard` 게시판 프로젝트까지, 학습 과정을 단계적으로 기록했습니다.

---

## 🏷️ 학습 내용

1. **JSP & Servlet 기본 개념**
   - JSP란? Servlet과의 차이점
   - JSP 동작 방식 (JSP → Servlet으로 변환 → 컴파일 → 실행)
   - JSP 디렉티브, 스크립트릿, 선언문, 표현식
   - Servlet 라이프사이클 (init, service, destroy)

2. **MVC 패턴 기초**
   - Model, View, Controller 역할 분리
   - DispatcherServlet 역할

3. **JDBC 기초**
   - DB 연결, Statement, PreparedStatement
   - ResultSet을 통한 데이터 처리

4. **실습: jboard 게시판**
   - 게시판 목록 (글 목록 보기)
   - 글쓰기, 글수정, 글삭제 기능
   - 게시글 상세 페이지
   - 파일 업로드 (선택적으로 구현)
   - 페이징 처리 (기초 수준)

---


---

## ⚙️ 개발 환경

- **언어**: Java (JDK 1.8 이상)
- **웹 서버**: Tomcat 9
- **DB**: MySQL (또는 MariaDB)
- **IDE**: Eclipse, VS Code (Dynamic Web Project)

---

## 📌 주요 기능 (jboard 예제)

- 회원가입 및 로그인 (선택적으로 구현)
- 게시판 글쓰기/수정/삭제/조회
- DB 연결 및 데이터 관리 (JDBC)
- JSP를 활용한 View 구성

---

## 📦 실행 방법

1. **Tomcat 서버에 배포**
   - Eclipse/IntelliJ에서 Dynamic Web Project로 실행
2. **DB 연결 정보 수정**
   - `db.properties` 또는 `web.xml` 등에서 DB 설정
3. **접속**
   - `http://localhost:8080/jboard/` 또는 `jsp-basic` 경로 등

---

## 🪄 학습 후기 및 느낀 점

- JSP와 Servlet의 관계와 역할을 명확히 이해할 수 있었음
- MVC 패턴을 적용해보며 유지보수의 중요성을 체감함
- JDBC를 통한 데이터 처리 흐름을 이해함
- 단순히 코드만 따라치는 것이 아니라, 직접 구조를 설계해보며 실력을 향상시킬 수 있었음

---

## 🙋‍♀️ 기타

- 이 레포지토리는 학습 정리용이며, 새로운 내용이 있으면 계속 업데이트 예정입니다.


