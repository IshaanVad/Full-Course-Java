package genericClasses;

public class myGenericClass <T, V> {

    T x;
    V y;

    myGenericClass(T x, V y) {
        this.x = x;
        this.y = y;
    }
    //public T getValue(){
        //return x;
//}
    public V getValue(){
        return y;
    }
}
