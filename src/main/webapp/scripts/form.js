var i = 0; /* Set Global Variable i */
function increment(){
    i += 1; /* Function for automatic increment of field's "Name" attribute. */
}
/*
 ---------------------------------------------

 Function to Remove Form Elements Dynamically
 ---------------------------------------------

 */
function removeElement(parentDiv, childDiv){
    if (childDiv == parentDiv){
        alert("The parent div cannot be removed.");
    }
    else if (document.getElementById(childDiv)){
        var child = document.getElementById(childDiv);
        var parent = document.getElementById(parentDiv);
        parent.removeChild(child);
    }
    else{
        alert("Child div has already been removed or does not exist.");
        return false;
    }
}
/*
 ----------------------------------------------------------------------------

 Functions that will be called upon, when user click on the Name text field.

 ----------------------------------------------------------------------------
 */
function addPlayerFunction(){
    var r = document.createElement('span');
    var y = document.createElement("INPUT");
    y.setAttribute("type", "text");
    y.setAttribute("placeholder", "Name of player");
    var g = document.createElement("IMG");
    g.setAttribute("src", "/images/icon_deleteplayer.svg");
    increment();
    y.setAttribute("path", "players[" + i + "]");
    r.appendChild(y);
    g.setAttribute("onclick", "removeElement('myForm','id_" + i + "')");
    r.appendChild(g);
    r.setAttribute("id", "id_" + i);
    document.getElementById("myForm").appendChild(r);
}
/*
 -----------------------------------------------------------------------------

 Functions that will be called upon, when user click on the E-mail text field.

 ------------------------------------------------------------------------------
 */
function addGameFunction(){
    var r = document.createElement('span');
    var y = document.createElement("INPUT");
    y.setAttribute("type", "text");
    y.setAttribute("placeholder", "Played game");
    var g = document.createElement("IMG");
    g.setAttribute("src", "/images/icon_deleteplayer.svg");
    increment();
    y.setAttribute("Name", "textelement_" + i);
    r.appendChild(y);
    g.setAttribute("onclick", "removeElement('myForm','id_" + i + "')");
    r.appendChild(g);
    r.setAttribute("id", "id_" + i);
    document.getElementById("myForm").appendChild(r);
}