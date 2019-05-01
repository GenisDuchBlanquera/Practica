
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

        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                _regions[x][y].tipusRegio('F');
            }
        }

    }

    public Rajola (String t) {


        _tipus=t;

        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                _regions[x][y].tipusRegio(' ');
            }
        }
    }


   public char orientacio(){
    char c='O';

    return c;
   }

   public void girar(){


   char _aux[][]=new char[5][5];

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