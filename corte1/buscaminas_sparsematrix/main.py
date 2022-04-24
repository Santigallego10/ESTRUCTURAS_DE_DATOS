import numpy as np
from scipy.sparse import csr_matrix


def create_mines_map(matrix):
    mines_map = []
    for row in matrix:
        mines_map.append(['#' for _ in row])
    return mines_map


def print_matrix(matrix):
    for row in matrix:
        for _ in row:
            print('#', end=' ')
        print('')


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
    mines_map = np.array(create_mines_map(matrix), dtype=str)
    flag = False

    while not flag:
        print_matrix(mines_map)

        row = int(input('Numero de la fila a seleccionar: '))
        column = int(input('Numero de la columna a seleccionar: '))

        try:
            if matrix[row, column] in sparse_matrix.data:
                print('Mina!!\nGAME OVER')
                flag = True
            else:
                mines_map[row, column] = '*'
        except IndexError:
            print('Coordenada no existente, intenta con otra')


if __name__ == '__main__':
    run()
