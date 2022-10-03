public class tv {
    
    String nome;
    int volume = 0;
    String canal;
    


  public void up(int param) {
    volume = volume + param;
  }

  public void down(int param) {
    volume = volume - param;
  }

  public void trocaCanal(String novoCanal){

    canal = novoCanal;

  }

  public void show(){
    System.out.println("Volume: " + volume);
    System.out.println("Atualmente no canal:  "+canal);
    System.out.println("Modelo TV: " + nome);
  }

}