let months = ['january', 'july', 'march', 'august'];

months.shift();
months.shift();

months.unshift('june');
months.unshift('july');

let months1 = ['january', 'july', 'march', 'august'];

months1.splice(0, 2, 'july' , 'june');
