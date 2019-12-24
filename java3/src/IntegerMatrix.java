public class IntegerMatrix extends GenericMatrix<Integer> {
    public static void main(String[] args) {
        Integer[][] m1 = new Integer[][]{{1,2,3},{4,5,6},{7,8,9}};
        Integer[][] m2 = new Integer[][]{{1,1,1},{2,2,2},{3,3,3}};
        IntegerMatrix integerMatrix = new IntegerMatrix();
        System.out.println("m1+m2 is: " );
        GenericMatrix.printResult(m1,m2,integerMatrix.addMatrix(m1,m2),'+');
        System.out.println("m1 * m2 is: ");
        GenericMatrix.printResult(m1,m2,integerMatrix.multiplyMatrix(m1,m2),'*');
    }
    @Override /** add two integers */
    protected Integer add(Integer o1, Integer o2){
        return o1 + o2;
    }
    @Override
    protected Integer multiply(Integer o1, Integer o2){
        return o1 * o2;
    }
    @Override
    protected Integer zero(){
        return 0;
    }

}
