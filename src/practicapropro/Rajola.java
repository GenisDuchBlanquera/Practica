
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
        
        if(_tipus.equals("CFCVC")){
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
            _regions[4][0].dividir_cela_regio();
            _regions[4][4].dividir_cela_regio();
            
        }
        
        else if(_tipus.equals("XCCCC")){
            
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
        else if(_tipus.equals("CVFCC")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;
                    
                }
            }
            
            
            for(int y=0;y<4;y++){
                _regions[0][y].tipusRegio("V");
            }
            
            for(int z=0;z<3;z++){
                _regions[2][z].tipusRegio("C");
            }
            for(int q=2;q<5;q++){
                _regions[q][2].tipusRegio("C");
            }
            
            _regions[0][0].dividir_cela_regio();
            _regions[0][4].dividir_cela_regio();
            
            
            
        }
        else if(_tipus.equals("XVCCC")){
            
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;
                    
                }
            }
            
            for(int y=0;y<5;y++){
                _regions[2][y].tipusRegio("C");
            }
            _regions[3][2].tipusRegio("C");
            _regions[4][2].tipusRegio("C");
            
            
            for(int z=0;z<5;z++){
                _regions[0][z].tipusRegio("V");
            }
            
            _regions[0][0].dividir_cela_regio();
            _regions[0][4].dividir_cela_regio();
            
            
        }
        
               
        
        else if(_tipus.equals("MFFFF")){
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
        else if(_tipus.equals("VVFFV")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;          
                }
            }
            //aqui ja no cal anar creant les regions perque ja estan creades, nomes és modifiquen
            for(int y=0;y<5;y++){
                _regions[0][y].tipusRegio("V");
                _regions[y][0].tipusRegio("V");
            }
            
            
            _regions[4][0].dividir_cela_regio();
            _regions[1][4].dividir_cela_regio();
            
            
            
        }
        else if(_tipus.equals("MFFCF")){
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
        
        else if(_tipus.equals("VVCCV")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;      
                }
            }
            for(int y=0;y<5;y++){
                _regions[y][0].tipusRegio("V");
                _regions[0][y].tipusRegio("V");
            }
            
            for(int z=2;z<5;z++){
                _regions[z][0].tipusRegio("V");
                _regions[0][z].tipusRegio("V");
            }
            
            _regions[4][0].dividir_cela_regio();
            _regions[1][4].dividir_cela_regio();
            
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