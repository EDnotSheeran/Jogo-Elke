package elke;
import java.util.Random;
public class Jogo {
    String criatura;
    String arma;
    boolean venceu;
    Anjo anjo = new Anjo();
    Demonios demonios = new Demonios();
    Monstros monstros = new Monstros();
    public void jogar(){
        try{
        String criatura = getCriatura();
        String arma = getArma();
        System.out.println("criatura: "+criatura+" X "+" Arma: "+arma);
        boolean venceu = batalha();
        System.out.print("Resutado = voce ");
        if(venceu){
            System.out.println("Venceu :}");
        }else{
            System.out.println("Perdeu :(");
        }
        }catch(Exception e){
            System.out.println("erro no jogo");
        }
    }
    public boolean batalha(){
    try{
        if(criatura.equals("Anjo")){
            for(int i = 0; i<anjo.mortoPor.size();i++){
                if(anjo.mortoPor.get(i).equalsIgnoreCase(arma)){
                    venceu = true;
                    return true;
                }
            }
        }
        if(criatura.equals("Demonios")){
            for(int i = 0; i<demonios.mortoPor.size();i++){
                if(demonios.mortoPor.get(i).equalsIgnoreCase(arma)){
                    venceu = true;
                    return true;
                }
            }
        }
        if(criatura.equals("Monstros")){
            for(int i = 0; i<monstros.mortoPor.size();i++){
                if(monstros.mortoPor.get(i).equalsIgnoreCase(arma)){
                    venceu = true;
                    return true;
                }
            }
        }
    }catch(Exception e){
        System.out.println("Erro na batalha");
    }
        return false;
    }
//Ramdomiza uma criatura
    public String getCriatura(){
        try{
        Random rd = new Random();
        int n = rd.nextInt(2);
        if(n == 0){
            criatura = "Anjo";
        }
        if(n == 1){
            criatura = "Demonios";
        }
        if(n == 2){
            criatura = "Monstros";
        }        
        }catch(Exception e){
            System.out.println("erro ao escolher criatura");
        }
        System.out.println(criatura);
        return criatura;
    }
    public String getArma(){
        String nome = "";
            try{
        Random rd = new Random();
        int n = rd.nextInt(2);
        if(n==0){
            Magicas magica = new Magicas();
            Random rd1 = new Random();
            int n1 = rd1.nextInt(magica.armas.size()-1);
            nome = magica.armas.get(n1);
        }
        if(n==1){
            Fogo fogo = new Fogo();
            Random rd2 = new Random();
            int n2 = rd2.nextInt(fogo.armas.size()-1);
            nome = fogo.armas.get(n2);
        }
        if(n==2){
            Brancas brancas = new Brancas();
            Random rd3 = new Random();
            int n3 = rd3.nextInt(brancas.armas.size()-1);
            nome = brancas.armas.get(n3);
        }
        arma = nome;
    }catch(Exception e){
                System.out.println("erro ao escolher arma");
    }
    return nome;
    }
}
