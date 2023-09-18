document.getElementById("media").addEventListener("submit", function (e) {
    e.preventDefault();
    var nome = document.getElementById("nome").value;
    var nota1 = parseFloat(document.getElementById("nota1").value);
    var nota2 = parseFloat(document.getElementById("nota2").value);
    var nota3 = parseFloat(document.getElementById("nota3").value);

    var notas = [nota1, nota2, nota3];
    var soma = 0;

    for (var i = 0; i < notas.length; i++) {
        soma += notas[i];
    }
    var media = soma / notas.length;
    var situacao = "";

    if (media <= 4) {
        situacao = "Reprovado";
    } else if (media < 7) {
        var notaRecuperacao = parseFloat(prompt("Digite a nota da recuperação:"));
        var mediaFinal = (media + notaRecuperacao) / 2;
        if (mediaFinal >= 5) {
            situacao = "Aprovado na Recuperação";
        } else {
            situacao = "Reprovado na Recuperação";
        }
    } else {
        situacao = "Aprovado";
    }
    var resultadoTable = document.getElementById("resultado");
    resultadoTable.innerHTML = "";
    var descricaoValores = ["Nome", "Média", "Situação"];
    var valores = [nome, media.toFixed(2), situacao];

    var row = resultadoTable.insertRow(0);

    for (var i = 0; i < descricaoValores.length; i++) {
        var cell = row.insertCell(i);
        cell.innerHTML = valores[i];
    }
});