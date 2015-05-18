/*Script file to automate menu*/
$(document).ready(function() {
    //Get the values corresponding with the main page that is displayed
    var mainMenu = document.getElementsByName("mainMenu")[0].value;
    var subMenu = document.getElementsByName("subMenu")[0].value;

    if(mainMenu === "players" || mainMenu === "home"){
        $("#players").addClass('show');
        $("#playersMain").addClass('selected');
    } else if (mainMenu === "games"){
        $("#games").addClass('show');
        $("#gamesMain").addClass('selected');
    }else if (mainMenu === "ranking"){
        $("#ranking").addClass('show');
        $("#rankingMain").addClass('selected');
    }


    //Get all the LI from the #tabMenu UL
    $('#tabMenu li').click(function(){

        //perform the actions when it's not selected
        if (!$(this).hasClass('selected')) {

            //remove the selected class from all LI
            $('#tabMenu li').removeClass('selected');

            //Reassign the LI
            $(this).addClass('selected');

            //Hide all the DIV in .boxBody
            $('.boxBody div.parent').slideUp('1500');

            //Look for the right DIV in boxBody according to the Navigation UL index, therefore, the arrangement is very important.
            $('.boxBody div.parent:eq(' + $('#tabMenu > li').index(this) + ')').slideDown('1500');

        }
    }).mouseover(function() {

        //Add and remove class, Personally I dont think this is the right way to do it,
        //if you have better ideas to toggle it, please comment
        $(this).addClass('mouseover');
        $(this).removeClass('mouseout');

    }).mouseout(function() {

        //Add and remove class
        $(this).addClass('mouseout');
        $(this).removeClass('mouseover');

    });


    //Mouseover with animate Effect for Category menu list  :)
    $('.boxBody #category li').mouseover(function() {

        //Change background color and animate the padding
        $(this).css('backgroundColor','#888');
        $(this).children().animate({paddingLeft:"20px"}, {queue:false, duration:300});
    }).mouseout(function() {

        //Change background color and animate the padding
        $(this).css('backgroundColor','');
        $(this).children().animate({paddingLeft:"0"}, {queue:false, duration:300});
    });

    //Mouseover effect for Posts, Comments, Famous Posts and Random Posts menu list.
    $('.boxBody li').click(function(){
        window.location = $(this).find("a").attr("href");
    }).mouseover(function() {
        $(this).css('backgroundColor','#888');
    }).mouseout(function() {
        $(this).css('backgroundColor','');
    });

});