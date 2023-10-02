/* Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
números pares e a quantidade de números ímpares. */

var num = [];
for(let i = 0; i < 10; i++){
    var test = window.prompt('Digite um numero inteiro: ');
    num.push(test);
}
var countpar = 0;
var countimpar = 0;
for(let i = 0; i < num.length; i++){
    if((num[i] % 2) == 0){
        countpar += 1;
    }else{
        countimpar += 1;
    }
}

window.alert("Quantidade de numeros pares: " + countpar + "\n Quantidade de numeros impares: " + countimpar);