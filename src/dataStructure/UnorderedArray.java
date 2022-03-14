package dataStructure;

public class UnorderedArray {

    private int []array;
    protected int nElements;

    public int[] getArray() {
        return array;
    }

    public int getnElements() {
        return nElements;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setnElements(int nElements) {
        this.nElements = nElements;
    }

    UnorderedArray(int size){           //constructor
        array = new int [size];
        nElements = 0 ;

    }

    public int find (int key){

        for (int i = 0 ; i<nElements ; i++ )
            if (array[i] == key)
                return i;

        return -1;

    }
    public boolean insert (int key ){
        if (nElements == array.length)
            return false;
        else
            array[nElements++] = key;
        return true;

    }

    public boolean delete( int key )
    {
        if( nElements == 0 )
            return false ;
        else
        {
            int n = find(key);
            nElements-- ;
            for (int i = n ; i < nElements ; i++) {
                array[i] = array[i+1] ;
            }

            return true ;
        }
    }

    public void display()
    {
        System.out.print("Array : ");
        for (int i = 0; i < nElements ; i++) {
            System.out.print( array[i] +" " );
        }
        System.out.println("");
    }

    public boolean insertByIndex (int index , int key ){
        if (array.length == nElements)
            return false;

        else if (index < 0 || index>= array.length)
            return false;
        else
        {

            for(int i = nElements ; i >= index ; i--){
                array[i] = array[i-1];
            }
            array[index] = key ;
            nElements++ ;
            return true ;
        }

    }
    public boolean deleteByIndex( int index )
    {
        if ( 0 == nElements)
            return false;
        else if( index >= array.length || index < 0 )
            return false ;
        else
        {
            -- nElements ;
            for (int i = index ; i < nElements ; i++) {
                array[i] = array[i+1] ;
            }
            return true ;
        }
    }



    public static void main(String[] args) {

        UnorderedArray ua = new UnorderedArray(7);
        ua.insert(3);
        ua.insert(5);
        ua.insert(8);
        ua.insert(4);
        ua.insert(11);
        ua.insert(33);
        ua.insert(1);
        ua.display();
        ua.delete(5);
        ua.display();
        ua.delete(1);
        ua.delete(33);

        ua.display();
        int v = ua.find(33);
        if( v == -1 )
            System.out.println("Not Found !");
        else
            System.out.println("Founded");
        v = ua.find(11);
        if( v == -1 )
            System.out.println("Not Found !");
        else
            System.out.println("Founded");

        // test Problems
        ua.display();
        ua.deleteByIndex(2);
        ua.display();

        ua.insertByIndex(2, 4);
        ua.display();
        ua.delete(3);
        ua.delete(11);
        ua.display();
        System.out.println( ua.insertByIndex(55, 123) );
        System.out.println(ua.nElements);






    }
}
