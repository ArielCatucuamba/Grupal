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