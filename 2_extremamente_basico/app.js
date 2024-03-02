var input = require("fs").readFileSync("./stdin", "utf-8");
const [A, B] = input.split("\n").map(item => parseInt(item));

let X = A + B;

console.log(`X = ${X}`);