import java.util.Scanner;
class Oito{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite seu peso");
        double peso= ler.nextDouble();
        System.out.println("Digite sua altura");
        double altura= ler.nextDouble();
        double imc= peso/(altura*altura);
        if(imc<17){
            System.out.println("Muito abaixo do peso");
        }
        else{
            if(imc >=17 && imc <=18.49){
                System.out.println("Abaixo do peso");
            }
            else{
                if(imc >=18.5 && imc<=24.99){
                    System.out.println("Peso normal");
                }
                else{
                    if(imc >=25 && imc <=29.99){
                        System.out.println("Acima do peso");
                    }
                    else{
                        if(imc >=30 && imc <=34.99){
                            System.out.println("Obesidade 1");
                        }
                        else{
                            if(imc >=35 && imc <=39.99){
                                System.out.println("Obesidade 2");
                            }
                            else{
                                System.out.println("Obesidade 3");
                            }
                        }
                    }
                }
            }
        }
    }
}