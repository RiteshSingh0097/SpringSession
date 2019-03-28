function myFunction() {
    alert("Hello! I am an alert box!");
}

$(document).ready(function () {
    var date = $.ajax({
        url: "/saveDate",
        method: "GET"
});
    date.done(function (data) {
        $("#date").append(data)
    });

    date.fail(function (jqXHR, textStatus) {
        console.log("Error in fetching users");
    });
});
