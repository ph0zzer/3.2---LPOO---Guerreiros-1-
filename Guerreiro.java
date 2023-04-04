import java.util.concurrent.ThreadLocalRandom;
public class Guerreiro{

  String className = this.getClass().getSimpleName();  
  int min = 10;
  int max = 99;  
  int ataque = ThreadLocalRandom.current().nextInt(min, max + 1);
  
void ataque(){
 System.out.println("\n"+className+" ataca com espada! Dano: " +ataque);
 }
}