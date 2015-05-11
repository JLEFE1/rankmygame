/**
 * Created by JoLe on 08/05/15.
 */
$(document).ready(function () {
    $(".resultName").on("mouseenter", function () {
        $(this).closest("#playerStats").find(".result").show();
        $(this).addClass('highlighted');
    });
    $(".resultName").on("mouseleave", function () {
        $(this).closest("#playerStats").find(".result").hide();
        $(this).removeClass('highlighted');
    });

    $(".game").on("mouseenter", function () {
        $(".winner").show();
    });
    $(".game").on("mouseleave", function () {
        $(".winner").hide();
    });
});