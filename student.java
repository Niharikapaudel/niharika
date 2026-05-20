abstract class student {
    String name;
    int roll;
    double fee;
student(String name, int roll, double fee ){
    this.name=name;
    this.roll=roll;
    this.fee=fee;
}
abstract void attendclass();
abstract void giveExam();
void payfee(){
    System.out.println("fee paid"+fee);
}
}