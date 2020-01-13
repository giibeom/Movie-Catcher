<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>admin</title>
    <link href="https://fonts.googleapis.com/css?family=Bad+Script&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link href="css/admin.css" rel="stylesheet" type="text/css">
   
    <script src="js/admin.js" type="text/javascript"></script>
    
</head>

<body>
    <header>
        <div class="topnav">
            <h1 id="title"><a href="welcome.html" style="color: white;">MOVIE CATCHER</a></h1>
        </div>
        <div class="clear"></div>
        <div class="admin_logout">
        <a href="#" class="logout">Logout</a>
        </div>

    </header>
<div class="clear"></div>

<nav class="sidebar-nav">
     <ul>
        <li>
          <a href="#"><i class="ion-bag"><img src="images/admin1.jpg"></i> <span class="nav_sub1">Board</span></a>
        </li>
        <li>
          <a href="#"><i class="ion-bag"><img src="images/admin2.jpg"></i> <span class="nav_sub2">&nbsp;User</span></a>
        </li>
    </ul>
    </nav>

<div class="clear"></div>


<!--관리자 공지사항-->
<div class="admin_board">    
<div id="main">
    <div class="container">
        <div class="container_box">
   
        <h2>공지사항</h2>
        <div class="content_box">
            <table>
                <tr>
                    <th>No.</th>
                    <th>제목</th>
                    <th>내용</th>
                    <th>기타</th>
                </tr>
                <tr>
                    <td id="table_num">1</td>
                    <td id="table_title">'무비캐쳐'는 어떤 서비스인가요?</td>
                    <td id="table_content">'무비캐쳐'는 '국내 최대 영화 예매 서비스를 제공'하는 플랫폼입니다.
                        너무나 많은 분들이 영화를 좋아하고 예매하는 과정에서 좀 더 편리하고 효율적인 예매를 하도록 도와드립니다.무비캐쳐'는 '국내 최대 영화 예매 서비스를 제공'하는 플랫폼입니다.
                        너무나 많은 분들이 영화를 좋아하고 예매하는 과정에서 좀 더 편리하고 효율적인 예매를 하도록 도와드립니다</td>
                    <td id="table_delete"><a href="b_delete.html">내용 삭제</a></div></td>
                </tr>
                <tr>
                    <td>2</td>
                    <td id="table_title">'무비캐쳐'는 어떤 서비스인가요?</td>
                    <td id="table_content">'무비캐쳐'는 '국내 최대 영화 예매 서비스를 제공'하는 플랫폼입니다.
                        너무나 많은 분들이 영화를 좋아하고 예매하는 과정에서 좀 더 편리하고 효율적인 예매를 하도록 도와드립니다.</td>
                        <td><div id="select"><a href="b_delete.html">내용 삭제</a></div></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td id="table_title">'무비캐쳐'는 어떤 서비스인가요?</td>
                    <td id="table_content">'무비캐쳐'는 '국내 최대 영화 예매 서비스를 제공'하는 플랫폼입니다.
                        너무나 많은 분들이 영화를 좋아하고 예매하는 과정에서 좀 더 편리하고 효율적인 예매를 하도록 도와드립니다.</td>
                        <td><div id="select"><a href="b_delete.html">내용 삭제</a></div></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td id="table_title">'무비캐쳐'는 어떤 서비스인가요?</td>
                    <td id="table_content">'무비캐쳐'는 '국내 최대 영화 예매 서비스를 제공'하는 플랫폼입니다.
                        너무나 많은 분들이 영화를 좋아하고 예매하는 과정에서 좀 더 편리하고 효율적인 예매를 하도록 도와드립니다.</td>
                        <td><div id="select"><a href="b_delete.html">내용 삭제</a></div></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td id="table_title">'무비캐쳐'는 어떤 서비스인가요?</td>
                    <td id="table_content">'무비캐쳐'는 '국내 최대 영화 예매 서비스를 제공'하는 플랫폼입니다.
                        너무나 많은 분들이 영화를 좋아하고 예매하는 과정에서 좀 더 편리하고 효율적인 예매를 하도록 도와드립니다.</td>
                        <td><div id="select"><a href="b_delete.html">내용 삭제</a></div></td>
                </tr>
            </table>
            <div class="content_box">
            <div id="button">
                <input type="submit" value="글 작성하기" onclick="move()">
            </div>
        </div>
        </div>
    </div>
</div>
</div>



<!--유저 관리-->
<div class="admin_user">    
    <div id="main">
        <div class="container">
            <div class="container_box">
       
            <h2>유저관리</h2>
            <div class="content_box">
                <table>
                    <tr>
                        <th>No.</th>
                        <th>아이디</th>
                        <th>이름</th>
                        <th>이메일</th>
                        <th>가입날짜</th>
                        <th>회원탈퇴</th>
                    </tr>
                    <tr>
                        <td id="user_num">1</td>
                        <td id="user_id">chloe.kim</td>
                        <td id="user_id">김나영</td>
                        <td id="user_email">nayeongahhi@gmail.com</td>
                        <td id="user_date">2020-01-01</td>
                        <td id="out">회원탈퇴</td>
                    </tr>
                    <tr>
                        <td id="user_num">1</td>
                        <td id="user_id">chloe.kim</td>
                        <td id="user_id">김나영</td>
                        <td id="user_email">nayeongahhi@gmail.com</td>
                        <td id="user_date">2020-01-01</td>
                        <td id="out">회원탈퇴</td>
                    </tr>
                    <tr>
                        <td id="user_num">1</td>
                        <td id="user_id">chloe.kim</td>
                        <td id="user_id">김나영</td>
                        <td id="user_email">nayeongahhi@gmail.com</td>
                        <td id="user_date">2020-01-01</td>
                        <td id="out">회원탈퇴</td>
                    </tr>
                    <tr>
                        <td id="user_num">1</td>
                        <td id="user_id">chloe.kim</td>
                        <td id="user_id">김나영</td>
                        <td id="user_email">nayeongahhi@gmail.com</td>
                        <td id="user_date">2020-01-01</td>
                        <td id="out">회원탈퇴</td>
                    </tr>
                </table>

            </div>
        </div>
    </div>
    </div>



</body>

<script>
    function move() {
        location.href = "b_write.html";
    }
</script>

</html>