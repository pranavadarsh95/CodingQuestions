package CommonCodes;

import java.util.Arrays;
import java.util.Comparator;

class Matrix{
    int row;
    int col;

    Matrix(int row,int col){
        this.row = row;
        this.col = col;
    }

    void getData(int row,int col){
        this.row = row;
        this.col = col;
    }

    void print(){
        System.out.println("The Row of matrix is as:- "+this.row+" "+"The column is as:- "+this.col+" "+" sum =>"+(this.row+this.col));
    }
}


public class FirstCode {
    public static  void  main(String []args){
        Matrix m[] = new Matrix[6];
        m[0] = new Matrix(5,6);
        m[1] = new Matrix(15,16);
        m[2] = new Matrix(35,46);
        m[3] = new Matrix(65,62);
        m[4] = new Matrix(59,62);
        m[5] = new Matrix(45,76);

        Matrix[] m1 = {new Matrix(5,6),new Matrix(5,6)};

        for(Matrix t:m){
            t.print();
        }

        System.out.println();
        Arrays.sort(m,new Comparator<Matrix>(){
           public int compare(Matrix a,Matrix b){
               /* If a < b then already increasing order so don't do any thing return -1
                  If a > b means need to change as increasing order then return 1(chota ko pehle karo)
                */

              if((a.col+a.row) < (b.col+b.row))
                  return -1;
              else
                  return 1;
           }
        });

        for(Matrix t:m){
            t.print();
        }
    }
}
