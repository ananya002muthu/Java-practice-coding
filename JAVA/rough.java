import java.util.*;

class Matrix{

    private int row;
    private int column;
    private int[][] array;

    public void setRow(int row){

        this.row = row;
    }

    public int getRow()
    {
        return row;
    }

    public void setCol(int col){

        this.column = col;
    }

    public int getColumn(){
        return column;
    }
    public void setArray(int[][] array){

        int i , j ;

       // System.out.println("asdasd : " + row);
        this.array = new int[row][column];
        for(i = 0;i< row;i++){

            for(j=0;j< column;j++){

                this.array[i][j] = array[i][j];
            }
        }

    }

    public void add(Matrix m2){
        int i,j;

        int[][] array3;
        array3=new int[this.getRow()][this.getColumn()];
        for(i=0;i<row;i++){
        
            for(j=0;j<column;j++)
            {
            
               array3[i][j]=this.array[i][j] + m2.array[i][j];

               System.out.print(array3[i][j]+" ");
            }

            System.out.println();
        }
    }

 public void multiply(Matrix m2){

     int i,j,k;
     int sum;
     int[][] arrayMul;
     arrayMul=new int[this.getRow()][m2.getColumn()];
     for(i=0;i<this.getRow();i++){
        for(j=0;j<m2.getColumn();j++){

            sum=0;
            for(k=0;k<this.getColumn();k++){
                sum+=this.array[i][k]*m2.array[k][j];
            }
arrayMul[i][j]=sum;
System.out.print(arrayMul[i][j]+" ");
        }
        System.out.println();
     }
 }


    public void display(){

        int i , j ;

        for(i = 0;i< row;i++){

            for(j=0;j< column;j++){

                    System.out.print(array[i][j] + " ");            
                }

                System.out.println();
        }
    }
}


public class rough {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaration
        int r , c , i, j;

        int[][] array;

        System.out.println("Enter row : ");

        r = sc.nextInt();

        System.out.println("Enter col : ");

        c = sc.nextInt();

        array = new int[r][c];

        System.out.println("Enter array elements : ");

        for(i = 0;i< r;i++){

            for(j = 0;j< c;j++){

                array[i][j] = sc.nextInt();
            
            }
        }


        Matrix m1 = new Matrix();

        m1.setRow(r);
        m1.setCol(c);
        m1.setArray(array);
        m1.display();

        System.out.println("Enter row : ");

        r = sc.nextInt();

        System.out.println("Enter col : ");

        c = sc.nextInt();


        array = new int[r][c];

        System.out.println("Enter array elements : ");

        for(i = 0;i< r;i++){

            for(j = 0;j< c;j++){

                array[i][j] = sc.nextInt();
            
            }
        }

        Matrix m2 = new Matrix();

        m2.setRow(r);
        m2.setCol(c);
        m2.setArray(array);
        m2.display();

        if(m1.getRow()==m2.getRow()){
            if (m1.getColumn()==m2.getColumn())
            {
                System.out.println("can be added");
                m1.add(m2);
            }
        }
        else{
            System.out.println("cannot be added");
        }

        if(m1.getColumn()==m2.getRow()){
            
            System.out.println("can be multiple");
            m1.multiply(m2);
        }
        else{
            System.out.println("cannot be multiply");
        }
    }
}