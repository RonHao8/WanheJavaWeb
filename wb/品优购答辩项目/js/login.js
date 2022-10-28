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
        if (flagPassword && flagPhone){
            if (checkBox.prop("checked")){
                password.val($.md5(password.val()))
                $("#loginForm").submit()
            }else {
                alert("请勾选用户知晓协议")
            }
        }
    })
})

function check_Phone(){
    $.ajax({
        type:"GET",
        url:"/login.do?method=checkPhone",
        data:{
            phone:phone.val()
        },
        dataType:"json",
        success:function(data){
            if(data.result === "true"){
                flagPhone = false
                log_error(spanPhone, iPhone, emPhone, "该手机号未注册");
            }else {
                flagPhone = true
                log_success(spanPhone, iPhone, emPhone, "");
            }
        },
        error:function (){
            alert("checkPhone：ajax请求失败")
        }
    });
}
function check_Password(){
    if (password.val() !== ""){
        flagPassword = true
        log_success(spanPassword, iPassword, emPassword ,"")
    }else {
        flagPassword = false
        log_error(spanPassword, iPassword, emPassword ,"密码不能为空")
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
function log_error(span, i, em, text){
    span.removeClass();
    i.removeClass();
    span.addClass("error");
    i.addClass("error_icon");
    em.html("");
    em.html(text);
}