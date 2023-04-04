class Main {
  public static void main(String[] args) {

    Guerreiro G1 = new Guerreiro();

    G1.ataque();
    
    GuerreiroAgua A1 = new GuerreiroAgua();

    A1.ataqueAgua();

    GuerreiroFogo F1 = new GuerreiroFogo();

    F1.ataqueFogo();
    
    GuerreiroGelo Gelo1 = new GuerreiroGelo();

    Gelo1.ataqueGelo();


    Guerreiro[] Lista1 = new Guerreiro [4];

    Lista1[0] = G1;
    Lista1[1] = A1;
    Lista1[2] = F1;
    Lista1[3] = Gelo1;

    Lista1[1].ataque();
  }
}