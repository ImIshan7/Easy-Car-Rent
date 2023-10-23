let driverBaseUrl ="http://localhost:8087/Easy_Car_Rent_war/";

loadAllDrivers();

$("#btnSaveDriver").attr('disabled', true);
$("#btnUpdateDriver").attr('disabled', true);
$("#btnDeleteDriver").attr('disabled', true);

/*Driver Save*/
$("#btnSaveDriver").click(function () {
    let formData = new FormData($("#driverForm")[0]);
    console.log(formData);
    $.ajax({
        url: driverBaseUrl + "driver",
        method: "post",
        data: formData,
        contentType: false,
        processData: false,
        success: function (res) {
            console.log(res)
            saveUpdateAlert("Driver", res.message);
            loadAllDrivers();
        },
        error: function (error) {
            unSuccessUpdateAlert("Driver", JSON.parse(error.responseText).message);
        }
    });
});