/*
js was invented by Brendan eich-1995
=>while he was working in netScape communications and became the ECMA-262 in 1997
=>he created it in a short period, reportedly just ten day.

* after netScape handed javascript over to ecma,the mizilla foundation continued to develop javascript for the firefox browser.
1995-javascript was invented by brendan eich
1997-ECMAScript 1 was released.
1997-1E4 was teh first browser to support (1E).
      |->Internet explore(1e)
1999-1E5 was the first browser to support es2
              *
              *
              * 
2015-ES6-ECMA Script 6 was relesed
              *
              *
              * 
2018-ES6-ECMA Script 6 full support for ES in all browser.    
 
*/
//var,let,const-line-by-line comparision
/*
var-ES5(part)
let,const-ES6(part)
var a=12;
 */

a=12;//but not appreciated
var a;
var a=12;
let a;
let a=12;
const a; //incorrect
const a=12;

//declaration and initialization

var a;//declaration
var a=12; //declaration and initialization the first value;
 
/*workink property
var a=12;
=>it add in window
=> it scoped into function
=> we can again declated it and cant give any error
var a=112;
*/
var a=12;
var a=112;//correct
//but if we do with let its give error
let a=12;
let a=112;//incorrect
 
//if the value is fixed then we used const.
 const discout=12;

 //we can't change this value,but we can change in let.
 let a=12;
     a=112;

//but if we write in const its give error.
const a=12;
      a=20;
//error:- assignment to constant variable  

/*
#concolution
=>var-old and risky
=>let-modern and safe
=>const-constant values
 */

//*scope(global,block,functional)
//temporal dead zone
    console.log(b);
    let b=12;        /* * cannot acces "a" before initialization.
                        * it's not giving error "a is not define" 
                        * this is called temporal dead zone =>js know a is define but cant access */
/*Hoisting impact(per type)=> when variable is declared or initialization into two parts.
          var a=12;
          |      |
var a=undefined|| a=12;
* its declaration part goes to up and initialization
part in down word.

var a=undefind||thats way when we access or print a its throw undefined not declared.

a=12;
      */
     console.log(c);
     var c=12;                 
/* 
console.log(a); =>error :-cannot access 'a' before initialization.=>(here initialization throwing error not declatation because of hoistiong(tempatal dead zone))
let a=12; 
    |
let a="undefine";
console.log(a);// error=>initialization not declaration.
a=12;
// its only work in var|| but temporal deadzone work in let.

var-hoist->undefine
let->hoist-> not
const->hoist-> not

ex-
console.log(nm);
var nm="shivam";//=>undefine;

ex- console.log(age);
let age=25;// =>error cannot access.
*/

/*
ex-
var x=1;//global
{
varx=2; => only infuction not scope so it replace or override
}
console.log(x); =>2 ans
*/

/*let a=10;
{ 
  let a=20;
  console.log("inside",a);//20
}
  console.log("outside",a);//10
  */