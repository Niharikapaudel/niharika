
public class studentCEIV extends  student{

    public studentCEIV(String name, int roll, double fee) {
     super(name,roll,fee);
   }

    @Override
    void attendclass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    void giveExam() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

   
    public static void main(String[] args)
    {
        studentCEIV s1=new studentCEIV("abc",8,5000);
        s1.attendclass();
        s1.giveExam();
        s1.payfee();
    }
}
