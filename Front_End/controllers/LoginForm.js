let baseUrlLogin ="http://localhost:8087/Back_End_war/";


/*Load All Method*/

$("#btnLogin").on('click', function () {
    login();
});


function login() {
    let loginRole_Type = $("#role_Type").val();
    let loginUserName = $("#user_Name").val();
    let loginPassword = $("#password").val();

    $.ajax({
        url: baseUrlLogin + "loginForm",
        contentType: "application/json",
        dataType: "json",
        success: function (res) {
            for (var login of res.data) {
                if (loginRole_Type === login.role_Type && loginUserName === login.user_Name && loginPassword === login.password) {
                    if (loginRole_Type === "DRIVER" && loginUserName === login.user_Name && loginPassword === login.password) {
                        $.ajax({
                            url: baseUrlLogin + "loginForm/?username=" + loginUserName + "&password=" + loginPassword,
                            data: res.data,
                            method: "get",
                            success: function (res1) {
                            }
                        })

                        window.location.href = 'DriverDashboard.html';


                    } else if (loginRole_Type === "REGISTERED_USER" && loginUserName === login.user_Name && loginPassword === login.password) {
                        $.ajax({
                            url: baseUrlLogin + "loginForm/?username=" + loginUserName + "&password=" + loginPassword,
                            data:res.data,
                            method:"get",
                            success:function (res1) {
                            }
                        });

                        window.location.href = 'CustomerDashboard.html';
                    } else if (loginRole_Type === "ADMIN" && loginUserName === login.user_Name && loginPassword === login.password) {
                        window.location.href = 'AdminDashboard.html';
                    }
                    return;
                }
            }
        }

    });
}