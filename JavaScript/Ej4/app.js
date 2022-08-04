
ejemplo1 = [
    [1, 0, 0],
    [0, 2, 0],
    [0, 0, 3],
];

ejemplo2=[
    [1, 0, 0],
    [0, 2, 3], 
    [0, 0, 3] 
];
//Desarrollo
function matrizDiagonal(array) {
    let diagonal = true;
    for (let i = 0; i < array.length; i++) {
      for (let j = 0; j < array[i].length; j++) {
        if (i != j) {
          if (array[i][j] != 0) {
            diagonal = false;
            break;
          }
        }
      }
    }
    return diagonal;
}
//Implementacion
resultadoMatriz1=matrizDiagonal(ejemplo1);
resultadoMatriz2=matrizDiagonal(ejemplo2);
alert("La Matriz es diagonal? " +resultadoMatriz1);
alert("La Matriz es diagonal? " +resultadoMatriz2);
    