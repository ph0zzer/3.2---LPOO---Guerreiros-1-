import java.util.concurrent.ThreadLocalRandom;
public class GuerreiroGelo extends GuerreiroAgua{


int min = 1;
int max = 2;
  
int ataqueGelo = ThreadLocalRandom.current().nextInt(min, max + 1) * atAgua;
  
void ataqueGelo(){

   System.out.println("\n"+className+" ataca com Gelo! Dano: " +ataqueGelo);
  } 
}