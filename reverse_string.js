var newString = ""; 
var theString = prompt("Enter a sentence to reverse"); 
 
var word = ""; 
var stack = []; 
var len = theString.length
for (var i = 0 ; i < len; i++)
{ 
  var c = theString[i]; 
  if(c!=" ")
  stack.push(c);
  else
  {
      while(s = stack.pop())
      {
          word+=s;
      }
      word+=" ";
  }
} 
while (s = stack.pop()) {     
    word+=s;
} 
 
console.log(word); 