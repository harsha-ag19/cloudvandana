function reverse(inputArray,start,end)
{
    while(start<end)
    {
        var tmp = inputArray[start];
        inputArray[start] = inputArray[end];
        inputArray[end] = tmp;
        start++;
        end--;
    }
}
function partition(inputArray, start, end)
{ 
  var pivot = end;
  var i = start - 1, j = start;
  while (j < pivot) 
  {
    if (inputArray[j] > inputArray[pivot])
      j++;
    else 
    {
      i++;
      var tmp = inputArray[i];
      inputArray[i] = inputArray[j];
      inputArray[j] = tmp;
      j++;
    }
  }
   var tmp = inputArray[i+1];
   inputArray[i+1] = inputArray[pivot];
   inputArray[pivot] = tmp;
   return i + 1;
}
function quickSort(inputArray,start,end)
{
  if(start < end) 
  {
    var pivot = partition(inputArray, start, end);
    quickSort(inputArray, start, pivot - 1);
    quickSort(inputArray, pivot + 1, end);
  } 
}
var inputArray = [];
var size = prompt("Enter the size of Array");

for(var i=0; i<size; i++) 
{
	inputArray[i] = prompt();
}
quickSort(inputArray, 0, inputArray.length - 1);
reverse(inputArray,0,inputArray.length-1);
console.log(inputArray);
