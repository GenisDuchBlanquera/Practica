
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
                Regio r= new Regio();
                r.tipusRegio("T");
                _regions[x][y]=r;
            }
        }

    }

    public Rajola (String t) {


        _tipus=t;
        
        if(t.equals("CFCVC")){
            for(int i=0;i<5;i++){
                
                Regio r= new Regio();
                r.tipusRegio("F");
                _regions[0][i]=r;
         
                Regio r1= new Regio();
                r1.tipusRegio("F");
                _regions[1][i]=r1;

                Regio r2= new Regio();
                r2.tipusRegio("C");
                _regions[2][i]=r2;

                Regio r3= new Regio();
                r3.tipusRegio("F");
                _regions[3][i]=r3;
       
                Regio r4= new Regio();
                r4.tipusRegio("V");
                _regions[4][i]=r4;
 
                  
            }     
        }
        
        else if(t.equals("XCCCC")){
            
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;
                    
                }
            }
            //aqui ja no cal anar creant les regions perque ja estan creades, nomes és modifiquen
            for(int y=0;y<5;y++){
                _regions[2][y].tipusRegio("C");
                _regions[2][y].tipusRegio("C");
           
            }
        
            _regions[2][2].tipusRegio("X");
            
            
              
        }
        else if(t.equals("MFFFF")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;
                    
                }
            }
            //aqui ja no cal anar creant les regions perque ja estan creades, nomes és modifiquen
            for(int y=1;y<4;y++){
                _regions[2][y].tipusRegio("M");
                _regions[2][y].tipusRegio("M");
            }
            
            
        }
        else if(t.equals("VVFFV")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    Regio r= new Regio();
                    r.tipusRegio("V");
                    _regions[i][j]=r;          
                }
            }
            //aqui ja no cal anar creant les regions perque ja estan creades, nomes és modifiquen
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
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;      
                }
            }
            //aqui ja no cal anar creant les regions perque ja estan creades, nomes és modifiquen
            for(int y=1;y<4;y++){
                _regions[2][y].tipusRegio("M");
                _regions[y][2].tipusRegio("M");
            }
            
            _regions[4][2].tipusRegio("C");
            
        }
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