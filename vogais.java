
/**
 * contar a quantidade de vogais em um arquivo.
 * 
 * @author (Marcos Roberto do Nascimento Junior) 
 * @version (1.0)
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class vogais
{
    
    public static void main(String[ ] argv) {
        
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        FileInputStream arq_leitura = null;
        FileOutputStream arq_gravacao = null;
        try {
        arq_leitura = new FileInputStream("prog3.txt");
        arq_gravacao = new FileOutputStream("novoprog3.txt");
        int carac;
        System.out.printf("texto: \n");
          while ((carac = arq_leitura.read()) != -1) {
          arq_gravacao.write(carac);
          System.out.printf("%c",carac);
          switch(carac){
            case 'a'://verificar letras minúsculas
            //case 'A': verificar letras maiúsculas.
            a++;
            break;
            case 'e':
           // case 'E':
            e++;
            break;
            case 'i':
           // case 'I':
            i++;
            break;
            case 'o':
           // case 'O':
            o++;
            break;
            case 'u':
           // case 'U':
            u++;
            break;
            }
          }
           if(a < 2){//essa parte para verificar se tem 0 ou 1 vogal e colocar no singular,se tiver mais colocar no plural.
              System.out.printf("\ntem %d vogal 'a'\n",a);
            }else{
            System.out.printf("\ntem %d vogais 'a'\n",a);
          }if(e < 2){
              System.out.printf("\ntem %d vogal 'e'\n",e);
            }else{
            System.out.printf("\ntem %d vogais 'e'\n",e);
          }
           if(i < 2){
              System.out.printf("\ntem %d vogal 'i'\n",i);
            }else{
            System.out.printf("\ntem %d vogais 'i'\n",i);
          }
          if(o < 2){
              System.out.printf("\ntem %d vogal 'o'\n",o);
            }else{
            System.out.printf("\ntem %d vogais 'o'\n",o);
          }
          if(u < 2){
              System.out.printf("\ntem %d vogal 'u'\n",u);
            }else{
            System.out.printf("\ntem %d vogais 'u'\n",u);
          }
        
        }catch (IOException b) {
        System.out.println("Erro de IO.\nMas qual???");
        
        
        }
    } 
}
