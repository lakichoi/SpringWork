# SpringWork

## A. 개요
Spring FrameWork를 활용한 게시판 CRUD와 AJAX/JSON을 활용한 RestAPI 방식의 댓글시스템 구현.  
<br>
<br>

## B. 구현목록
- Board   
 1.게시판 목록   
2.게시글 쓰기    
3.게시글 읽기     
4.게시글 수정   
5.게시글 삭제   

- Reply   
6.댓글 목록   
7.댓글 읽기   
8.댓글 쓰기   
9.댓글 수정   
10.댓글 삭제
<br>   
<br>   
<br>   

# 게시판 목록
![BoardList](https://user-images.githubusercontent.com/60164218/85234055-d525f880-b445-11ea-91c9-1bedb2c77cde.PNG)   
### LIST : 페이지네이션, 검색은 부트스트랩 내장 JS로 처리.   
---   
<br>   
<br>   
<br>   
<br>   

# 게시글 등록  
![BoardCreate](https://user-images.githubusercontent.com/60164218/85234051-d22b0800-b445-11ea-874b-bb30040cb8cb.PNG)   
### CREATE : addFlashAttribute()를 이용하여 중복 등록 방지.   
---
<br>   
<br>   
<br>   
<br>   

# 알림창  
![ModalCreate](https://user-images.githubusercontent.com/60164218/85235035-cf7fe100-b44c-11ea-98c4-734d26d339e9.PNG)  
### MODAL : 등록 성공 Modal창 구현. (JS if문을 활용하여 수정, 삭제 성공시 다른 Modal 메세지 출력)  
---   
<br>  
<br>   
<br>   
<br>      

# 게시글 읽기  
![BoardRead](https://user-images.githubusercontent.com/60164218/85234056-d5be8f00-b445-11ea-93ad-7ce094083e68.PNG)   
### READ : 게시글 수정 / 리스트로 이동 가능한 버튼 구현   
---   
<br>   
<br>   
<br>   
<br>   
   
# 게시글 수정  
![BoardUpdate](https://user-images.githubusercontent.com/60164218/85234057-d6572580-b445-11ea-9343-ee53e9058fc3.PNG)   
### UPDATE & DELEET: 수정완료 / 게시글삭제 / 리스트로 이동 가능한 버튼 구현   
---   
<br>   
<br>   
<br>   
<br>   
   
# 댓글 목록  
![ReList](https://user-images.githubusercontent.com/60164218/85234060-d6efbc00-b445-11ea-9580-da370cde3901.PNG)   
### REPLY LIST : AJAX / JSON을 활용하여 게시글 읽기창에서 확인가능한 댓글 목록 리스트 구현.   
---   
<br>   
<br>   
<br>   
<br>   
   
# 댓글 등록  
![ReCreate](https://user-images.githubusercontent.com/60164218/85234059-d6efbc00-b445-11ea-8f5b-6db95329e0cd.PNG)   
### Reply CREATE : Modal창을 활용하여 페이지 이동 없이 댓글 등록 기능 구현.   
---   
<br>   
<br>   
<br>   
<br>   

# 댓글 읽기  
![ReUpdateDelete](https://user-images.githubusercontent.com/60164218/85234061-d7885280-b445-11ea-9389-67c8a87f692b.PNG)   
### Reply READ & UPDATE & DELETE: 댓글을 클릭하면 수정, 삭제가능한 Modal창 구현.   
---   
<br>   
<br>   
<br>   
<br>   
<br>   

## C. 개발 환경   
- Tool   
  - OS : Window10   
  - JAVA : JDK 1.8   
  - Server : Tomcat 8.5   
  - Eclipse : 2020-03   
  - MySQL : 8.0.20   
  - Spring FrameWork   
  - Mybatis
  - BootStrap   
  - Git   
 
- Language   
  - Java 1.8   
  - SQL   
  - AJAX / JSON
  - HTML5   
  - CSS3   
  - JQuery   
  - XML   




