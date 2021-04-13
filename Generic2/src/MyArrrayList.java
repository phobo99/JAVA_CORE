public class MyArrrayList<T> {
    private T array;

    public MyArrrayList(T array) {
        this.array = array;
    }
    public MyArrrayList(){

    }

    public T getArray() {
        return array;
    }

    public void setArray(T array) {
        this.array = array;
    }
    public void add(T array){
        this.array = array;
    }
    public T printElement(){
        return  array;
    }
}
