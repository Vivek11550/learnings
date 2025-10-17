const math = require('./maths')

console.log("hello world in node.js") //prints statement 

//console.log(window)  --undefine 

//console.log(alert('hey'))  --undefine

console.log("Maths value is:",math.add(2,4))
console.log("Maths value is:",math.sub(2,4))





//####################################################################################################################################


// ----------------OUTPUT/TERMINAL---------------------------------------------------

// PS C:\Users\hp\Desktop\Learnings\Backend\NodeJS\HELLO-WORLD> node hello.js
// hello world in node.js
// PS C:\Users\hp\Desktop\Learnings\Backend\NodeJS\HELLO-WORLD> node hello
// hello world in node.js
// PS C:\Users\hp\Desktop\Learnings\Backend\NodeJS\HELLO-WORLD>
//ReferenceError: alert is not defined 
//ReferenceError: window is not defined



// ----------------NOTES---------------------------------------------------
// node can automatically detect the .js extenstion if not added still runs the file 
//console.log(window)  shows undefined as it is Browser's property excluded from node env 