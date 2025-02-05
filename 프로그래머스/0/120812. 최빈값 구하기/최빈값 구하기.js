function solution(array) {
    const frequency = {};  
    
    for (let i = 0; i < array.length; i++) {
        const num = array[i];  
        if (frequency[num] === undefined) {
            frequency[num] = 1;  
        } else {
            frequency[num] += 1; 
        }
    }

  
    let maxCount = 0;
    let mode = [];

    for (let num in frequency) {
        if (frequency[num] > maxCount) {
            maxCount = frequency[num];  
             mode = [Number(num)];
          
           
        } else if (frequency[num] === maxCount) {
               mode.push(Number(num));
        }
    }

    
    if(mode.length === 1) {
        return mode[0];
    }else {
        return -1;
    }
}


