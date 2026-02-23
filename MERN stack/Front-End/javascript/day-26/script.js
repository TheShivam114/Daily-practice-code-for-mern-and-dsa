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

  int  a=12;
  let b=a;
  a=a+2;
  it cant change in b 

  but 

  let a[1,2,3];
  let b=a;
  it will change in b, then its also change in a;

  2. reference data type
  .object->{name:"harsh",age:26}
  .array->[10,20,30].
  .function->function greet(){}

  we cant copy any value it directly change in real value.

  object
  let a={
  name:"harsh"};

  let b=a
  b.name="shivam";

  it chage both a and b this is called refrance.

*/

/*
 dynamic typing


 =>js have not static typing and its has dynamic typing. it mean we can change the data because of dynamic typing

 ex-int a=12;
 a=true;


 *type of quirks(eg,type of null==='object')

 typeof 12 =>'number'
 
 1=="1"->true;
 1==="1"->false;
 typeofNUll=>'object'
 typeofNaN=> 'number';

 *type coercion(== vs ===)

 it is a concept in which one type automaticlly convert
 ex-
 "5"+1=51(its convert by the help of coercion)
 string+number
   5   +  1
      (51)
      concatenation of string and number.

   "5"-1=4
   
   =4} here"-" only do one work only subtract and "+" can do both + and concate its hapening because of coercion.


   * truth vs falsy values

   if(12){
       
   }=> here in javascript if"0 false" null undefined NaN document all" is present then it is false other wise its true.
   *to check any number is true or false write "!!" then any things.
     ex-!!->false
        !!""->false
        !!NAN->false

        if(null){} =>this is not true ot false then js see its nature which is that this is true or false

        ex-if(-1){
        }  =>it is true.

        that's why 
        0,false,"" null ,undefined Nan document.all
                 are false

      other number any things are true

      question
      *true+false=>1+0=>1
      *null+1=>1=>0+1=>1
      *5+"5"=>55=>concatenation
      !! undefined =>false

      Q.) why NAN is a number

      => typeof NaN==='number'   //true
      => in js.Nan is a failed mathematical numvrical operation
            ex- s*"shivam"->Nan =>failes mat....op...

      Q) undefined vs null
      
      ex- .let x;
      console.log(x);//undefined
      let y=nall;
      console.log(y);//null

      q)"s"+1 =>"s1"}concatenation

      "s"-1 =>4
   */