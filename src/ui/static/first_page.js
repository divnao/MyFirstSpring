$(document).ready(function () {
    $("#login_btn").bind("click", getUserInfo);
});

// get user login info.
function getUserInfo() {
    var user_id = $("#user_id").val();
    var password = $("#password").val();
    if (user_id == "" || password == "") {
        alert("用户名或密码为空， 请填写完整！");
    } else {
        // send user info to server, unfinished.
        var data = {user_id: user_id, password: password};
        alert(data);
    }
}