

public class Mensagem {
    public static void mensagem(int horas) {
        

        if(horas> 6 && horas<12){
            System.out.println("Bom dia");
        }else if(horas>12 && horas<18){
            System.out.println("Boa tarde");
        }else if(horas>18 && horas<00){
            System.out.println("Boa Noite");
        }else{
            System.out.println("Madrugada");
        }
    }
}
