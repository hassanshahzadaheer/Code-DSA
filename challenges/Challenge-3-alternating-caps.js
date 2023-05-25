/* Alternating Caps 
 Write a function that takes in a string of letters
 and returns a sentence in which every other letter is capitalized.

Example input: "I'm so happy it's Monday"
Example output: "I'M So hApPy iT'S MoNdAy"
*/

function altCaps(str){
    // loop through the string
    let newStr = "";
    for(let i = 0; i < str.length; i++)
    {
         if((i % 2) == 0 )
         {
             newStr += str[i].toUpperCase();
         }
         else {
             newStr += str[i].toLowerCase();   
         }
    }
    return newStr;
}

console.log(altCaps("When you visit Portland you have to go to VooDoo Donuts"));
