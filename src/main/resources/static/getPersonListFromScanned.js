GET:$(document).ready(
    function () {
        // GET Request
        $("#searchUser").submit(function (event) {
            event.preventDefault();
            getPersonrDataByScanned();
        });

        function getPersonrDataByScanned() {
            var scannedBy = $("#scannedBy").val();
            console.log(scannedBy);
            $.ajax({
                type: "GET",
                url: "/getListOfPersonalDataFromScanned" + "/" + scannedBy,
                success: function (result) {
                    $('#personList tbody tr').empty();
                    $.each(result, function (i, personList) {
                        console.log(result);
                        var person = '<tr>' +
                            '<td id="personDetailId">' + personList.personDetailId + '</td>' +
                            '<td id="personGeneralId">' + personList.personGeneralId + '</td>' +
                            '<td>' + personList.email + '</td>' +
                            '<td>' + personList.email2 + '</td>' +
                            '<td>' + personList.firstName + '</td>' +
                            '<td>' + personList.middleName + '</td>' +
                            '<td>' + personList.lastName + '</td>' +
                            '<td>' + personList.address1 + '</td>' +
                            '<td>' + personList.address2 + '</td>' +
                            '<td>' + personList.address3 + '</td>' +
                            '<td>' + personList.cityId + '</td>' +
                            '<td>' + personList.stateId + '</td>' +
                            '<td>' + personList.countryId + '</td>' +
                            '<td>' + personList.companyName + '</td>' +
                            '<td>' + personList.eventName + '</td>' +
                            '<td>' + personList.collateral + '</td>' +
                            '<td>' + personList.faxNumber + '</td>' +
                            '<td>' + personList.jobTitle + '</td>' +
                            '<td>' + personList.note + '</td>' +
                            '<td>' + personList.phoneNumber + '</td>' +
                            '<td>' + personList.phone2Number + '</td>' +
                            '<td>' + personList.question + '</td>' +
                            '<td>' + personList.response + '</td>' +
                            '<td>' + personList.scannedBy + '</td>' +
                            '<td>' + personList.scannedTime + '</td>' +
                            '<td>' + personList.scannedDate + '</td>' +
                            '<td>' + personList.status + '</td>' +
                            '</tr>';
                        $('#personList #personDataByScannedStatus').append(person);
                    })
                },
                error: function (e) {
                    alert("ERROR: ", e);
                    console.log("ERROR: ", e);
                },
            })

        }
    });
