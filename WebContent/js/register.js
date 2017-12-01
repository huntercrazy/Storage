function validateName(){
				var nameTag = document.getElementById("name");
				var nameMsgSpan = document.getElementById("nameMsgSpan");
				if(nameTag.value.trim()==""){
					nameMsgSpan.style.display="inline";
					nameTag.focus();
					return false;
				}else{
					nameMsgSpan.style.display="none";
					return true;
				}
			}

function validaterePassword(){
				var passwordTag = document.getElementById("password");
				var repasswordTag = document.getElementById("repassword");
				var repasswordMsgSpan = document.getElementById("repasswordMsgSpan");
				if(passwordTag.value.trim()!=repasswordTag.value.trim()){
					repasswordMsgSpan.style.display="inline";
					repasswordTag.focus();
					return false;
				}else{
					repasswordMsgSpan.style.display="none";
					return true;
				}
			}

function validatePassword(){
				var passwordTag = document.getElementById("password");
				var passwordMsgSpan = document.getElementById("passwordMsgSpan");
				if(passwordTag.value.trim()==""){
					passwordMsgSpan.style.display="inline";
					passwordTag.focus();
					return false;
				}else{
					passwordMsgSpan.style.display="none";
					return true;
				}
			}

function displayPassword(){
				var repasswordMsgSpan = document.getElementById("repasswordMsgSpan");
				repasswordMsgSpan.style.display="none";
			}
			
function validate(){
				if(validateName()){
				
					if(validaterePassword()){
						if(validatePassword()){
							return true;
						}else{
							return false;
						}
					}else{
						return false;
					}
				}else{
					return false;
				}
		}