<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <meta name="viewport" content="width=device-width,initial-scale=1"> -->
<title>코딩 전문가를 만들기 위한 온라인 강의 시스템</title>
<link href="/css/admin/layout.css" type="text/css" rel="stylesheet" />
<style>
    
    #visual .content-container{	
        height:inherit;
        display:flex; 
        align-items: center;
        
        background: url("/images/mypage/visual.png") no-repeat center;
    }
</style>
</head>
<body>
	<!-- header 부분 -->

    <header id="header">
        
        <div class="content-container">
            <!-- ---------------------------<header>--------------------------------------- -->

            <h1 id="logo">
                <a href="/index.html">
                    <img src="/images/logo.png" alt="뉴렉처 온라인" />

                </a>
            </h1>

            <section>
                <h1 class="hidden">헤더</h1>

                <nav id="main-menu">
                    <h1>메인메뉴</h1>
                    <ul>
                        <li><a href="/guide">학습가이드</a></li>

                        <li><a href="/course">강좌선택</a></li>
                        <li><a href="/answeris/index">AnswerIs</a></li>
                    </ul>
                </nav>

                <div class="sub-menu">

                    <section id="search-form">
                        <h1>강좌검색 폼</h1>
                        <form action="/course">
                            <fieldset>
                                <legend>과정검색필드</legend>
                                <label>과정검색</label>
                                <input type="text" name="q" value="" />
                                <input type="submit" value="검색" />
                            </fieldset>
                        </form>
                    </section>

                    <nav id="acount-menu">
                        <h1 class="hidden">회원메뉴</h1>
                        <ul>
                            <li><a href="/index.html">HOME</a></li>
                            <li><a href="/member/login.html">로그인</a></li>
                            <li><a href="/member/agree.html">회원가입</a></li>
                        </ul>
                    </nav>

                    <nav id="member-menu" class="linear-layout">
                        <h1 class="hidden">고객메뉴</h1>
                        <ul class="linear-layout">
                            <li><a href="/member/home"><img src="/images/txt-mypage.png" alt="마이페이지" /></a></li>
                            <li><a href="/notice/list.html"><img src="/images/txt-customer.png" alt="고객센터" /></a></li>
                        </ul>
                    </nav>

                </div>
            </section>

        </div>
        
    </header>

	<!-- --------------------------- <visual> --------------------------------------- -->
	<!-- visual 부분 -->
	
	<div id="visual">
		<div class="content-container"></div>
	</div>
	<!-- --------------------------- <body> --------------------------------------- -->
	<div id="body">
		<div class="content-container clearfix">

			<!-- --------------------------- aside --------------------------------------- -->
			<!-- aside 부분 -->
			


			<aside class="aside">
				<h1>MY PAGE</h1>
				
				<nav class="menu text-menu first margin-top">
					<h1>온라인 강의실</h1>
					
				</nav>
				
				<nav class="menu text-menu">
					<h1>커뮤니티</h1>
					<ul>												
						<li><a  class="" href="/student/community/answeris">내 Answer</a></li>
																														
					</ul>
				</nav>
				
				<nav class="menu text-menu">
					<h1>고객센터</h1>
					<ul>
						
						<li><a class="active" href="/student/helpdesk/question">1:1 수강문의 및 답변확인</a></li>
						<li><a class="active" href="/student/newlec/edit">개인정보수정</a></li>
						<li><a class="active" href="/student/newlec/pwd">비밀번호 재설정</a></li>																							
					</ul>	
				</nav>
				
				<nav class="menu text-menu">
					<h1>결제정보</h1>
					<ul>
						<li><a href="/student/payment/ordered">주문정보</a></li>
						<li><a href="/student/payment/coupon">쿠폰함</a></li>
						<li><a href="/student/payment/point">포인트</a></li>
					</ul>
				</nav>
								
			</aside>
			<!-- --------------------------- main --------------------------------------- -->
			
			<!-- content 부분 -->
			
	



