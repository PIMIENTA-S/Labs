import java.util.Scanner;

public class Parentesis {

    static String entrada;

    public static void verificar(String e){

        Stack div = new Stack();
        String[] a = e.split("");
        int error = 0;


        for(int i = 0; i < a.length; i++){
            if(a[i].equals("(")){
                div.push(a[i]);
            }else{
                if(!div.isEmpty()){
                    div.pop();
                }
                error ++;
            }
        }
        if(div.isEmpty() && error == 0){
            System.out.println("Esta completo");
        }else{
            System.out.println("Incompletos");
        }

    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("Ingrese los caracteres a comprobar: ");
        entrada = r.nextLine();

        verificar(entrada);

    }


}
