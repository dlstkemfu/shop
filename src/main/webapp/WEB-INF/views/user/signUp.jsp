<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> 
<meta charset="UTF-8">
<title>회원 가입</title>
<script type="text/javascript">

function signUpValidation(){
	
	var userId = $("#userId").val();
	var userPw = $("#password").val();
	var userPwCheck = $("#passwordCheck").val();
	var phone = $("#phone").val();
	var email = $("#email").val();
	var gender = $("#gender").val();
	var birth = $("#birth").val();
	
	
	if(!userId){
		alert("아이디 입력은 필수입니다.");
		$("#userId").focus();
	}else if(!userPw){
		alert("비밀번호 입력은 필수입니다.");
		$("#password").focus();
	}else if(!userPwCheck){
		alert("비밀번호 확인 입력은 필수입니다.");
		$("#passwordCheck").focus();
	}else if(userPw != userPwCheck){
		alert("비밀번호가 맞지 않습니다.");
		$("#userPwCheck").focus();		
	}else if(!email){
		alert("이메일 입력은 필수입니다.");
		$("#email").focus();
	}else {
		signUp()
	}
	
}

function signUp(){
	
	$.ajax({
		
		url : "/jquery/signUp",
		type:'POST',
		data :  $("#registerform").serialize(),
		success:function(data){
			if(data == 1){
				alert("회원가입이 완료됐습니다.^^");
				location.href = "/user/login"
			}else if(data == 2){
				alert("이미 존재하는 아이디입니다.");
				return false;
			}
		}
		
	})
}

</script>
</head>
<body style="background-color:#f0f5f3">
<form id="registerform">
        <div class="fieldlabel"><label for="userId">*아이디</label></div>
        <div class="formfield"><input type="text" id="userId" name="userId" maxlength="20" value=""></div>
        
        <div class="fieldlabel"><label for="password">*패스워드</label></div>
        <div class="formfield">
<input type="password" id="password" name="password" maxlength="20" autocomplete="off">
</div>

        <div class="fieldlabel"><label for="passwordCheck">패스워드확인</label></div>
        <div class="formfield">
        
<input type="password" id="passwordCheck" name="passwordCheck" maxlength="20" autocomplete="off">
</div>
       
        <div class="fieldlabel"><label for="birth">*생년월일</label></div>
        <div class="formfield"><input type="text" id="birth" name="birth" maxlength="20" value=""></div>
        
        <div class="fieldlabel"><label for="phone">*전화번호</label></div>
        <div class="formfield"><input type="text" id="phone" name="phone" maxlength="20" value=""></div>
        
        <div class="fieldlabel"><label for="gender">*성별</label></div>
        <div class="formfield"><input type="text" id="gender" name="gender" maxlength="20" value=""></div>

        <div class="fieldlabel"><label for="email">*이메일</label></div>
        <div class="formfield"><input type="text" id="email" name="email" size="20" maxlength="20" 
             value="" autocomplete="off"><span>@</span>
            <input id="domain" list="domains" name="domain" placeholder="도메인입력/선택">
            <datalist id="domains">
                <option value="naver.com">
                <option value="daum.net">
                <option value="gmail.com">
                <option value="yahoo.co.kr">
            </datalist>
        </div>
       
        <div class="btnfield">
            <input type="button" onclick="signUpValidation()" value="회원가입">
        </div>
    </form>
</body>
</html>