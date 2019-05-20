
/**
 *
 * @author adriafusterabassedas
 */

package practicapropro;

public class Rajola {


    private Regio _regions[][] = new Regio[5][5]; /*!< Matriu de 5x5 que conte les regions de cada rajola  */
    private String _tipus; /*!< String que conte el tipus de rajola  */

    
    /** @pre: --
        @post: Constructor de rajola sense regions i _tipus buit
    */
    
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
    /** @pre: --
        @post: Constructor de rajola amb regions i amb _tipus
    */
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
            
            _regions[0][2].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
            _regions[3][2].afegirSeguidor();
            _regions[4][2].afegirSeguidor();
            
        }
        
        else if(_tipus.equals("XCCCC")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;
                }
            }
            
            for(int y=0;y<5;y++){
                _regions[2][y].tipusRegio("C");
                _regions[y][2].tipusRegio("C");
            }
        
            _regions[2][2].tipusRegio("X");
            
            _regions[0][0].afegirSeguidor();
            _regions[0][4].afegirSeguidor();
            _regions[4][0].afegirSeguidor();
            _regions[4][4].afegirSeguidor();
            
            _regions[0][2].afegirSeguidor();
            _regions[2][0].afegirSeguidor();
            _regions[2][4].afegirSeguidor();
            _regions[4][2].afegirSeguidor();
             
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
            
            _regions[0][2].afegirSeguidor();
            _regions[2][4].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
            _regions[4][0].afegirSeguidor();
        }
        
        else if(_tipus.equals("FVVFF")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;
                }
            }
            for(int y=0;y<4;y++){
                _regions[0][y].tipusRegio("V");
                _regions[y][4].tipusRegio("V");
            }
            _regions[0][0].dividir_cela_regio();
            _regions[0][4].dividir_cela_regio();
            _regions[4][4].dividir_cela_regio(); 
            
            _regions[0][2].afegirSeguidor();
            _regions[2][4].afegirSeguidor();
            _regions[3][1].afegirSeguidor();
            
            
            
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
            _regions[2][2].tipusRegio("X");
            
            _regions[0][2].afegirSeguidor();
            _regions[1][2].afegirSeguidor();
            _regions[2][0].afegirSeguidor();
            _regions[2][4].afegirSeguidor();
            _regions[4][0].afegirSeguidor();
            _regions[4][2].afegirSeguidor();
            _regions[4][4].afegirSeguidor();
            
            
        }
        
         else if (_tipus.equals("CVCCF")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;  
                }
            }
            
            for(int y=0;y<5;y++){
                _regions[0][y].tipusRegio("V");
            }
            
            for(int p=2;p<5;p++){
                _regions[2][p].tipusRegio("C");
                _regions[p][2].tipusRegio("C");
            }
            
            _regions[0][0].dividir_cela_regio();
            _regions[0][4].dividir_cela_regio();
            
            _regions[0][2].afegirSeguidor();
            _regions[2][0].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
            _regions[4][4].afegirSeguidor();
            
        }
         
         else if(_tipus.equals("VFEFV")){ //S'ha de descomentar l'escut
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("V");
                    _regions[i][j]=r;   
                }
            }
            
            for(int y=0;y<5;y++){
                _regions[0][y].tipusRegio("F");
                _regions[4][y].tipusRegio("F"); 
            }
            
            _regions[0][0].dividir_cela_regio();
            _regions[0][4].dividir_cela_regio();
            _regions[4][0].dividir_cela_regio();
            _regions[4][4].dividir_cela_regio();
            
           // _regions[2][2].tipusRegio("E");  
           
           _regions[0][2].afegirSeguidor();
           _regions[2][1].afegirSeguidor();
           _regions[4][2].afegirSeguidor();
           
           _regions[2][4].posar_bonificacio();
          
        }
         
        else if(_tipus.equals("VVVCV")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("V");
                    _regions[i][j]=r;   
                }
            }
            for(int y=0;y<5;y++){
                _regions[4][y].tipusRegio("F");
            }
            _regions[4][2].tipusRegio("C");
            _regions[4][0].dividir_cela_regio();
            _regions[4][4].dividir_cela_regio();
            
            _regions[1][2].afegirSeguidor();
            _regions[4][1].afegirSeguidor();
            _regions[4][2].afegirSeguidor();
            _regions[4][3].afegirSeguidor();
            
        }
        else if(_tipus.equals("VVFVF")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("V");
                    _regions[i][j]=r;   
                }
            }
            
            for(int y=0;y<5;y++){
                _regions[y][0].tipusRegio("F");
                _regions[y][4].tipusRegio("F"); 
            }
            
            _regions[0][0].dividir_cela_regio();
            _regions[0][4].dividir_cela_regio();
            _regions[4][0].dividir_cela_regio();
            _regions[4][4].dividir_cela_regio();
            
            _regions[2][2].afegirSeguidor();
            _regions[2][0].afegirSeguidor();
            _regions[2][4].afegirSeguidor();
            
        }
        
        else if(_tipus.equals("XFCCC")){
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
            _regions[2][2].tipusRegio("X");
            
            _regions[0][2].afegirSeguidor();
            _regions[2][0].afegirSeguidor();
            _regions[2][4].afegirSeguidor();
            _regions[4][0].afegirSeguidor();
            _regions[4][2].afegirSeguidor();
            _regions[4][4].afegirSeguidor();
            
            _regions[4][4].posar_bonificacio();
        }

        else if(_tipus.equals("VVVFV")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("V");
                    _regions[i][j]=r;   
                }
            }
            for(int y=0;y<5;y++){
                _regions[4][y].tipusRegio("F");
            }
            _regions[4][0].dividir_cela_regio();
            _regions[4][4].dividir_cela_regio();
        }
        
        else if(_tipus.equals("FVFFF")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;   
                }
            }
            
            for(int y=0;y<5;y++){
                _regions[0][y].tipusRegio("V");
            }
            _regions[0][0].dividir_cela_regio();
            _regions[0][4].dividir_cela_regio();
            
            _regions[0][2].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
            
            _regions[4][4].posar_bonificacio();
             
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
            
            _regions[0][0].afegirSeguidor();
            _regions[1][1].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
            _regions[4][4].afegirSeguidor();
            
            
        }
        
        else if(_tipus.equals("VVFFV")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;          
                }
            }
            for(int y=0;y<5;y++){
                _regions[0][y].tipusRegio("V");
                _regions[y][0].tipusRegio("V");
            }
            
            
            _regions[4][0].dividir_cela_regio();
            _regions[4][0].dividir_cela_regio();
            
            _regions[0][0].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
 
        }
        
        else if(_tipus.equals("CCFCF")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;
                    
                }
            }
            for(int y=0;y<5;y++){
                _regions[y][2].tipusRegio("C");
            }
            
            _regions[2][0].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
            _regions[2][4].afegirSeguidor();
            
            _regions[4][4].posar_bonificacio();
        }
        
        else if(_tipus.equals("CFFCC")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;
                    
                }
            }
            for(int y=2;y<5;y++){
                _regions[y][2].tipusRegio("C");
            }
            for(int y=0;y<3;y++){
                _regions[2][y].tipusRegio("C");
            }
            _regions[4][0].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
            _regions[4][0].afegirSeguidor();
            
            _regions[4][4].posar_bonificacio();
        }
        
        else if(_tipus.equals("FVFVF")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;
                    
                }
            }
            for(int y=0;y<5;y++){
                _regions[0][y].tipusRegio("V");
                _regions[4][y].tipusRegio("V");
            }
            _regions[0][0].dividir_cela_regio();
            _regions[0][4].dividir_cela_regio();
            _regions[4][0].dividir_cela_regio();
            _regions[4][4].dividir_cela_regio();
            
            _regions[0][2].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
            _regions[4][2].afegirSeguidor();
            
        }
        
        else if(_tipus.equals("MFFFF")){
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    
                    Regio r= new Regio();
                    r.tipusRegio("F");
                    _regions[i][j]=r;
                    
                }
            }
            for(int y=1;y<4;y++){
                _regions[2][y].tipusRegio("M");
                _regions[2][y].tipusRegio("M");
            }
            
            _regions[0][2].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
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
            
            _regions[0][2].afegirSeguidor();
            _regions[2][2].afegirSeguidor();
            _regions[4][2].afegirSeguidor();
            
        }
        
        
        
        
    }
    /** @pre: --
        @post: Gira la rajola 90 graus
    */
  public void girar(){


   String _aux[][]=new String[5][5];

   for(int i=0;i<5;i++){
       for(int j=0;j<5;j++){
           _aux[i][j]=_regions[i][j].obttipus();

       }
   }

   // Traverse each cycle 
    for (int i = 0; i < 5 / 2; i++) 
    { 
        for (int j = i; j < 5 - i - 1; j++) 
        { 

            // Swap elements of each cycle 
            // in clockwise direction 
            Regio temp = _regions[i][j]; 
            _regions[i][j] = _regions[5 - 1 - j][i]; 
            _regions[5 - 1 - j][i] = _regions[5 - 1 - i][5 - 1 - j]; 
            _regions[5 - 1 - i][5 - 1 - j] = _regions[j][5 - 1 - i]; 
            _regions[j][5 - 1 - i] = temp; 
        } 
    }

}
    /** @pre: --
        @post: Dona la possibilitat de posar-hi un seguidor a una regio de la rajola
    */
   public void afegirSeguidor(int x, int y){
       _regions[x][y].afegirSeguidor();

   }
    /** @pre: --
        @post: Retorna String _tipus 
    */
   public String tipus(){
       
       return _tipus;
       
   }
    /** @pre: --
        @post: Iguala la rajola amb els mateixos valors que la rajola entrada per parametre 
    */
   public void copia(Rajola r) {

        _tipus = r.tipus();

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                _regions[x][y].igualar(r.reg(x, y));
            }
        }

    }
   
    /** @pre: --
        @post: Retorna la regio que hi ha una posicio de la rajola
    */
   
   public Regio reg(int x, int y) {

        return _regions[x][y];

    }
   
   
 }