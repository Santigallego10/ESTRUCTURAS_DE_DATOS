let row = 15;
let col = 15;
let boxSize = 30;
let mines = row * col * 0.2; //20% de minas
let sound = new Audio("../Sounds/cuack.mp3");

let backBoard = [];

startGame()

function startGame() {
    createBoard();
    createBackBoard();
    refreshBoard();

}



function createBoard() {
    let stringHTML = "";

    for (let i = 0; i < row; i++) {
        stringHTML += '<tr>'
        for (let j = 0; j < col; j++) {
            stringHTML += `<td id="celda-${j}-${i}" style="width:${boxSize}px;height:${boxSize}px">`
            stringHTML += `</td>`
        }
        stringHTML += `</tr>`
    }

    let boardHtml = document.getElementById("board")
    boardHtml.innerHTML = stringHTML;
    boardHtml.style.width = col * boxSize + 'px';
    boardHtml.style.height = row * boxSize + 'px';
}

function createBackBoard() {
    clearBoard();
    setMines();
    minesCounter();
}


function clearBoard() {
    backBoard = [];
    for (let i = 0; i < col; i++) {
        backBoard.push([]);
    }
}

function setMines() {
    for (let i = 0; i < mines; i++) {
        let c
        let r
        do {
            c = Math.floor(Math.random() * col)
            r = Math.floor(Math.random() * row)
        } while (backBoard[c][r]) {
            backBoard[c][r] = { value: 1 };
        }
    }
}

function minesCounter() {
    for (let i = 0; i < row; i++) {
        for (let j = 0; j < col; j++) {
            if (!backBoard[j][i]) {
                backBoard[j][i] = { value: 0 };
            }
        }
    }
}

function refreshBoard() {
    let cont = 0;
    let lifeCont = 3;
    let points = document.getElementById("points");
    let lifes = document.getElementById("lifes")
    for (let i = 0; i < row; i++) {
        for (let j = 0; j < col; j++) {
            let celda = document.getElementById(`celda-${j}-${i}`)

            /*
            if (backBoard[j][i].value == 1) {
                celda.innerHTML = "M";
            }
            */

            celda.addEventListener("click", me => {
                sound.play();
                if (backBoard[j][i].value == 1) {
                    if (lifeCont == 0) {
                        celda.innerHTML = "X"
                        alert("Perdiooooo, Su puntaje fue de: " + cont);
                        startGame();
                    } else {
                        celda.style.backgroundColor = "red";
                        lifeCont--;
                        lifes.innerHTML = "Vidas: " + lifeCont;
                    }
                } else {
                    cont++;
                    points.innerHTML = "Puntos: " + cont;
                    celda.style.backgroundColor = "pink";
                }

            })
        }
    }
}