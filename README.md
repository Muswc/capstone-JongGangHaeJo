# 재능대학교 캡스톤 게시판 서비스

<table>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/1f523fa9-dfbe-4c54-bb1a-710ef36c3cd5" alt="메인 화면" width="400"/></td>
    <td><img src="https://github.com/user-attachments/assets/a129f5ec-7d06-4d75-992c-52ff38c5c9b0" alt="작품 목록" width="400"/></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/0d16ea94-cb90-4108-b3d3-be3143e429c6" alt="게시물 상세보기" width="400"/></td>
    <td><img src="https://github.com/user-attachments/assets/0ab6adcf-dd17-44c9-934e-ea69289f2b89" alt="게시물 상세보기 하단" width="400"/></td>
  </tr>
</table>

## 소개
대학교 캡스톤 프로젝트 전시를 위한 웹 플랫폼입니다. 학생들의 프로젝트 작품을 등록하고 공유할 수 있는 공간을 제공합니다.

## 주요 기능

### Backend
- 게시물 관리 (CRUD)
  - 파일 첨부 (이미지, 문서)
  - 썸네일 자동 생성
  - 조회수 기능
- 사용자 인증
  - JWT 기반 인증
  - 이메일 인증
  - 아이디/비밀번호 찾기
- 댓글 시스템
  - 계층형 댓글 (대댓글) 지원
- 공지사항 관리
- API 문서화 (Spring REST Docs)

### Frontend
- 반응형 웹 디자인 (모바일 지원)
- 프로젝트 목록/상세 페이지
  - 썸네일 갤러리 뷰
- 실시간 댓글 시스템
- 파일 업로드 UI
  - 이미지 미리보기
- 사용자 인증 UI
  - 로그인/회원가입
  - 비밀번호 찾기

## 기술 스택

### Backend
- Java 17
- Spring Boot 3.3.3
- Spring Security + JWT
- Spring Data JPA
- MySQL
- AWS (S3, EC2, RDS)
- Docker
- Jenkins (CI/CD)

### Frontend
- HTML5
- CSS3
- Vanilla JavaScript
- RESTful API 통신

## 프로젝트 구조

├── main/
│   ├── java/
│   │   └── jeiu/capstone/jongGangHaejo/
│   │       ├── config/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       └── security/
│   └── resources/
│       └── application.yml
