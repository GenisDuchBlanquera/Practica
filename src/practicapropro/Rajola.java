
/**
 *
 * @author adriafusterabassedas
 */

package practicapropro;

public class Rajola {


    private Regio _regions[][] = new Regio[5][5];
    private String _tipus;

    public Rajola() {


        _tipus="";

        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                _regions[x][y].tipusRegio("F");
            }
        }

    }

    public Rajola (String t) {


        _tipus=t;
        
        if(t.equals("CFCVC")){
            for(int i=0;i<5;i++){
                
                _regions[0][i].tipusRegio("F");
                _regions[1][i].tipusRegio("F");
                _regions[2][i].tipusRegio("C");
                _regions[3][i].tipusRegio("F");
                _regions[4][i].tipusRegio("V");
                  
            }     
        }
        
        else if(t.equals("XCCCC")){
            
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    _regions[i][j].tipusRegio("F");
                    
                }
            }
            
            for(int y=0;y<5;y++){
                _regions[2][y].tipusRegio("C");
                _regions[y][2].tipusRegio("C");
            }
            
            _regions[2][2].tipusRegio("X");
            
              
        }
        else if(t.equals("MFFFF")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    _regions[i][j].tipusRegio("F");
                    
                }
            }
            
            for(int y=1;y<4;y++){
                _regions[2][y].tipusRegio("M");
                _regions[y][2].tipusRegio("M");
            }
            
            
        }
        else if(t.equals("VVFFV")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    _regions[i][j].tipusRegio("V");
                    
                }
            }
            
            for(int y=1;y<5;y++){
                _regions[3][y].tipusRegio("F");
                _regions[4][y].tipusRegio("F");
            }
            
            _regions[3][2].tipusRegio("F");
            _regions[4][2].tipusRegio("F");
            _regions[4][1].tipusRegio("F");
            _regions[4][0].dividir_cela_regio("F");
            _regions[1][4].dividir_cela_regio("F");
            
            
            
        }
        else if(t.equals("MFFCF")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    _regions[i][j].tipusRegio("F");
                    
                }
            }
            
            for(int y=1;y<4;y++){
                _regions[2][y].tipusRegio("M");
                _regions[y][2].tipusRegio("M");
            }
            
            _regions[4][2].tipusRegio("C");
            
        }
    }


   public char orientacio(){
    char c='O';

    return c;
   }

   public void girar(){


   String _aux[][]=new String[5][5];

   for(int i=0;i<5;i++){
       for(int j=0;j<5;j++){
           _aux[i][j]=_regions[i][j].obttipus();

       }
   }

   for (int p=0;p<5;p++){
       _regions[4][p].tipusRegio(_aux[0][p]);
       _regions[3][p].tipusRegio(_aux[1][p]);
       _regions[2][p].tipusRegio(_aux[2][p]);
       _regions[1][p].tipusRegio(_aux[3][p]);
       _regions[0][p].tipusRegio(_aux[4][p]);
   }

}

   public void afegirSeguidor(int x, int y){
       _regions[x][y].afegirSeguidor();

   }


}