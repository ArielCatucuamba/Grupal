//Parte Ariel Catucuamba
//aaaaaaaaaaaaaa
//colo quiero agregar esto
public class Animal {
    //Atributos
    String especie;
    String habitat;
    double tamaño;
    //metodo constructor
    public Animal(String especie,String habitat,double tamaño){
        this.especie=especie;
        this.habitat=habitat;
        this.tamaño=tamaño;
    }
    //metodo
    public void Mostrar(){
        System.out.println("*********Datos del animal*********");
        System.out.println("Especie: "+especie);
        System.out.println("Habitata: "+habitat);
        System.out.println("Tamaño: "+tamaño +" cm");
    }
}

//Parte Isaac Valenzuela
class mamifero extends Animal{
    //Atributos
    int numero_patas;
    String pelaje;
    //metodo constructor
    public mamifero(String especie,String habitat,double tamaño,int numero_patas,String pelaje){
        super(especie, habitat, tamaño);
        this.numero_patas=numero_patas;
        this.pelaje=pelaje;
    }
    //metodo
    public void Mostar1(){
        System.out.println("*Caracteristicas del animal*");
        System.out.println("Numero de patas; "+numero_patas);
        System.out.println("Pelaje: "+pelaje);
    }
}
