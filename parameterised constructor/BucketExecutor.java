class BucketExecutor {

    public static void main(String[] args) {

        Bucket b1 = new Bucket();
        b1.brand="Cello";
        b1.color="Blue";
        b1.capacity=20;
        b1.price=200;
        b1.handle=true;

        System.out.println(b1.brand+" "+b1.color+" "+b1.capacity+" "+b1.price+" "+b1.handle);

        Bucket b2 = new Bucket("Milton","Red",25,300,true);

        System.out.println(b2.brand+" "+b2.color+" "+b2.capacity+" "+b2.price+" "+b2.handle);

        
    }
}