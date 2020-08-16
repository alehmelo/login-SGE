
            import java.util.Scanner;

public class login {

    // Login e Senha
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digete seu nome");
        boolean nomeV=false;
        boolean sobrenomeV=false;
        boolean senhaV=false;
        boolean loginV=false;

        String nome = null;
        String sobrenome = null;
        String senha = null;


        while(nomeV == false) {

            nome = scanner.nextLine();
            if (nome.length() > 3) {
                nomeV = true;
                System.out.println("Nome ok");

            } else {
                System.out.println("Nome tem de ter mais de 3 letras!");

            }

        }
        System.out.println("Digete o sobrenome");
        while(sobrenomeV == false){

            sobrenome = scanner.nextLine();
            if (sobrenome.length() >3){
                sobrenomeV = true;
                System.out.println("sobrenome ok");

            }else {
                System.out.println("sobrenome precisa ter mais de 3 letras");

            }
        }
        System.out.println("Digite sua senha");
        while (senhaV ==false){
            senha = scanner.nextLine();
            if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7){
                senhaV = true;
                System.out.println(" senha valida ");
            }else {
                System.out.println("Requer 1 letra maiuscula, 1 numero, e 1 desses caracteres # ! @, e ter mais que 7 caracteres!");

            }
        }
        System.out.println("username:"+nome.charAt(0)+"_"+sobrenome);
        System.out.println("senha:"+senha);

        while (loginV ==false){
            System.out.println("Digite username");
          String  username = scanner.nextLine();
            System.out.println("Digite senha");
            String  vsenha = scanner.nextLine();

          if(username.equals(nome.charAt(0)+"_"+sobrenome)&&vsenha.equals(senha)){
              loginV = true;
              System.out.println("logado com sucesso");

          }else{
              System.out.println("username ou senha invalidos");
          }
        }

    }}

