package practice2.q2;

public class StrongBox<E>{

    private E data;
    private long cnt;

    // 鍵の種類を表すフィールド
    private KeyType keyType;

    // 鍵の種類を受け取るコンストラクタ
    public StrongBox(KeyType kt){
        this.keyType = kt;
    }

    public void put(E data) {this.data = data;}

    // 試行回数をカウントしながらget()を返す
    public E get(){
        this.cnt++;
        if (this.keyType == KeyType.PADLOCK && this.cnt <= 1024){
            return null;
        } else if ( this.keyType == KeyType.BUTTON && cnt <= 10000 ){
            return null;
        } else if ( this.keyType == KeyType.DIAL && cnt <= 30000 ){
            return null;
        } else if ( this.keyType == KeyType.FINGER && cnt <= 1000000 ){
            return null;
        } else {
            this.cnt = 0;
            return this.data;
        }
    }

}

