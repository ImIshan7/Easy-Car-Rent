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


   /*Driver ID Generator*/

function generateDriverID() {
    $("#user_Id").val("DRI-001");
    $.ajax({
        url: driverBaseUrl + "driver/driverIdGenerate",
        method: "GET",
        contentType: "application/json",
        dataType: "json",
        success: function (resp) {
            let id = resp.value;
            console.log("id" + id);
            let tempId = parseInt(id.split("-")[1]);
            tempId = tempId + 1;
            if (tempId <= 9) {
                $("#user_Id").val("DRI-00" + tempId);
            } else if (tempId <= 99) {
                $("#user_Id").val("DRI-0" + tempId);
            } else {
                $("#user_Id").val("DRI-" + tempId);
            }
        },
        error: function (ob, statusText, error) {
        }
    });
}