<main class="main">
	<h2 class="main title">newlec 님 환영합니다.</h2>
	
	<div class="breadcrumb">
		<h3 class="hidden">경로</h3>
		<ul>
			<li>Home</li>
			<li>마이페이지</li>
			<li>수강생홈</li>
		</ul>
	</div>
	
	<div class="-list- vertical margin-top first padding-bottom">
	
		<h3 class="hidden">안녕하세요. 뉴렉처입니다.</h3>
		<div>
			<h4 class="-border- all green radius -text- center -padding- -text- bold">뉴렉처 이벤트 소식</h4>
			
			
			
			<div class="-padding- -border- bottom b-green -text- center underline">
				<a href="../customer/event/1" class="-symbol-">회원정보 수정 이벤트</a>
			</div>
			
			
		</div>
		
		<div class="align-center margin-top">
		
			<span style="display:inline-block; background:url('../images/profile.png') no-repeat center; background-size:cover ;vertical-align:middle; width: 120px;height: 120px;border: 1px solid #595959; border-radius:60px; box-shadow: 0 4px 15px 0 rgba(0, 0, 0, 0.15);"></span>
		
		
		</div>
		
		<div class="-margin- top">
			<table class="table -border- top orange">
				<tr>
					<th colspan="2" class="-text- bold orange">
						내 수강 요약정보
					</th>
				</tr>
				<tr>
					<td class="-border- right -reset- line-height -padding-">
						<div>현재 수강중인 강좌</div>
						<div><span class="-text- orange">1</span> 개</div>
						<div class="-margin- top"><a class="-text- underline" href="course/taking">내 강의장으로 가기</a></div>
					</td>
					<td class="-border- -reset- line-height -padding-">
						<div>최근 1주일 1:1 문의 결과</div>
						<div><span class="-text- orange">0</span> / 0</div>
						<div class="-margin- top"><a class="-text- underline" href="helpdesk/question">문의 게시판으로 가기</a></div>
					</td>
				</tr>
				<!-- <tr>
					<th colspan="3" class="-text- bold">
						총 누적자산 : 포인트 <span class="-text- orange">21,200</span> 원, 쿠폰 <span class="-text- orange">2</span>장
					</th>
				</tr> -->
			</table>
		</div>
		<!-- ----- 강의 플레이어 버튼 ----------------------------------------------------------------------- -->
		<div class="-margin- top -inline- center">
			<div class="player">
				<a target="_blank" href="course/player">강의 플레이어 실행</a>
			</div>
		</div>
		<!-- -------------------------------------------------------------------------------------------------------------------------- -->
		
		<div class="-margin- top t40">
			<table class="table">
				<tr>
					<th colspan="2" class="-text- bold">
						내 자산 요약정보
					</th>
				</tr>
				<tr>					
					<td class="-border- right -reset- line-height -padding-">
						<div class="margin-top">내 포인트</div>
						<div><span class="-text- orange">20,800</span> P</div>
						<div class="-margin- top"><a class="-text- underline" href="payment/point">포인트 기록 보기</a></div>
						<div class="-margin- top">(매일 로그인만 해도 포인트가 쑥쑥!)<br />&nbsp;</div>
					</td>
					
					<td class="-reset- line-height -padding-">
						<div>쿠폰</div>
						<div><span class="text-strong color-warning">0</span> / <span class="text-strong color-strong">5</span></div>
						<div class="-margin- top"><a class="-text- underline" href="payment/coupon">쿠폰함 보기</a></div>
						<div class="-margin- top">(뉴렉처 이벤트로 쌓이는 쿠폰)<br />&nbsp;</div>
					</td>
				</tr>
				<tr>
					<th colspan="2" class="-text- bold">
						현재 총 자산 : 포인트 <span class="-text- orange">20,800</span> P, 쿠폰 <span class="-text- orange">0</span> 장
					</th>
				</tr>
			</table>
		</div>
	</div>
	
</main>
			
		</div>
	</div>
	<!-- ------------------- <footer> --------------------------------------- -->
	

        <footer id="footer">
            <div class="content-container">
                <h2 id="footer-logo"><img src="/images/logo-footer.png" alt="회사정보"></h2>
    
                <div id="company-info">
                    <dl>
                        <dt>주소:</dt>
                        <dd>서울특별시 </dd>
                        <dt>관리자메일:</dt>
                        <dd>admin@newlecture.com</dd>
                    </dl>
                    <dl>
                        <dt>사업자 등록번호:</dt>
                        <dd>111-11-11111</dd>
                        <dt>통신 판매업:</dt>
                        <dd>신고제 1111 호</dd>
                    </dl>
                    <dl>
                        <dt>상호:</dt>
                        <dd>뉴렉처</dd>
                        <dt>대표:</dt>
                        <dd>홍길동</dd>
                        <dt>전화번호:</dt>
                        <dd>111-1111-1111</dd>
                    </dl>
                    <div id="copyright" class="margin-top">Copyright ⓒ newlecture.com 2012-2014 All Right Reserved.
                        Contact admin@newlecture.com for more information</div>
                </div>
            </div>
        </footer>
</body>
</html>