

public class Studybooks extends Books {
    public int numOfStudybooks;

    public Studybooks() {
        super();
    }
    public Studybooks(int bookID,String name,int type,double price,int quantity,boolean availability){
    super(bookID,name,type,price,quantity,availability);
    numOfStudybooks++;
}
    @Override
    public String toString(){
        return "Study book information is:"+super.toString();
    }
}
