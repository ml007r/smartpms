var initPage;

/**
 * Funktion wird onLoad() aufgerufen!
 * 
 */
function init() {
    if (typeof initPage == 'function') initPage();
}

function showProgress() {
    document.getElementById('blocker').style.display = "";
    document.getElementById('progressbar').style.top = document.body.offsetHeight / 2 - 50 + "px";
    document.getElementById('progressbar').style.left = document.body.offsetWidth / 2 - 50 + "px";
    document.getElementById('progressbar').style.display = "";
}