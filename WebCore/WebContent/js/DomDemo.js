/**
 * 
 */

window.onload = initAll;
function initAll() {
	document.getElementsByTagName("form")[0].onsubmit = function() {
		return addNode();
	}
}

function addNode() {
	var inText = document.getElementById("textArea").value;

	var newText = document.createTextNode(inText);
	var newGraf = document.createElement("p");
	newGraf.appendChild(newText);
	var docBody = document.getElementsByTagName("body")[0];
	docBody.appendChild(newGraf);

	return false; // 此处不可以省略，起到抑制默认行为的作用
}
