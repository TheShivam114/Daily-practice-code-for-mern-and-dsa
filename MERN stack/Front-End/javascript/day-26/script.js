//js is Scripting Language
//interpreter/compiler
/*
*intoduction to js.
* why it is importance
* what can it do for you
* script tag
* how to run js in browser
* console... prompt alert
* strings
* slice template strings splite replace
* includes
* how many types of programming ar scripting language
*/

console.log("hay");
console.error(" hi");
console.warn("hi");

// prompt("name?");
// alert("hacked");

//""write in double court
"shivam bhi kaishe ho".slice(4,9);
// `` ->template-String(template literal)
"shivam bhi kaishe ho".split(4,9); //remove all a in the text.
/*
*.Split('a').join(' ')//it convert into array and joint make it in string again.
*.replace all
*.includes("a");
 */
//why var leaks outside block but let does't
if(true){
    var a=1;
    let b=2;

}
console.log(a);//1
console.log(b)//not correct refrence error

// var  =>not respect if for any things it only respect function.

//que=> why const allows changing object properties.

const person={name:"harsh"};
person.name="Sharma";//allowed
person={};//not allowed


/*section-2 datatype + type system
/data types
data is of many type but its devided into two types mainly
 1. primitive datatype 2. reference data type 
1.primitives dataType:- Stored directly 

  *String->test "hello",'sher'
  *Numbler->nay number value 2,-99,3.4
  *Boolean->true or false
  *undefined->variable declared but not assigned
             let x->x is not definded
  *null->Intentional empty value.
              let x=null;
  *Symbol->unique identifier
  *bidInt->vert large integers
  1234567891011121314

*/