<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <script>
    function view()
    {
    	//alert("안녕");
    	window.open("문서이름","aa","width=300,height=200");
    }
  </script>
</head>
<body> <!-- html_anchor.jsp -->
  <!-- a태그 : hyper기능을 하는 태그 , href속성을 통해서 원하는 문서,url로 이동 -->
  <!-- a태그에 href속성이 있으면 기본패턴 => 밑줄, 파란색  -->
  <!--                      브라우저에서 다녀온 문서,url은 보라색으로 표시   -->
  <a href="first.jsp"> 처음만든문서 </a> <p> <!-- 같은 사이트내의 문서로 이동 => 경로/문서명 -->
  <a href="http://www.naver.com"> 네이버 </a> <p>
  <a href="http://www.imbc.com"> mbc </a> <p>
  <a href="http://www.coupang.com" target="_blank"> 쿠팡 </a> <p>
  <a href="http://kurly.com" target="aa">컬리</a>
  <hr> <!-- a태그의 속성 : target: _self, _parent, _top , _blank  -->
  <hr>
  <!-- a태그에서 자바스크립트 함수를 호출할 수 있다. -->
  <a href="javascript:view()"> 하하하 </a>
</body>
</html>