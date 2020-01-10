
$(document).ready(function(){


// 생년월일 검증 
$("#birthChk > button").click(function(){
    var petbirth =  /^(19[0-9][0-9]|20\d{2})-(0[0-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
    var birth = $("#birth").val().trim();

    if (birth.length == 0) {
            alert("생년월일을 입력해주세요.");
        }else if(!petbirth.test(birth)) {
            alert("생년월일을 잘못 입력하셨습니다");
        } else {
            alert("생년월일 확인 완료!");
        }
    });

   
// 휴대폰번호 정규식으로 검증
$("#pNum > button").click(function(){
    var phonePat = /^\d{3}-?\d{3,4}-?\d{4}$/;
    var phoneNum = $("#pNum input").val().trim();

    if(!phonePat.test(phoneNum)) {
        alert("전화번호를 잘못 입력하셨습니다");
        $("#pNum > input").focus();
    } else {
        alert("인증 완료!");
        // TODO : 문자로 랜덤숫자 보내는기능 & 랜덤숫자 일치 여부 판단
    }
});


// 전체동의 버튼
$("#allAgree > input").click(function(){
    if($("#allAgree > input").is(":checked") == true) {
        $(".s1 > input").prop('checked',true);
    } else {
        $(".s1 > input").prop('checked',false);
    }
});

// 인증번호 검증(공백& 문자만 아니면 통과)
$("#check > button").click(function(){

    if($("#check > input").val().trim().length != 0 && $.isNumeric($("#check > input").val().trim()) ) {
        $("#check > input").val("");
        $("#check > input").attr({
            "placeholder" : "인증이 완료되었습니다",
            "disabled" : true
        });
        $("#pNum").css("background-color", "gray" );
    } else {
        alert("인증번호를 다시 확인해주세요");
    }

});

// 로그인창 이동

});