<div>
  <h1>강남 Korea IT Academy에서 팀을 꾸려서 제작한 영화 정보 소개 및 좌석 결제 사이트입니다.</h1>
  <h1>CGV의 자리정보를 크롤링하여 좌석을 생성하고 여러 영화 Database 사이트로부터 영화 정보를 받아옵니다.</h1>
</div>



우선 사이트에 처음 방문하신다면 welcome 페이지에 들어가게 됩니다.

마우스 스크롤을 내리거나 하단의 버튼을 누르면 다음 이미지로 이동이 되며 마지막 이미지에 도달한다음 Welcome Movie Catcher! 를 클릭할 시
메뉴가 등장합니다. 또한 이 메뉴는 제일 상단의 햄버거 버튼을 클릭하였을때도 등장합니다.


<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121695-f9fda280-1ef2-11eb-8679-0dbeb9791cdc.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121699-fa963900-1ef2-11eb-924c-2835ceba099e.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121703-fb2ecf80-1ef2-11eb-9dd3-3ca08c463bd1.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121705-fbc76600-1ef2-11eb-9198-e7f9ea73565a.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121709-fc5ffc80-1ef2-11eb-8bd6-7d43a4bb0068.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121712-fcf89300-1ef2-11eb-9cc4-37c4c3c20f0b.png" width="100%"></img>
</div>





회원가입을 해야 메인 페이지에 들어올 수 있게 설정을 하였으므로 우선 회원가입을 진행합니다.





<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121429-a0957380-1ef2-11eb-9230-8913d45056ad.png" width="100%"></img>
</div>





중간의 생년월일 확인은 필수이며




<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121426-a0957380-1ef2-11eb-9d2a-c09b3d925dac.png" width="100%"></img>
</div>




휴대폰 정보를 입력한 뒤 인증번호를 입력하면 인증 완료가 됩니다.





<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121431-a12e0a00-1ef2-11eb-9d35-17f93fc8a268.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121432-a12e0a00-1ef2-11eb-97d3-7eb913063708.png" width="100%"></img>
</div>






회원가입을 완료하였다면 메인페이지에 들어가게 됩니다.

메인페이지에서는 Movie DB와 한국영화진흥원에서 제공하는 API를 사용하여 영화 순위 정보 및 영화 예고편, 포스터정보를 받아옵니다.

<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121581-d5092f80-1ef2-11eb-9674-6eaecc90f2f3.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121583-d5a1c600-1ef2-11eb-9db5-d57768e4b6b4.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121570-cfabe500-1ef2-11eb-8185-07b910e3b662.png" width="100%"></img>
</div>


최신 상영작과 상영 예정작에 대한 정보를 알 수 있으며 해당 포스터나 영화 제목을 클릭할 시 영화 정보 페이지로 이동합니다.


<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121414-9bd0bf80-1ef2-11eb-81c2-36c7502e73ff.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121422-9f644680-1ef2-11eb-938c-668312432edb.png" width="100%"></img>
</div>


영화 정보 페이지에서는 영화에 대한 줄거리, 영화 감독, 배우, 장르, 러닝타임 및 개봉일에 대한 정보를 알 수 있으며 스킬컷과 해당 영화에 대한 
다른 유저들이 작성한 리뷰를 볼 수 있습니다.
영화에 대한 정보들은 Movie DB와 한국영화진흥원에서 제공하는 API에서 필요한 정보들을 조합하여 가져왔습니다.






영화관의 위치 정보를 알 수 있고 해당 영화를 지도에서 찾아볼 수 있는 극장 페이지에서 자신이 영화를 볼 극장을 선택할 수 있습니다.
<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121579-d5092f80-1ef2-11eb-88f9-ad38882c66e7.png" width="100%"></img>
</div>





예약 페이지에서는 지역 및 극장을 선택할 수 있고 CGV극장의 좌석 정보를 크롤링한 다음 해당 정보를 이용하여 좌석을 생성하고 유저가 선택할 수 있습니다.
우선 예약하기 위한 극장 및 영화와 시간대를 선택합니다.

<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121635-e7836900-1ef2-11eb-8386-8aaff0d9ca21.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121637-e8b49600-1ef2-11eb-96c0-d2c03f58eee6.png" width="100%"></img>
</div>


그런다음 영화를 볼 사람(성인, 학생, 우대)의 인원을 입력하고 좌석을 선택합니다.


<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121640-e94d2c80-1ef2-11eb-8cf1-c57d20a73ea7.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121641-e9e5c300-1ef2-11eb-90de-b994845e9812.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121643-ea7e5980-1ef2-11eb-9c2d-e81677be5026.png" width="100%"></img>
</div>



좌석 다시 선택하기 버튼을 클릭하여 좌석을 다시 선택할 수 있습니다.





결제하기 버튼을 누르게되면 결제 화면으로 이동합니다.

<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121645-ea7e5980-1ef2-11eb-9550-9dd078871836.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121649-eb16f000-1ef2-11eb-929d-85cbbbf11def.png" width="100%"></img>
</div>



모든 정보를 입력한 뒤 결제하기 버튼을 클릭하면 결제가 진행되고 마이페이지의 예매내역 페이지로 이동합니다.



<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121612-dfc3c480-1ef2-11eb-8063-e7189f5d8c98.png" width="100%"></img>
</div>
예약 내역 페이지에서는 예약을 취소 할 수 있으며 영화에 대한 리뷰도 작성할 수 있습니다.
<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121616-e0f4f180-1ef2-11eb-9018-60485d38701f.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121617-e18d8800-1ef2-11eb-8890-fb0cb72da590.png" width="100%"></img>  
</div>





마이페이지에서는 또한 자신의 정보를 수정할 수 있으며 예약내역, 자신이 작성한 리뷰를 볼 수 있습니다.

<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121607-de929780-1ef2-11eb-8dcf-5d63781c27e4.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121614-e05c5b00-1ef2-11eb-9361-d7511cda716c.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121618-e18d8800-1ef2-11eb-9c74-8eeefdb68c84.png" width="100%"></img>
</div>




리뷰 페이지에서는 다른 사람들이 작성한 리뷰들을 볼 수 있으며 해당 리뷰는 또한 영화 정보 페이지에서도 확인 할 수 있습니다.


<div>
  <img src="https://user-images.githubusercontent.com/59248334/98121675-f2d69480-1ef2-11eb-8938-811369caabb5.png" width="100%"></img>
  <img src="https://user-images.githubusercontent.com/59248334/98121694-f9650c00-1ef2-11eb-8e8d-fd333281fc51.png" width="100%"></img>
</div>


<div>
  <h3>이 프로젝트에서 제가 기여한 부분은 백앤드의 총괄적인 과 메인페이지의 프론트 부분, 예약페이지의 좌석부분과 결제하기 부분입니다.</h3>
</div>
  
