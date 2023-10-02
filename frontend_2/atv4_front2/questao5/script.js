/* Escreva uma função que encontre a área e o perímetro de um círculo, de acordo
com o raio fornecido.
 */function calcularAreaEPerimetroDoCirculo(raio) {
    if (raio <= 0) {
        return "O raio deve ser um número positivo.";
    }

    var area = Math.PI * Math.pow(raio, 2);
    var perimetro = 2 * Math.PI * raio;

    return {
        area: area.toFixed(2), 
        perimetro: perimetro.toFixed(2)
    };
}

var raio = parseFloat(window.prompt("Digite o raio do círculo:"));
var resultados = calcularAreaEPerimetroDoCirculo(raio);

if (resultados === "string") {
    window.alert(resultados); 
} else {
    window.alert("Área do círculo: " + resultados.area + "\nPerímetro do círculo: " + resultados.perimetro);
}
