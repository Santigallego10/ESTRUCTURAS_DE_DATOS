const buscaminas = {
    numMinasTotales: 30,
    numMinasEncontradas: 0,
    numFilas: 15,
    numColumnas: 15,
    aCampoMinas: []
}

function pintarTablero() {
    //seleccionamos el objeto tablero
    let tablero = document.querySelector("#tablero");

    //actualizamos las variables CSS con las variables JavaScript
    document.querySelector("html").style.setProperty("--num-filas", buscaminas.numFilas);
    document.querySelector("html").style.setProperty("--num-columnas", buscaminas.numColumnas);

    //borramos el tablero actual
    while (tablero.firstChild) {
        tablero.firstChild.removeEventListener("contextmenu", marcar);
        tablero.firstChild.removeEventListener("click", destapar);
        tablero.removeChild(tablero.firstChild);
    }

    //creamos las casillas que necesitemos
    for (let f = 0; f < buscaminas.numFilas; f++) {
        for (let c = 0; c < buscaminas.numColumnas; c++) {
            let newDiv = document.createElement("div");
            newDiv.setAttribute("id", "f" + f + "_c" + c);
            newDiv.dataset.fila = f;
            newDiv.dataset.columna = c;
            newDiv.addEventListener("contextmenu", marcar); //evento con el botón derecho del raton
            newDiv.addEventListener("click", destapar); //evento con el botón izquierdo del raton

            tablero.appendChild(newDiv);
        }
    }
}

function generarCampoMinasVacio() {
    //generamos el campo de minas
    buscaminas.aCampoMinas = new Array(buscaminas.numFilas);
    for (let fila = 0; fila < buscaminas.numFilas; fila++) {
        buscaminas.aCampoMinas[fila] = new Array(buscaminas.numColumnas);
    }
}

function esparcirMinas() {
    //repartimos de forma aleatoria las minas
    let numMinasEsparcidas = 0;

    while (numMinasEsparcidas < buscaminas.numMinasTotales) {
        //numero aleatorio en el intervalo [0,numFilas-1]
        let fila = Math.floor(Math.random() * buscaminas.numFilas);

        //numero aleatorio en el intervalo [0,numColumnas-1]
        let columna = Math.floor(Math.random() * buscaminas.numColumnas);

        //si no hay bomba en esa posicion
        if (buscaminas.aCampoMinas[fila][columna] != "B") {
            //la ponemos
            buscaminas.aCampoMinas[fila][columna] = "B";

            //y sumamos 1 a las bombas esparcidas
            numMinasEsparcidas++;
        }
    }
}


function contarMinasAlrededorCasilla(fila, columna) {
    let numeroMinasAlrededor = 0;

    //de la fila anterior a la posterior
    for (let zFila = fila - 1; zFila <= fila + 1; zFila++) {

        //de la columna anterior a la posterior
        for (let zColumna = columna - 1; zColumna <= columna + 1; zColumna++) {

            //si la casilla cae dentro del tablero
            if (zFila > -1 && zFila < buscaminas.numFilas && zColumna > -1 && zColumna < buscaminas.numColumnas) {

                //miramos si en esa posición hay bomba
                if (buscaminas.aCampoMinas[zFila][zColumna] == "B") {

                    //y sumamos 1 al numero de minas que hay alrededor de esa casilla
                    numeroMinasAlrededor++;
                }
            }
        }
    }

    //y guardamos cuantas minas hay en esa posicion
    buscaminas.aCampoMinas[fila][columna] = numeroMinasAlrededor;
}



function contarMinas() {
    //contamos cuantas minas hay alrededor de cada casilla
    for (let fila = 0; fila < buscaminas.numFilas; fila++) {
        for (let columna = 0; columna < buscaminas.numColumnas; columna++) {
            //solo contamos si es distinto de bomba
            if (buscaminas.aCampoMinas[fila][columna] != "B") {
                contarMinasAlrededorCasilla(fila, columna);
            }
        }
    }
}



function marcar(miEvento) {
    if (miEvento.type === "contextmenu") {
        console.log(miEvento);

        //obtenemos el elemento que ha disparado el evento
        let casilla = miEvento.currentTarget;

        //detenemos el burbujeo del evento y su accion por defecto
        miEvento.stopPropagation();
        miEvento.preventDefault();

        //obtenemos la fila de las propiedades dataset.
        //como es un string hay que convertirlo a numero
        let fila = parseInt(casilla.dataset.fila, 10);
        let columna = parseInt(casilla.dataset.columna, 10);

        if (fila >= 0 && columna >= 0 && fila < buscaminas.numFilas && columna < buscaminas.numColumnas) {
            //si esta marcada como "bandera"
            if (casilla.classList.contains("icon-bandera")) {
                //la quitamos
                casilla.classList.remove("icon-bandera");
                //y la marcamos como duda
                casilla.classList.add("icon-duda");
                //y al numero de minas encontradas le restamos 1
                buscaminas.numMinasEncontradas--;
            } else if (casilla.classList.contains("icon-duda")) {
                //si estaba marcada como duda lo quitamos
                casilla.classList.remove("icon-duda");
            } else if (casilla.classList.length == 0) {
                //si no está marcada la marcamos como "bandera"
                casilla.classList.add("icon-bandera");
                //y sumamos 1 al numero de minas encontradas
                buscaminas.numMinasEncontradas++;
                //si es igual al numero de minas totales resolvemos el tablero para ver si esta bien
                if (buscaminas.numMinasEncontradas == buscaminas.numMinasTotales) {
                    resolverTablero(true);
                }
            }

            actualizarNumMinasRestantes();
        }

    }
}

