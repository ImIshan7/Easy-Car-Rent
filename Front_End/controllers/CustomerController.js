let baseUrlLogin ="http://localhost:8087/Easy_Car_Rent_war/";


loadAllRegUsers();
$("#btnSaveCustomer").attr('disabled', true);
$("#btnUpdateCustomer").attr('disabled', true);
$("#btnDeleteCustomer").attr('disabled', true);



/*Customer Save*/

$("#btnSaveCustomer").click(function () {
    let formData = new FormData($("#customerForm")[0]);
    console.log(formData);
    $.ajax({
        url: userBaseUrl + "reg_User",
        method: "post",
        data: formData,
        contentType: false,
        processData: false,
        success: function (res) {
            saveUpdateAlert("User", res.message);
            loadAllRegUsers();
        },
        error: function (error) {
            unSuccessUpdateAlert("User", JSON.parse(error.responseText).message);
        }
    });
});