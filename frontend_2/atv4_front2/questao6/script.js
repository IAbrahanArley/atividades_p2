function calcularMontanteInvestimento(capitalInicial, taxaJuros, tempoMeses) {
    if (capitalInicial <= 0 || taxaJuros <= 0 || tempoMeses <= 0) {
        return "Os valores de entrada devem ser positivos.";
    }

    taxaJuros = taxaJuros / 100;

    var montante = capitalInicial * Math.pow(1 + taxaJuros, tempoMeses);

    montante = montante.toFixed(2);

    return montante;
}
var capitalInicial = parseFloat(prompt("Digite o capital inicial:"));
var taxaJuros = parseFloat(prompt("Digite a taxa de juros (em percentual):"));
var tempoMeses = parseInt(prompt("Digite o tempo do investimento (em meses):"));

var resultado = calcularMontanteInvestimento(capitalInicial, taxaJuros, tempoMeses);
window.alert("O montante do investimento é: R$" + resultado);

