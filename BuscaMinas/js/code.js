let row = 20;
let col = 20;
let boxSize = 30;
let mines = row * col * 0.1; //20% de minas

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
            stringHTML += `<td id="celda-${j}-${i}"  style="width:${boxSize}px;height${boxSize}px">`
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

function checkMines(celda, i, j, em) {
    if (backBoard[j][i].value == 1) {
        celda.innerHTML = "X"
        alert("Perdiooooo");
    }
}

function refreshBoard() {
    for (let i = 0; i < row; i++) {
        for (let j = 0; j < col; j++) {
            let celda = document.getElementById(`celda-${j}-${i}`)

            if (backBoard[j][i].value == 1) {
                celda.innerHTML = "M";
            }

            celda.addEventListener("click", me => {
                checkMines(celda, i, j, me);
            })
        }
    }
}