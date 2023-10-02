/* Faça um programa que, dado um conjunto de N números, determine o menor valor,
o maior valor e a soma dos valores. */

var N = parseInt(prompt("Digite a quantidade de números:"));

var menorValor = 99999999;
var maiorValor = 0
var soma = 0;

for (var i = 0; i < N; i++) {
    var numero = parseFloat(prompt("Digite o " + (i + 1) + "º número:"));
    
    if (numero < menorValor) {
        menorValor = numero;
    }
    
    if (numero > maiorValor) {
        maiorValor = numero;
    }
    
    soma += numero;
}

alert("Menor valor: " + menorValor + "\nMaior valor: " + maiorValor + "\nSoma dos valores: " + soma);

