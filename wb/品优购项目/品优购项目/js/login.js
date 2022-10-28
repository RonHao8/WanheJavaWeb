var phone = $("#phone")
var spanPhone = $("#span-phone")
var iPhone = $("#i-phone")
var emPhone = $("#em-phone")

var password = $("#password")
var spanPassword = $("#span-password")
var iPassword = $("#i-password")
var emPassword = $("#em-password")

var checkBox = $("#checkbox")

var flagPhone = false
var flagPassword = false

$(function (){
    phone.bind("blur",function (){
        check_Phone()
    })
    password.bind("focus", function (){
 }).bind("blur", function (){
        check_Password()
    })
    $("#login-btn").on("click", function (){
        check_Phone()
        check_Password()
        if (flagPassword && flagPhone){
            if (checkBox.prop("checked")){
location.replace("首页.html")
            }else {
                alert("请勾选用户知晓协议")
            }
        }
    })
})

function check_Phone(){
 var phone = document.getElementById('phone').value;
        if(!(/^1\d{10}$/.test(phone))){
            log_error(spanPhone, iPhone, emPhone, "该手机号格式不正确");
            οnblur="hanshu(this)"
            }
            else{
            flagPhone=true
            log_success(spanPhone, iPhone, emPhone,"")
            }
}
function check_Password(){
var reg = new RegExp(/^(?![^a-zA-Z]+$)(?!\D+$)/);
var password1 = document.getElementById('password').value;

 if(password1==""){
        flagPassword = false
        log_error(spanPassword, iPassword, emPassword ,"密码不为空")
    }
    else{
    if (reg.test(password1)){
    flagPassword = true
     log_success(spanPassword, iPassword, emPassword ,"")
}
else{
flagPassword = false
    log_error(spanPassword, iPassword, emPassword ,"密码需要同时有数字和字母")

}
}

}

function log_success(span, i, em, text){
    span.removeClass();
    i.removeClass();
    span.addClass("success");
    i.addClass("success_icon");
    em.html("");
    em.html(text);
}
function log(span, i, em, text){
    span.removeClass();
    i.removeClass();
    span.addClass("");
    i.addClass("");
    em.html("");
    em.html(text);
}
function log_error(span, i, em, text){
    span.removeClass();
    i.removeClass();
    span.addClass("error");
    i.addClass("error_icon");
    em.html("");
    em.html(text);
}