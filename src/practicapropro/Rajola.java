
/**
 *
 * @author adriafusterabassedas
 */

package practicapropro;

public class Rajola {
    
    
    private String _regions[][] = new String[3][3];
    private int _x;
    private int _y;
    private String _tipus;

    public Rajola() {
        
        _y=0;
        _x=0;
        _tipus="";
        
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                _regions[x][y]="";
            }
        }
        
    }
    
    public Rajola (String t) {
        
        _y=0;
        _x=0;
        _tipus=t;
        
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                _regions[x][y]="";
            }
        }
    }
    
    
    
    
   public char orientacio(){
    char c='O';
    
    return c;
   }
   
   public void girar(){
       
   }
   
   public void posicio(int x, int y){
       
       
       
   }
   
   public void afegirSeguidor(){
       
   }
   
    
}
