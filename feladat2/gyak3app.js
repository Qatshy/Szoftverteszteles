function numberConverter(givennumber)
{
    const Roman_numbers = [
    // Ezresek (3000 - 1000)
    "MMM", "MM", "M",
    
    // Százasok (900 - 100)
    "CM", "DCCC", "DCC", "DC", "D", "CD", "CCC", "CC", "C",
    
    // Tízesek (90 - 10)
    "XC", "LXXX", "LXX", "LX", "L", "XL", "XXX", "XX", "X",
    
    // Egyesek (9 - 1)
    "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"
    ];
    convertedNumber = "";
    //let givennumber = prompt("Please enter a Natural number up to 3999", "67");
    if (givennumber <= 0 || isNaN(givennumber) || givennumber % 1 != 0 ||givennumber > 3999) {
        return 1;
    }

    let remaindercounter;

    // ezresek
    remaindercounter = Math.floor(givennumber / 1000)
    if(remaindercounter !=0)
    {
        convertedNumber += Roman_numbers[3- remaindercounter];
    }

    // százasok
    remaindercounter = Math.floor((givennumber % 1000) / 100);
    if(remaindercounter != 0)
    {
         convertedNumber += Roman_numbers[12- remaindercounter];
    }

    // tizesek

    remaindercounter = Math.floor((givennumber % 100) / 10);
    if(remaindercounter != 0)
    {
         convertedNumber += Roman_numbers[21- remaindercounter];
    }
    //egyesek
    
    remaindercounter = Math.floor(givennumber % 10);
    if(remaindercounter != 0)
    {
        convertedNumber += Roman_numbers[30- remaindercounter];
    }
    return convertedNumber;
}