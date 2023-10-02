/* Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
a. Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
b. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
c. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao
dobro do percentual do ano anterior. Faça um programa que determine o
salário atual desse funcionário. Após concluir isto, altere o programa
permitindo que o usuário digite o salário inicial do funcionário. */

var salarioInicial = parseFloat(window.prompt("Digite o salário inicial do funcionário:"));

var anoContratacao = 1995;
var percentualAumento = 1.5;

for (var ano = 1996; ano <= 2023; ano++) {
    salarioInicial += (salarioInicial * (percentualAumento / 100));
    percentualAumento *= 2; 
}

window.alert("O salário atual do funcionário em 2023 é: R$" + salarioInicial.toFixed(2));
