import java.util.concurrent.ThreadLocalRandom;
public class GuerreiroFogo extends Guerreiro{
  
int min = 70;
int max = 110; 
  
int ataqueFogo = ThreadLocalRandom.current().nextInt(min, max + 1);
  
void ataqueFogo(){
  
   System.out.println("\n"+className+" ataca com Fogo! Dano: " +ataqueFogo);
  } 
}