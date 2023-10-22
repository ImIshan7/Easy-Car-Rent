document.addEventListener('DOMContentLoaded', () => {

    "use strict";


    /*PreLoader*/

    const preloader = document.querySelector('#preloader');
    if (preloader) {
        window.addEventListener('load', () => {
            preloader.remove();
        });
    }



});