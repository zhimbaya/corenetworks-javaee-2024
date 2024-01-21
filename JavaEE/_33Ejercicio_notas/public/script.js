var notas = [];

function guardar() {
	let nota = document.getElementById("nota").value;
	//alert(nota);
	notas.push(parseInt(nota));
	resetear();
}

function media() {
	var suma = 0;
	for (let i = 0; i < notas.length; i++) {
		alert(notas[i]);
		suma = suma + notas[i];
	}
	document.getElementById("media").innerText = suma / notas.length;
}

function aprobados() {
	var ap = 0;
	notas.forEach(function(n) {
		if (n >= 5) {
			ap++;
		}
	});
	document.getElementById("aprobados").innerText = ap;

}
function mostrar() {
	document.getElementById("notas").innerText = notas.join("-");
}
function resetear() {
	document.getElementById("nota").value = "";
}