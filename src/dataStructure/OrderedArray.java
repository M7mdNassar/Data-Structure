package dataStructure;

// find ()    using binary search
// delete ()
// insert ()
public class OrderedArray extends UnorderedArray {

    OrderedArray(int size){
        super(size);

    }


    public int find (int key){                    // find ()  using binary search
        int start = 0 , end = getnElements()-1 ;
        int mid = 0;
        while (start < end){
            mid= start + (end - start)/2 ;
            if (getArray()[mid] == key)
                return mid;
            else if (getArray()[mid] > key)
            {
                end = mid-1;
            }
            else
                start = mid+1;
        }
        return -1;

    }

    public boolean insert (int key) // be safety
    {
        if (nElements==this.getArray().length)
            return false;
        else {
            int i;
            for (i = 0; i < nElements; i++)  // traversal array to first greater element than key
                if (this.getArray()[i] > key)
                    break;

            for (int j = nElements; j > i; j--)  // shift elements
                this.getArray()[j] = this.getArray()[j - 1];

            this.getArray()[i] = key;
            nElements++;
            return true;
        }


    }


    public boolean delete (int key){
        if (nElements==0)
            return false;

        int index = find(key);
        if (index == -1)
            return false;
        else {
            for (int i = index ; i<nElements-1 ; i++){
                this.getArray()[i] = this.getArray()[i+1];
            }
            nElements--;
            return true;

        }


    }

    public int mostFrequentNumber()
    {
        int freq = 0 ;       // how many array have this value ?
        int index = -1 ;       // index of the most frequent number
        for (int i = 0; i < nElements ; i++) {
            int num = getArray()[i] ;
            int sum = 0 ;
            for (int j = 0; j < nElements ; j++) {   // search , how many this value(num) in array
                if( getArray()[j] == num )
                    sum++ ;
            }
            if( sum > freq ){       // update freq and ind if true
                freq = sum ;
                index = i ;
            }
        }

        return getArray()[index] ;
    }



    public static void main(String[] args) {
        OrderedArray or = new OrderedArray(8);

        or.insert(6);
        or.insert(3);
        or.insert(3);
        or.insert(3);
        or.insert(2);
        or.insert(1);
        or.display();
        or.delete(6);

        or.display();
        System.out.println(or.mostFrequentNumber());

    }


}
