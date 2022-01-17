var carreritas = ["Lucia","Roberto", "Maria", "Jesus","Andrea", "Jose"]

function competicion(){

    carreritas.forEach(function(element,index,array) {
        

console.log("posicion " + (index + 1 ) + ", " + element);

    });


    console.log("la carrera continua asi: ");

    var indice = carreritas.indexOf("Maria");
    carreritas[indice]= "Andrea";
    carreritas[3] = "Maria";
    carreritas[4] = "Jesus";
    

    console.log("andrea adelanta a maria: ");
    carreritas.forEach(function(element,index,array) {
        

        console.log("posicion " + (index + 1 ) + ", " + element);
        
            });


}


competicion();