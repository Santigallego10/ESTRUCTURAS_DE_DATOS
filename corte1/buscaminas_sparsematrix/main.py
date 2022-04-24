import numpy as np
import os
from scipy.sparse import csr_matrix


def create_mines_map(matrix):
    mines_map = []
    for row in matrix:
        mines_map.append(['#' for _ in row])
    return np.array(mines_map)


def print_matrix(matrix):
    for row in matrix:
        for i in row:
            print(i, end=' ')
        print('')


def clear():
    os.system('clear')


def run():
    matrix = np.array([
        [0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0],
        [1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0],
        [0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0],
        [1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0],
        [0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0],
        [0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0]
    ])

    steps = []
    sparse_matrix = csr_matrix(matrix)
    mines_map = create_mines_map(matrix)
    flag = False

    while not flag:
        clear()
        print_matrix(mines_map)

        row = int(input('Numero de la fila a seleccionar: '))
        column = int(input('Numero de la columna a seleccionar: '))

        if (row, column) in steps:
            print('Ya pasaste por aquí, elige otra casilla')
        else:
            try:
                if matrix[row, column] in sparse_matrix.data:
                    print('Pisaste una mina!!\nGAME OVER')
                    flag = True
                else:
                    mines_map[row, column] = '*'
                    steps.append((row, column))
            except IndexError:
                print('Coordenada no existente, intenta con otra')


if __name__ == '__main__':
    run()
