import java.util.concurrent.ThreadLocalRandom;
public class GuerreiroAgua extends Guerreiro{
  
int min = 50;
int max = 130; 
  
int atAgua = ThreadLocalRandom.current().nextInt(min, max + 1);
  
void ataqueAgua(){
  
   System.out.println("\n"+className+" ataca com Água! Dano: " + atAgua);
  } 
}