function destapar(miEvento) {
    if (miEvento.type === "click") {
        let casilla = miEvento.currentTarget;
        let fila = parseInt(casilla.dataset.fila, 10);
        let columna = parseInt(casilla.dataset.columna, 10);

        destaparCasilla(fila, columna);
    }
}

function destaparCasilla(fila, columna) {

    //si la casilla esta dentro del tablero
    if (fila > -1 && fila < buscaminas.numFilas &&
        columna > -1 && columna < buscaminas.numColumnas) {

        console.log("destapamos la casilla con fila " + fila + " y columna " + columna);

        //obtenermos la casilla con la fila y columna
        let casilla = document.querySelector("#f" + fila + "_c" + columna);

        //si la casilla no esta destapada
        if (!casilla.classList.contains("destapado")) {

            //si no esta marcada como "bandera"
            if (!casilla.classList.contains("icon-bandera")) {

                //la destapamos
                casilla.classList.add("destapado");

                //ponemos en la casilla el número de minas que tiene alrededor
                casilla.innerHTML = buscaminas.aCampoMinas[fila][columna];

                //ponemos el estilo del numero de minas que tiene alrededor (cada uno es de un color)
                casilla.classList.add("c" + buscaminas.aCampoMinas[fila][columna])

                //si no es bomba
                if (buscaminas.aCampoMinas[fila][columna] !== "B") {

                    // y tiene 0 minas alrededor, destapamos las casillas contiguas
                    if (buscaminas.aCampoMinas[fila][columna] == 0) {
                        destaparCasilla(fila - 1, columna - 1);
                        destaparCasilla(fila - 1, columna);
                        destaparCasilla(fila - 1, columna + 1);
                        destaparCasilla(fila, columna - 1);
                        destaparCasilla(fila, columna + 1);
                        destaparCasilla(fila + 1, columna - 1);
                        destaparCasilla(fila + 1, columna);
                        destaparCasilla(fila + 1, columna + 1);

                        //y borramos el 0 poniendo la cadena vacía
                        casilla.innerHTML = "";
                    }
                } else if (buscaminas.aCampoMinas[fila][columna] == "B") {
                    // si por el contrario hay bomba quitamos la B
                    casilla.innerHTML = "";

                    //añadimos el estilo de que hay bomba
                    casilla.classList.add("icon-bomba");

                    // y que se nos ha olvidado marcarla
                    casilla.classList.add("sinmarcar");

                    // y resolvemos el tablero indicando (false), que hemos cometido un fallo
                    resolverTablero(false);
                }
            }
        }
    }
}

function resolverTablero(isOK) {
    let aCasillas = tablero.children;
    for (let i = 0; i < aCasillas.length; i++) {
        //quitamos los listeners de los eventos a las casillas
        aCasillas[i].removeEventListener("click", destapar);
        aCasillas[i].removeEventListener("contextmenu", marcar);

        let fila = parseInt(aCasillas[i].dataset.fila, 10);
        let columna = parseInt(aCasillas[i].dataset.columna, 10);

        if (aCasillas[i].classList.contains("icon-bandera")) {
            if (buscaminas.aCampoMinas[fila][columna] == "B") {
                //bandera correcta
                aCasillas[i].classList.add("destapado");
                aCasillas[i].classList.remove("icon-bandera");
                aCasillas[i].classList.add("icon-bomba");
            } else {
                //bandera erronea
                aCasillas[i].classList.add("destapado");
                aCasillas[i].classList.add("banderaErronea");
                isOK = false;
            }
        } else if (!aCasillas[i].classList.contains("destapado")) {
            if (buscaminas.aCampoMinas[fila][columna] == "B") {
                //destapamos el resto de las bombas
                aCasillas[i].classList.add("destapado");
                aCasillas[i].classList.add("icon-bomba");
            }
        }

    }

    if (isOK) {
        alert("¡¡¡Enhorabuena!!!");
    }
}


function actualizarNumMinasRestantes() {
    document.querySelector("#numMinasRestantes").innerHTML =
        (buscaminas.numMinasTotales - buscaminas.numMinasEncontradas);
}

function inicio() {
    buscaminas.numFilas = 10;
    buscaminas.numColumnas = 10;
    buscaminas.numMinasTotales = 12;
    pintarTablero();
    generarCampoMinasVacio();
    esparcirMinas();
    contarMinas();
    actualizarNumMinasRestantes();
}

window.onload = inicio;